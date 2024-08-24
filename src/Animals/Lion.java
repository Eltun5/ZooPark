package Animals;

import Enums.AnimalType;
import Enums.Gender;

public class Lion extends BigCat {
    public Lion() {

        super.health=10;
        super.gender=(int)(Math.random()*2)==1? Gender.MALE:Gender.FEMALE;
        super.animalType= AnimalType.LION;
    }
    @Override
    public void treat() {
        stroked();
        System.out.println(animalType+" stroked hp is "+health+".");
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        super.age++;
    }

    @Override
    public void stroked() {
            super.health+=3;
    }
}
