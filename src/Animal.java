import java.util.List;
public abstract class Animal {
    protected int lifeExpectancy;
    protected int health;
    protected List<Foods> eats;
    protected Gender gender;
    protected int age;
    protected String img;
    public abstract String getImg();
    public abstract int getAge();
    public abstract Gender getGender();
    public abstract int getLifeExpectancy();
    public abstract boolean canEat(String foodName);
    public abstract void eat();
    public abstract void decreaseHealth();
    public abstract void treat();
    public abstract void aMonthPasses();
}
