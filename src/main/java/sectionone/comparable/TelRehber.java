package sectionone.comparable;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public final class TelRehber implements Comparable<TelRehber>{
    private final short alanKod;
    private final short prefix;
    private final short numara;

    public TelRehber(int alanKod, int prefix, int numara) {
        kontrol(alanKod, 999, "alan kod");
        kontrol(prefix, 999, "prefix");
        kontrol(numara, 9999, "numara");
        this.alanKod = (short) alanKod;
        this.prefix = (short) prefix;
        this.numara = (short) numara;
    }

    private static void kontrol(int arg, int max, String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TelRehber))
            return false;
        TelRehber pn = (TelRehber) o;
        return pn.numara == numara && pn.prefix == prefix
                && pn.alanKod == alanKod;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + alanKod;
        result = 31 * result + prefix;
        result = 31 * result + numara;
        return result;
    }

    /**
     * Returns the string representation of this phone number. The string
     * consists of fourteen characters whose format is "(XXX) YYY-ZZZZ", where
     * XXX is the area code, YYY is the prefix, and ZZZZ is the line number.
     * (Each of the capital letters represents a single decimal digit.)
     *
     * If any of the three parts of this phone number is too small to fill up
     * its field, the field is padded with leading zeros. For example, if the
     * value of the line number is 123, the last four characters of the string
     * representation will be "0123".
     *
     * Note that there is a single space separating the closing parenthesis
     * after the area code from the first digit of the prefix.
     */
    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", alanKod, prefix, numara);
    }

    @Override
    public int compareTo(TelRehber o) {
        return this.alanKod - o.alanKod;
    }

    private static final ThreadLocalRandom threadLocal = ThreadLocalRandom.current();

    private static TelRehber getRandomTelRehber() {
        return new TelRehber(threadLocal.nextInt(1000),
                threadLocal.nextInt(1000), threadLocal.nextInt(10000));
    }

    public static void main(String[] args) {
        //Set<TelRehber> m = new TreeSet<>((a, b) -> a.alanKod - b.alanKod);
        Set<TelRehber> m = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            m.add(getRandomTelRehber());
        }
        System.out.println(m);
    }
}
