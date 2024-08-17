import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    static List<Enclosure> enclosureList = new ArrayList<>();

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aslan\\OneDrive\\Desktop\\ZooGame\\src\\Construct.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(":");
                switch (split[0].toUpperCase()) {
                    case "BEAR" -> createAnimal(AnimalType.BEAR, Integer.parseInt(split[1]));
                    case "CHIMPANZEE" -> createAnimal(AnimalType.CHIMPANZEE, Integer.parseInt(split[1]));
                    case "ELEPHANT" -> createAnimal(AnimalType.ELEPHANT, Integer.parseInt(split[1]));
                    case "GIRAFFE" -> createAnimal(AnimalType.GIRAFFE, Integer.parseInt(split[1]));
                    case "GORILLA" -> createAnimal(AnimalType.GORILLA, Integer.parseInt(split[1]));
                    case "LION" -> createAnimal(AnimalType.LION, Integer.parseInt(split[1]));
                    case "PENGUIN" -> createAnimal(AnimalType.PENGUIN, Integer.parseInt(split[1]));
                    case "TIGER" -> createAnimal(AnimalType.TIGER, Integer.parseInt(split[1]));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        while (Enclosure.animalNum >= 0) {
            int size = enclosureList.size();
            for (int i = 0; i < size; i++) {
                if (enclosureList.get(i).hasAnimals.isEmpty()) {
                    enclosureList.remove(i);
                    i--;
                    size--;
                }
            }
            enclosureList.forEach(Enclosure::aMonthPasses);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            waitViaSec(2);
        }
        System.out.println("There is no animal.");
    }

    public static void createAnimal(AnimalType animalType, int num) {
        int enclosureNum = num / 20;
        for (int i = 0; i < enclosureNum; i++) {
            Enclosure enclosure = new Enclosure(animalType);
            enclosureList.add(enclosure);
            switch (animalType) {
                case AnimalType.BEAR -> {
                    for (int j = 0; j <= 20; j++) enclosure.add(new Bear());
                }
                case AnimalType.CHIMPANZEE -> {
                    for (int j = 0; j <= 20; j++) enclosure.add(new Chimpanzee());
                }
                case AnimalType.ELEPHANT -> {
                    for (int j = 0; j <= 20; j++) enclosure.add(new Elephant());
                }
                case AnimalType.GIRAFFE -> {
                    for (int j = 0; j <= 20; j++) enclosure.add(new Giraffe());
                }
                case AnimalType.GORILLA -> {
                    for (int j = 0; j <= 20; j++) enclosure.add(new Gorilla());
                }
                case AnimalType.LION -> {
                    for (int j = 0; j <= 20; j++) enclosure.add(new Lion());
                }
                case AnimalType.PENGUIN -> {
                    for (int j = 0; j <= 20; j++) enclosure.add(new Penguin());
                }
                case AnimalType.TIGER -> {
                    for (int j = 0; j <= 20; j++) enclosure.add(new Tiger());
                }
            }
        }
        Enclosure enclosure = new Enclosure(animalType);
        enclosureList.add(enclosure);
        switch (animalType) {
            case AnimalType.BEAR -> {
                for (int j = 0; j < num - 20 * enclosureNum; j++) enclosure.add(new Bear());
            }
            case AnimalType.CHIMPANZEE -> {
                for (int j = 0; j < num - 20 * enclosureNum; j++) enclosure.add(new Chimpanzee());
            }
            case AnimalType.ELEPHANT -> {
                for (int j = 0; j < num - 20 * enclosureNum; j++) enclosure.add(new Elephant());
            }
            case AnimalType.GIRAFFE -> {
                for (int j = 0; j < num - 20 * enclosureNum; j++) enclosure.add(new Giraffe());
            }
            case AnimalType.GORILLA -> {
                for (int j = 0; j < num - 20 * enclosureNum; j++) enclosure.add(new Gorilla());
            }
            case AnimalType.LION -> {
                for (int j = 0; j < num - 20 * enclosureNum; j++) enclosure.add(new Lion());
            }
            case AnimalType.PENGUIN -> {
                for (int j = 0; j < num - 20 * enclosureNum; j++) enclosure.add(new Penguin());
            }
            case AnimalType.TIGER -> {
                for (int j = 0; j < num - 20 * enclosureNum; j++) enclosure.add(new Tiger());
            }
        }
    }

    public static void waitViaSec(int sec) {
        try {
            Thread.sleep((long) (sec * 1000L));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}