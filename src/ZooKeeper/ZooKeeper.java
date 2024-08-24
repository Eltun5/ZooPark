package ZooKeeper;

import Animals.Animal;
import Other.Enclosure;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ZooKeeper {
    private Enclosure enclosure;
    protected String name;

    public ZooKeeper(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public void aMonthPassed(){
        enclosure.getHasAnimals().stream().sorted(Comparator.comparing(Animal::getHealth))
                .limit(2).toList().forEach(Animal::treat);
        enclosure.removeWaste(20);
        if (enclosure.getFoodStore().hasFood(enclosure.getAnimalType().getFirstEat())){
            enclosure.getFoodStore().addFood(enclosure.getAnimalType().getFirstEat(),20);
        }
        else if (enclosure.getFoodStore().hasFood(enclosure.getAnimalType().getSecondEat())){
            enclosure.getFoodStore().addFood(enclosure.getAnimalType().getSecondEat(),20);
        }
        enclosure.getHasAnimals().stream().filter(animal -> animal.getHealth()>10).forEach(animal -> animal.setHealth(10));
    }
}
