package Other;

import Enums.Food;

import java.util.HashMap;

public class FoodStore {
    private final HashMap<Food,Integer> foodStorage=new HashMap<>();
    private final int numOfEnclosure;
    public FoodStore(int numOfEnclosure){
        this.numOfEnclosure=numOfEnclosure;
        foodStorage.put(Food.HAY,0);
        foodStorage.put(Food.STEAK,0);
        foodStorage.put(Food.ICE_CREAM,0);
        foodStorage.put(Food.FRUIT,0);
        foodStorage.put(Food.FISH,0);
        foodStorage.put(Food.CELERY,0);
    }

    public int getNumOfEnclosure() {
        return numOfEnclosure;
    }
    public void addFood(Food key,int numOfFood){
        foodStorage.put(key,(foodStorage.get(key)+numOfFood));
    }
    public boolean hasFood(Food key){
        return foodStorage.get(key) != 0;
    }
    public Food takeFood(Food key){
        foodStorage.put(key,(foodStorage.get(key)-1));
        return key;
    }
}