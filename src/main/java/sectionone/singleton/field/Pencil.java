package sectionone.singleton.field;

public class Pencil {
    public static final Pencil INSTANCE = new Pencil();

    private Pencil() {
    }

    public void write() {
        System.out.println("Writing...");
    }

    public static void main(String[] args) {
        Pencil pencil1 = Pencil.INSTANCE;
        Pencil pencil2 = Pencil.INSTANCE;
        System.out.println(pencil1.hashCode() + " " +pencil2.hashCode());
    }
}
