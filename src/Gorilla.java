public class Gorilla extends APE{
    public Gorilla() {
        super.img= """
           ."`".
       .-./ _=_ \\.-.
      {  (,(oYo),) }}
      {{ |   "   |} }
      { { \\(---)/  }}
      {{  }'-=-'{ } }
      { { }._:_.{  }}
      {{  } -:- { } }
      {_{ }`===`{  _}
     ((((\\)     (/))))
                """;
        super.lifeExpectancy=32;
    }
    @Override
    public void treat() {
        painting();
    }

    public void painting(){
        super.health+=4;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        eat();
        //clean waste
    }
}
