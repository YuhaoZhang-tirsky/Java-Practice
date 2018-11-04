/**
 * 
 */
package com.imooc;

/**
 * @author tirsky
 *
 */
public class Practice415 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9999;
		int count = 0;
		count += 1;
		while(num / 10 != 0) {
			count++;
			num = num / 10 ;
		}
		System.out.println("它是个" + count + "位的数！");
	}

}
