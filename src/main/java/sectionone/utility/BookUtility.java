package sectionone.utility;

public class BookUtility {

    private BookUtility() {
        throw new IllegalStateException("Constructor Not Called!!!");
    }

    public static int getPageNumber() {
        return 1254;
    }

    public static boolean isHavePreWord() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("PreWord: " + BookUtility.isHavePreWord());
    }
}
