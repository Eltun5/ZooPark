public class Main {
    public static void main(String[] args) {
        FoodStore.initStorage();
        System.out.println(FoodStore.foodStorage.get(Food.HAY));
    }
}