/**
 * 
 */
package com.imooc.week201;

/**
 * @author tirsky
 *
 */
public class Telephone {
	float screen;
	float cpu;
	float mem;
	public Telephone() {
		System.out.println("无参的构造方法执行了");
	}
	
	public Telephone(float newScreen, float newCpu, float newMem) {
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
	//	System.out.println("有参的构造方法执行了");
	}
}
