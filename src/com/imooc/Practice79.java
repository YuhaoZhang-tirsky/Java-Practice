/**
 * 
 */
package com.imooc;

import java.util.Arrays;

/**
 * @author tirsky
 *
 */
public class Practice79 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice79 hello = new Practice79();
		
		int[] nums = hello.getArray(8);
		
		System.out.println(Arrays.toString(nums));
	}
	
	public int[] getArray(int length) {
		int [] nums = new int[length];
		for (int i = 0; i < nums.length ; i++) {
			nums[i] = (int) (Math.random()*100);
			
		}
		return nums;
		
	}

}
