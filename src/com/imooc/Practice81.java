/**
 * 
 */
package com.imooc;

import java.util.Arrays;

/**
 * @author tirsky
 *
 */
public class Practice81 {
	public static void main(String[] args) {
		Practice81 hello = new Practice81();
		int[] scores = {89, -23, 64, 91, 119, 52, 73};
		System.out.println("考试成绩的前三名为:");
		hello.selectFirstThree(scores);
	}
	
	public void selectFirstThree(int[] scores) {
		Arrays.sort(scores);
		int count = 0;
		for (int i = scores.length-1; i > 0; i--) {
			if (count == 3) break;
			if (scores[i] > 0 && scores[i] < 100) {
				count++;
				System.out.println(scores[i]);
			}
		}
	}
}
