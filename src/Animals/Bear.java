package Animals;

import Enums.AnimalType;
import Enums.Food;

import java.util.List;

public class Bear extends Animal {
    public Bear(){
        super.lifeExpectancy=18;
        super.eats= List.of(Food.FISH, Food.STEAK);
        super.animalType= AnimalType.BEAR;
    }
    public void print(){
        System.out.println(super.FullImg);
    }
    @Override
    public void treat() {
        hug();
        System.out.println(animalType+" hug hp is "+health+".");
    }

    public void hug(){
        super.health+=3;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        super.age++;
    }
}
