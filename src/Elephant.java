import java.util.List;

public class Elephant extends Animal{
    public Elephant() {
        super.lifeExpectancy=36;
        super.eats= List.of(Food.HAY,Food.FRUIT);
        super.animalType=AnimalType.ELEPHANT;
    }
    public void print(){
        System.out.println(super.FullImg);
    }
    @Override
    public void treat() {
        bath();
    }

    public void bath(){
        super.health+=5;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        //eat();
        //clean waste
    }
}
