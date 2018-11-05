/**
 * 
 */
package com.imooc.week2;

/**
 * @author tirsky
 *
 */
public class Telephone {
	float screenSize;
	float cpu;
	float memory;
	int var;
	int localVar = 30;
	
	void call() {
		int localVar = 0;
		System.out.println("var" + localVar);
		System.out.println("make a phone call");
	}
	
	void SMS() {
		System.out.println("screen size " + screenSize + "  cpu " + cpu + "  memory " + memory +"  send a message");
	}
}
