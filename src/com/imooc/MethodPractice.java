/**
 * 
 */
package com.imooc;

import java.util.Arrays;;

/**
 * @author tirsky
 *
 */
public class MethodPractice {
	public static void main(String[] args) {
		MethodPractice practice = new MethodPractice();
		int[] scores = {79,52,98,81};
		
		int count = practice.sort(scores);
		System.out.println(count);
	}
	
	public int sort(int[] a) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		return a.length;
	}
}
