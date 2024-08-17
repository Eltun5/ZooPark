public enum AnimalType {
    BEAR(Food.FISH,Food.STEAK,"Zookeeper"),
    CHIMPANZEE(Food.FRUIT, Food.ICE_CREAM,"PlayKeeper"),
    ELEPHANT(Food.HAY,Food.FRUIT,"PhysioKeeper"),
    GIRAFFE(Food.HAY,Food.FRUIT,"PhysioKeeper"),
    GORILLA(Food.FRUIT, Food.ICE_CREAM,"PlayKeeper"),
    LION(Food.STEAK, Food.CELERY,"Zookeeper"),
    PENGUIN(Food.FISH,Food.ICE_CREAM,"PlayKeeper"),
    TIGER(Food.STEAK, Food.CELERY,"Zookeeper");
    private final Food first;
    private final Food second;
    private final String keeperType;//We can create in new enum because this is a type

    AnimalType(Food first, Food second,String keeperType) {
        this.first = first;
        this.second = second;
        this.keeperType=keeperType;
    }

    public Food getFirstEat() {
        return first;
    }

    public Food getSecondEat() {
        return second;
    }

    public String getKeeperType() {
        return keeperType;
    }
}
