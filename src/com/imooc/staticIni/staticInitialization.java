/**
 * 
 */
package com.imooc.staticIni;

/**
 * @author tirsky
 *
 */
public class staticInitialization {
	
	/**
	 * @param args
	 */
	int num1;
	int num2;
	static int num3;
	
	public staticInitialization() {
		num1 = 91;
		System.out.println("ͨ�����췽��Ϊ����num1��ֵ");
	}
	{
		num2 = 74;
		System.out.println("ͨ����ʼ����Ϊ����num2��ֵ");
	}
	static {
		num3 = 83;
		System.out.println("ͨ����̬��ʼ����Ϊ��̬����num3��ֵ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticInitialization hello = new staticInitialization();
		System.out.println("num1 " + hello.num1);
		System.out.println("num2 " + hello.num2);
		System.out.println("num3 " + num3);
		staticInitialization hello2 = new staticInitialization();
	}

}
