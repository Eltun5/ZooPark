package Animals;

import Enums.AnimalType;
import Enums.Food;

import java.util.List;

public class Penguin extends Animal {
    public Penguin(){
        super.lifeExpectancy=15;
        super.eats= List.of(Food.FISH,Food.ICE_CREAM);
        super.animalType= AnimalType.PENGUIN;
    }
    @Override
    public void treat() {
        watchAFilm();
        System.out.println(animalType+" watch a film hp is "+health+".");
    }

    public void watchAFilm(){
        super.health+=2;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        super.age++;
    }
}
