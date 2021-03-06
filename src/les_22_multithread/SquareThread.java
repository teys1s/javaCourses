package les_22_multithread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SquareThread extends Thread {

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("taskthread.txt"))) {
            for (int i = 3; i < 18; i++) {
                String save = "Периметр квадрата= " + i * 4;
                System.out.println(save);
                bw.write(save + "\n");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
