package sectionseven;

import java.math.BigDecimal;

public class DoubleFace {
    public static void main(String[] args) {
        System.out.println(1.8 - 0.87777); // Double can e problem in here!!!
        BigDecimal b = new BigDecimal("1.8");
        BigDecimal a = new BigDecimal("0.87777");
        System.out.println(b.subtract(a));
    }
}
