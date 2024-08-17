import java.util.List;

public class Bear extends Animal {
    public Bear(){
        super.lifeExpectancy=18;
        super.eats= List.of(Food.FISH,Food.STEAK);
        super.animalType=AnimalType.BEAR;
    }
    public void print(){
        System.out.println(super.FullImg);
    }
    @Override
    public void treat() {
        hug();
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
