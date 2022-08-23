package sectionseven;

public class Interesting {
    //static Integer i; // Initialization to null!!!
    //static Integer i = new Integer(42);
    static int i = 42;

    public static void main(String[] args) {
        if(i == 42)
            System.out.println("Interesting...."); // Get the NullPointer Exception
    }
}
