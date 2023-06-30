// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import File_Saver.file_saver;
import Randomizer.Weighted_Randomizer;
import Toys.Toy;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        Weighted_Randomizer<Toy> toys = new Weighted_Randomizer<Toy>();

        Toy dragon = new Toy("Dragon", .3, 1);
        Toy ship = new Toy("Ship", .5,2);
        Toy barbie = new Toy("Barbie", .2,2);
        Toy car = new Toy( "Car", .5,1);
        Toy hat = new Toy("Hat", .4,1);
        Toy sword = new Toy("Sword", .1,1);

        toys.addEntry(dragon);
        toys.addEntry(ship);
        toys.addEntry(sword);
        toys.addEntry(barbie);
        toys.addEntry(car);
        toys.addEntry(hat);

        PriorityQueue<Toy> q = new PriorityQueue<Toy>();
        for (int i = 0; i < 100; i++) {

            var rand_toy = toys.getRandom();
            if(rand_toy != null && rand_toy.getQuantity() !=0) {
                q.add(rand_toy);
                rand_toy.setQuantity(rand_toy.getQuantity() - 1);
            }
        }

        file_saver<Toy> save = new file_saver<Toy>(q);
        try {
            save.saver();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}