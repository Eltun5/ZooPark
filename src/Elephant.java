import java.util.List;

public class Elephant extends Animal{
    public Elephant() {
        super.img= """
                    _    _
                   /=\\""/=\\
                  (=(0_0 |=)__
                   \\_\\ _/_/   )
                     /_/   _  /\\
                    |/ |\\ || |
                       ~ ~  ~
                       """;
        super.lifeExpectancy=36;
        super.eats= List.of(Food.HAY,Food.FRUIT);
    }
    @Override
    public void treat() {
        bath();
    }

    public void bath(){
        super.health+=5;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        eat();
        //clean waste
    }
}
