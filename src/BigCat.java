import java.util.List;

public abstract class BigCat extends Animal{
    public BigCat() {
        eats= List.of(Foods.STEAK,Foods.CELERY);
        lifeExpectancy=24;
    }
    public abstract void stroked();
}
