package sectionone.performance;

public class StringPerformance {

    public static void main(String[] args) {

        String s1 = new String("selam"); //  Performance Lose
        String s2 = "selam";
        String s3 = "selam";

        System.out.println("Equal: " + (s1 == s2)); // return false because of different object
        System.out.println("Equal: " + (s2 == s3)); // return true because of String Pool
        System.out.println("Equal: " + s1.equals(s2)); // return true because of value equalization
    }
}
