package Animals;

import Enums.Food;

import java.util.List;

public abstract class BigCat extends Animal {
    public BigCat() {
        eats= List.of(Food.STEAK, Food.CELERY);
        lifeExpectancy=24;
    }
    public abstract void stroked();
}
