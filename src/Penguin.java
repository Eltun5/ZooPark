import java.util.List;

public class Penguin extends Animal{
    public Penguin(){
        super.img= """    
                        __
                     -=(o '.
                        '.-.\
                        /|  \\
                        '|  ||
                         _\\_):,_""";
        super.lifeExpectancy=15;
        super.eats= List.of(Food.FISH,Food.ICE_CREAM);
    }
    @Override
    public void treat() {
        watchAFilm();
    }

    public void watchAFilm(){
        super.health+=2;
    }

    @Override
    public void aMonthPasses() {
        super.decreaseHealth();
        eat();
        //clean waste
    }
}
