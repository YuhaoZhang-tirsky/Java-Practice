/**
 * 
 */
package com.imooc.week201;


/**
 * @author tirsky
 *
 */
public class TelephoneMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone phone = new Telephone(5.0f,1.4f,2.0f);
		phone.setScreen(6.0f);
		System.out.println("screen: " + phone.getScreen() );
	}

}
