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
        super.animalType=AnimalType.BEAR;
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
        super.age++;

    }
}
