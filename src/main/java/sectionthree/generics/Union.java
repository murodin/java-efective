// Generic union method and program to exercise it - pages 129 - 130
package sectionthree.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {

	// Generic method
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}

	// Simple program to exercise generic method
	public static void main(String[] args) {
		Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Heid",
				"Harry"));
		Set<String> stooges = new HashSet<String>(Arrays.asList("Sonmez", "Ates",
				"Curly"));

        /*
        Set<Integer> ints = new HashSet<Integer>(Arrays.asList(12, 13, 14));
        Set<Integer> go = union(guys, ints);
        for (Integer intValue : go) {
            System.out.println(intValue);
        }
        */

		Set<String> aflCio = union(guys, stooges);
		System.out.println(aflCio);
	}
}
