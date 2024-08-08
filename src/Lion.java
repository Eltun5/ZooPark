public class Lion extends BigCat{
    public Lion() {
        super.img= """
                         (\\)_
               .,       (/c a\\
              /  \\_____((//   P
             (/) (       (/||\\_
                 [  )   (    , )
                 | \\ --- | |   '
                 '\\, ,)  '\\,)
                  """;
        super.health=10;
        super.gender=(int)(Math.random()*2)==1?Gender.MALE:Gender.FEMALE;

    }

    @Override
    public String getImg() {
        return super.img;
    }

    @Override
    public int getAge() {
        return super.age;
    }

    @Override
    public Gender getGender() {
        return super.gender;
    }

    @Override
    public int getLifeExpectancy() {
        return super.lifeExpectancy;
    }

    @Override
    public boolean canEat(Food foodName) {
        boolean b=false;
        for (Food food : super.eats){
        if (!b) b= food.equals(foodName);
        }
        return b;
    }

    @Override
    public void eat(Food food) {
        if (super.eats.contains(food)){
            super.health+= food.getHealth();
            .//qefes waste +=food.getWaste();
        }
    }

    @Override
    public void treat() {
        stroked();
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        eat();
        //clean waste
    }

    @Override
    public void stroked() {
            super.health+=3;
    }
}
