import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    int waste;
    List<Animal> hasAnimals=new ArrayList<>();
    AnimalType animalType;
    private final int numOfEnclosure;
    private static int counterOfEnclosure=0;
    final FoodStore foodStore;
    public Enclosure(AnimalType animalType) {
        this.animalType = animalType;
        numOfEnclosure=++counterOfEnclosure;
        foodStore=new FoodStore(numOfEnclosure);
    }

    public int getNumOfEnclosure() {
        return numOfEnclosure;
    }

    public void add(Animal... animals){
        if (hasAnimals.size()+animals.length<8) {
            hasAnimals.stream()
                    .filter(animal -> animal.animalType.equals(animalType))
                    .forEach(animal -> hasAnimals.add(animal));
        }else {
            System.out.println("No empty space limit is 8 you try "+hasAnimals.size()+animals.length+".");
        }
    }
    public void removeAnimal(Animal animal){
        if (animal!=null){
        hasAnimals.remove(animal);}
        else{
            System.out.println("You cannot remove null animal.");
        }
    }
    public void getIMG(){
        System.out.println();
    }
    public void removeWaste(int waste){
        this.waste-=waste;
        if (this.waste<0){
            this.waste=0;
        }
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
        hasAnimals.forEach(animal -> waste+=animal.eat(
                        foodStore.hasFood(animalType.getFirstEat())?
                        foodStore.takeFood(animalType.getFirstEat()):
                        foodStore.hasFood(animalType.getSecondEat())?
                        foodStore.takeFood(animalType.getSecondEat()): null
                ));
        hasAnimals.forEach(animal -> {
            if (animal.lifeExpectancy==animal.age) {
                hasAnimals.remove(animal);
                System.out.println(animalType+" is dead.");
            }
        });
    }
}