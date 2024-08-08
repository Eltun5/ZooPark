import java.util.List;

public abstract class APE extends Animal{
    public APE() {
        eats=List.of(Food.FRUIT, Food.ICE_CREAM);
    }
}
