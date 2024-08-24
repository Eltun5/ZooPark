package Other;

import Animals.Animal;
import Enums.AnimalType;
import ZooKeeper.ZooKeeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ZooKeeper.*;

public class Enclosure {
    int waste;
    public static int animalNum;
    private List<Animal> hasAnimals=new ArrayList<>();
    private final AnimalType animalType;
    private final int numOfEnclosure;
    private static int counterOfEnclosure=0;
    private final FoodStore foodStore;
    private ZooKeeper zooKeeper;

    public List<Animal> getHasAnimals() {
        return hasAnimals;
    }


    public Enclosure(AnimalType animalType) {
        this.animalType = animalType;
        numOfEnclosure=++counterOfEnclosure;
        foodStore=new FoodStore(numOfEnclosure);
        if ("Zookeeper".equals(animalType.getKeeperType())){
            zooKeeper=new ZooKeeper(this);
        } else if ("PlayKeeper".equals(animalType.getKeeperType())) {
            zooKeeper=new PlayZooKeeper(this);
        }else {
            zooKeeper=new PhysioZooKeeper(this);
        }
    }
    public AnimalType getAnimalType() {
        return animalType;
    }

    public int getNumOfEnclosure() {
        return numOfEnclosure;
    }

    public void add(Animal... animals){
        if (hasAnimals.size()+animals.length<=20) {
            animalNum+=animals.length;
            Arrays.stream(animals)
                    .filter(animal -> animal.getAnimalType()==this.animalType)
                    .forEach(animal -> hasAnimals.add(animal));
        }
    }
    public void removeAnimal(Animal animal){
        if (animal!=null){
        hasAnimals.remove(animal);}
        else{
            System.out.println("You cannot remove null animal.");//we can make optional
        }
    }
    public void removeWaste(int waste){
        this.waste-=waste;

        if (this.waste<0){
            this.waste=0;
        }
        System.out.println(numOfEnclosure+". enclosure have "+this.waste+" waste.");
    }
    public void addWaste(int waste){
        this.waste+=waste;
    }
    public int getWasteSize(){
        return this.waste;
    }
    public FoodStore getFoodStore(){
        return foodStore;
    }
    public int size(){
        return hasAnimals.size();
    }
    public void aMonthPasses(){
        hasAnimals.forEach(Animal::aMonthPasses);
        hasAnimals.forEach(animal -> {
            waste += animal.eat(
                    foodStore.hasFood(animalType.getFirstEat()) ?
                            foodStore.takeFood(animalType.getFirstEat()) :
                            foodStore.hasFood(animalType.getSecondEat()) ?
                                    foodStore.takeFood(animalType.getSecondEat()) : null
            );
            animal.setAge(animal.getAge()+1);
        });
        int size=hasAnimals.size();
        for (int i = 0; i < size; i++) {
            if (hasAnimals.get(i).getLifeExpectancy()==hasAnimals.get(i).getAge()||hasAnimals.get(i).getHealth()<=0) {
                hasAnimals.remove(i);
                i--;
                size--;
                System.out.println(animalType+" is dead.");
            }
        }
        zooKeeper.aMonthPassed();
        System.out.printf("""
                                                  %s enclosure %s
                Animals:%s
                Waste:%s
                """,numOfEnclosure,animalType,hasAnimals.size(),waste);
    }
}