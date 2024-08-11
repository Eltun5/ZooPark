public class Chimpanzee extends APE{
    public Chimpanzee() {
        super.img= """
                       .="=.
                     _/.-.-.\\_     _
                    ( ( o o ) )    ))
                     |/  "  \\|    //
                      \\'---'/    //
                      /`""\"`\\\\  ((
                     / /_,_\\ \\\\  \\\\
                     \\_\\\\_'__/ \\  ))
                     /`  /`~\\  |//
                    /   /    \\  /
                ,--`,--'\\/\\    /
                 '-- "--'  '--'
                """;
        super.lifeExpectancy=24;
        super.animalType=AnimalType.CHIMPANZEE;
    }
    @Override
    public void treat() {
        playChase();
    }

    public void playChase(){
        super.health+=4;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        //eat();
        //clean waste
    }
}
