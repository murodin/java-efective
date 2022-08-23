package sectionsix;

import java.util.Date;

public class Attack {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        end.setYear(78);
        System.out.println(period);
    }
}
