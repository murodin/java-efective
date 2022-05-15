package sectionone.performance;

public class UnBoxingPerformance {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Long sum = 0L; // Make performance problem because of the Boxing/UnBoxing Long to long
        for(long i = 0; i < Integer.MAX_VALUE; i++)
            sum += i; // -> performance it seems sum += new Long(i);
        long end = System.currentTimeMillis();
        System.out.println("Sum: " + sum + " Elapsed Time: " + (end - start));

        long start1 = System.currentTimeMillis();
        long sum1 = 0L; // Make performance problem because of the Auto Boxing Long to long
        for(long i = 0; i < Integer.MAX_VALUE; i++)
            sum1 += i;
        long end1 = System.currentTimeMillis();
        System.out.println("Sum: " + sum1 + " Elapsed Time: " + (end1- start1));
    }
}
