package sectionone.singleton.enumaration;

public enum Pencil {
    INSTANCE; // Thread safe

    public static void main(String[] args) {
        Pencil pencil1 = Pencil.INSTANCE;
        Pencil pencil2 = Pencil.INSTANCE;
        System.out.println(pencil1.hashCode() + " " +pencil2.hashCode());
    }
}
