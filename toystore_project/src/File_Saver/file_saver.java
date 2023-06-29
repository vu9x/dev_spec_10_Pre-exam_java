package File_Saver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class file_saver<T> {

    private String fileName;
    private PriorityQueue<T> queue;

    public file_saver(PriorityQueue<T> queue){
        this.fileName = "result.txt";
        this.queue = queue;
    }

    public String getFileName() {
        return fileName;
    }

    public PriorityQueue<T> getQueue() {
        return queue;
    }

    public void saver() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName()));
        for (T item: queue) {
            writer.write(item.toString());
        }
        writer.close();
    }
}
