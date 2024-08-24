package Animals;

import Enums.AnimalType;

public class Chimpanzee extends APE{
    public Chimpanzee() {
        super.lifeExpectancy=24;
        super.animalType= AnimalType.CHIMPANZEE;
    }
    @Override
    public void treat() {
        playChase();
        System.out.println(animalType+" play chess hp is "+health+".");
    }

    public void playChase(){
        super.health+=4;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        super.age++;
    }
}
