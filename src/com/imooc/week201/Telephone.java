/**
 * 
 */
package com.imooc.week201;

/**
 * @author tirsky
 *
 */
public class Telephone {
	private float screen;
	private float cpu;
	private float mem;
	
	public float getScreen() {
		return screen;
	}
	public void setScreen(float newscreen) {
		screen = newscreen;
	}
	public Telephone() {
		System.out.println("�޲εĹ��췽��ִ����");
	}
	
	public Telephone(float newScreen, float newCpu, float newMem) {
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
	//	System.out.println("�вεĹ��췽��ִ����");
	}
}
