import java.util.List;
public abstract class Animal {
    protected int lifeExpectancy;
    protected int health=10;
    protected List<Food> eats;
    protected Gender gender;
    protected int age=0;
    protected String img;
    protected AnimalType animalType;

    public Animal() {
        this.gender=(int)(Math.random()*2)==1?Gender.MALE:Gender.FEMALE;
    }

    public String getImg(){
        return img;
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
        if (food!=null&&canEat(food)){
            health+= food.getHealth();
            return food.getWaste();

        }
        return 0;
    }
    public void decreaseHealth(){
        health-=2;
    };
    public abstract void treat();
    public abstract void aMonthPasses();
}
