package sectionfour.serialization;

import java.io.*;

public class Yazici {
    public static void main(String[] args) {
        Calisan efe = new Calisan("Efe", 15, "Male");
        Calisan mehmet = new Calisan("Mehmet", 45, "Male");

        try(FileOutputStream f = new FileOutputStream("nesneler.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);) {
            // Write objects to file
            o.writeObject(efe);
            o.writeObject(mehmet);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
}