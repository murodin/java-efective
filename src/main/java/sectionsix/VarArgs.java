package sectionsix;

import java.util.Arrays;
import java.util.OptionalInt;

public class VarArgs {

    static int sum(int... args) {
        return Arrays.stream(args).sum();
    }

    static int min(int first, int... args) {
        int min  = Arrays.stream(args).min().orElse(0);
        return Math.min(first, min);
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
        System.out.println(min(11,7,8,9));

    }
}
