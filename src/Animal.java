import java.util.List;
public abstract class Animal {
    protected int lifeExpectancy;
    protected int health;
    protected List<Food> eats;
    protected Gender gender;
    protected int age=0;
    protected String img;

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
        boolean b=false;
        for (Food food : eats){
            if (!b) b= food.equals(foodName);
        }
        return b;
    }
    public void eat(Food food){
        if (eats.contains(food)){
            health+= food.getHealth();
            .//qefes waste +=food.getWaste();
        }
    }
    public void decreaseHealth(){
        health-=2;
    };
    public abstract void treat();
    public abstract void aMonthPasses();
}
