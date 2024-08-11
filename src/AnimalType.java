public enum AnimalType {
    BEAR(Food.FISH,Food.STEAK),CHIMPANZEE(Food.FRUIT, Food.ICE_CREAM),ELEPHANT(Food.HAY,Food.FRUIT),
    GIRAFFE(Food.HAY,Food.FRUIT),GORILLA(Food.FRUIT, Food.ICE_CREAM),LION(Food.STEAK, Food.CELERY),
    PENGUIN(Food.FISH,Food.ICE_CREAM),TIGER(Food.STEAK, Food.CELERY);
    private final Food first;
    private final Food second;

    AnimalType(Food first, Food second) {
        this.first = first;
        this.second = second;
    }

    public Food getFirstEat() {
        return first;
    }

    public Food getSecondEat() {
        return second;
    }
}
