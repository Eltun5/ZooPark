import java.util.List;

public class Giraffe extends Animal{
    public Giraffe() {
        super.img= """
                     .-",
                     `~||
                       ||___
                       (':.)`
                       || ||
                       || ||
                       ^^ ^^""";
        super.lifeExpectancy=24;
        super.eats= List.of(Food.HAY,Food.FRUIT);
        super.animalType=AnimalType.GIRAFFE;
    }
    @Override
    public void treat() {
        neckMassage();
    }

    public void neckMassage(){
        super.health+=4;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        //eat();
        //clean waste
    }
}