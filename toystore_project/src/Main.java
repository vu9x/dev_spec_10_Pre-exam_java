// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import File_Saver.file_saver;
import Randomizer.Weighted_Randomizer;
import Toys.Toy;

import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        Weighted_Randomizer<Toy> toys = new Weighted_Randomizer<Toy>();

        Toy dragon = new Toy("Dragon", 1.5);
        Toy ship = new Toy("Ship", 2.);
        Toy barbie = new Toy("Barbie", 1.);
        Toy car = new Toy( "Car", 3.);
        Toy hat = new Toy("Hat", 2.);
        Toy sword = new Toy("Sword", 6.);

        toys.addEntry(dragon);
        toys.addEntry(ship);
        toys.addEntry(sword);
        toys.addEntry(barbie);
        toys.addEntry(car);
        toys.addEntry(hat);


        PriorityQueue<Toy> q = new PriorityQueue<Toy>();
        for (int i = 0; i < 50; i++) {
            q.add(toys.getRandom());
        }

        file_saver<Toy> save = new file_saver<Toy>(q);
        try {
            save.saver();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        for (Toys.Toy item: q) {
//            System.out.println(item.toString());
//        }
//
//        double dragon_counter = 0;
//        double ship_counter = 0;
//        double sword_counter = 0;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(q.poll().toString());
//        }

//        for (Toys.Toy item: q) {
//            if (item.getId() == 1){ dragon_counter += 1;}
//            else if (item.getId() == 2) { ship_counter += 1;}
//            else if (item.getId() == 3) { sword_counter += 1;}
//            else System.out.println("Ошибка");
//        }

//        System.out.printf("Dragons = %.2f, Ships = %.2f, Swords = %.2f", dragon_counter, ship_counter, sword_counter);

//        q.add(new Toys.Toy(1, "name", 2.));
//        q.add(new Toys.Toy(2, "name", 1.));
//        q.add(new Toys.Toy(3, "name", 10.));




    }
}