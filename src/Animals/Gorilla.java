package Animals;

import Enums.AnimalType;

public class Gorilla extends APE {
    public Gorilla() {
        super.lifeExpectancy=32;
        super.animalType= AnimalType.GORILLA;
    }
    @Override
    public void treat() {
        painting();
        System.out.println(animalType+" painting hp is "+health+".");
    }

    public void painting(){
        super.health+=4;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        super.age++;
    }
}
