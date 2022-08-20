package sectionfour.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Okuyucu {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fi = new FileInputStream("nesneler.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);) {

            Object o = oi.readObject();
            Calisan efe = (Calisan) o;
            System.out.println("Calışan: " + efe);

            o = oi.readObject();
            Calisan mehmet = (Calisan) o;
            System.out.println("Calışan: " + mehmet);
        }
    }
}
