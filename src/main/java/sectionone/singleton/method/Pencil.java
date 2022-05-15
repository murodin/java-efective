package sectionone.singleton.method;

public class Pencil {
    private static final Pencil INSTANCE = new Pencil();

    private Pencil() {
    }

    //Possible multithreading attack
    public static Pencil getInstance() {
        return INSTANCE;
    }

    public void write() {
        System.out.println("Writing...");
    }

    public static void main(String[] args) {
        Pencil pencil1 = Pencil.getInstance();
        Pencil pencil2 = Pencil.getInstance();
        System.out.println(pencil1.hashCode() + " " +pencil2.hashCode());
    }
}
