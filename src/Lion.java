public class Lion extends BigCat{
    public Lion() {

        super.health=10;
        super.gender=(int)(Math.random()*2)==1?Gender.MALE:Gender.FEMALE;
        super.animalType=AnimalType.LION;
    }
    @Override
    public void treat() {
        stroked();
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
    }

    @Override
    public void stroked() {
            super.health+=3;
    }
}
