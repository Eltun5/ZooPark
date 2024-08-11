public class Tiger extends BigCat{
    public Tiger() {
        super.img= """
      (^\\-==-/^)
     >\\\\ == //<
    :== q''p ==:     _
     .__ qp __.    .' )
      / ^--^ \\    /\\.'
     /_`    / )  '\\/
     (  )  \\  |-'-/
     \\^^,   |-|--'
    ( `'    |_| )
     \\-     |-|/
    (( )^---( ))
    """;
        super.health=10;
        super.gender=(int)(Math.random()*2)==1?Gender.MALE:Gender.FEMALE;
        super.animalType=AnimalType.TIGER;
    }
    @Override
    public void treat() {
        stroked();
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        //eat();
        //clean waste
    }

    @Override
    public void stroked() {
        super.health+=2;
    }
}
