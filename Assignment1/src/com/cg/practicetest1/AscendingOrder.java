package com.cg.practicetest1;
import java.util.Arrays;
public class AscendingOrder {
	public static void main(String[] args) {
		String[] s= {"Chandrika","Chandu","C"};
		Arrays.parallelSort(s,(a,b)->Integer.compare(a.length(), b.length()));
		System.out.println(Arrays.deepToString(s));
		
	}

}
