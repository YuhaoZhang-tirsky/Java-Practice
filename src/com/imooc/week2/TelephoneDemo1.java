/**
 * 
 */
package com.imooc.week2;

/**
 * @author tirsky
 *
 */
public class TelephoneDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone telephone = new Telephone();
		telephone.screenSize = 5.0f;
		telephone.cpu = 1.4f;
		telephone.memory = 2.0f;
		telephone.SMS();
		telephone.call();
	}

}
