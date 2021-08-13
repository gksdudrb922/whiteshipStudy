package week9;

import java.io.*;

public class TryWithResources {

    public static void main(String[] args) {


        try(FileInputStream fis = new FileInputStream("score.dat");
            DataInputStream dis = new DataInputStream(fis)) {

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
