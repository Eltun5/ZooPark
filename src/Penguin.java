import java.util.List;

public class Penguin extends Animal{
    public Penguin(){
        super.lifeExpectancy=15;
        super.eats= List.of(Food.FISH,Food.ICE_CREAM);
        super.animalType=AnimalType.PENGUIN;
    }
    @Override
    public void treat() {
        watchAFilm();
    }

    public void watchAFilm(){
        super.health+=2;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        //eat();
        //clean waste
    }
}
