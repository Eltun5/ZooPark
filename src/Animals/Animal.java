package Animals;

import Enums.AnimalType;
import Enums.Food;
import Enums.Gender;
import java.util.List;
public abstract class Animal {
    protected int lifeExpectancy;
    protected int health=10;
    protected List<Food> eats;
    protected Gender gender;
    protected int age=0;
    protected AnimalType animalType;
    protected String FullImg;
    public Animal() {
        this.gender=(int)(Math.random()*2)==1? Gender.MALE: Gender.FEMALE;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public Gender getGender(){
        return gender;
    }
    public int getLifeExpectancy(){
        return lifeExpectancy;
    }
    public boolean canEat(Food foodName){
        return eats.contains(foodName);
    }
    public int eat(Food food){
        if (food!=null){
            health+= food.getHealth();
            System.out.println(animalType+" eat "+food+" hp is "+health+".");
            return food.getWaste();

        }
        return 0;
    }
    public void decreaseHealth(){
        health-=2;
    };
    public abstract void treat();
    public abstract void aMonthPasses();

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
