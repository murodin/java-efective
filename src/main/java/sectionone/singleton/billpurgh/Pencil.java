package sectionone.singleton.billpurgh;

public class Pencil {
    private Pencil() {
    }

    //Possible multithreading attack
    private static class Helper {
        private static final Pencil INSTANCE = new Pencil();
    }

    public static Pencil getInstance() {
        return Helper.INSTANCE;
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
