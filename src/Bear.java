import java.util.List;

public class Bear extends Animal {
    public Bear(){
        super.img= """ 
   ..------~~~--.__
  /               c~\\
  /             \\__ `\\
  |  /~~--__/  /'\\ ~~'
 /'/'\\ |    | |`\\ \\_
`-))  `-))  `-)) `-))""";
        super.lifeExpectancy=18;
        super.eats= List.of(Food.FISH,Food.STEAK);
    }
    @Override
    public void treat() {
        hug();
    }

    public void hug(){
        super.health+=3;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        eat();
        //clean waste
    }
}
