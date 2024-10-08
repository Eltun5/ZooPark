package Animals;

import Enums.AnimalType;
import Enums.Food;

import java.util.List;

public class Giraffe extends Animal {
    public Giraffe() {
        super.lifeExpectancy=24;
        super.eats= List.of(Food.HAY,Food.FRUIT);
        super.animalType= AnimalType.GIRAFFE;
    }
    @Override
    public void treat() {
        neckMassage();
        System.out.println(animalType+" neck massage hp is "+health+".");
    }

    public void neckMassage(){
        super.health+=4;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        super.age++;
    }
}