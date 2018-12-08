/**
 * 
 */
package abstractclass;

import java.util.Scanner;

/**
 * @author tirsky
 *
 */
public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public void record() {
		System.out.println("please enter the length of the rectangle :");
		Scanner sc = new Scanner(System.in);
		length = sc.nextDouble();
		System.out.println("please enter the width of the rectangle :");
		width = sc.nextDouble();
	}
	public double perimeter() {
		return 2*(length+width);
	}
	
	public double area() {
		return length*width;
	}
}
