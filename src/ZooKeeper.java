import java.util.Comparator;
import java.util.stream.Collectors;

public class ZooKeeper {
    private Enclosure enclosure;

    public ZooKeeper(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public void aMonthPassed(){
        enclosure.hasAnimals.stream().sorted(Comparator.comparing(Animal::getHealth))
                .limit(2).toList().forEach(Animal::treat);
        enclosure.removeWaste(20);
        if (enclosure.foodStore.hasFood(enclosure.getAnimalType().getFirstEat())){
            enclosure.foodStore.addFood(enclosure.getAnimalType().getFirstEat(),20);
        }
        else if (enclosure.foodStore.hasFood(enclosure.getAnimalType().getSecondEat())){
            enclosure.foodStore.addFood(enclosure.getAnimalType().getSecondEat(),20);
        }
        enclosure.hasAnimals.stream().filter(animal -> animal.getHealth()>10).forEach(animal -> animal.setHealth(10));
    }
}
