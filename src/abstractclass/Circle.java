/**
 * 
 */
package abstractclass;

import java.util.Scanner;

/**
 * @author tirsky
 *
 */
public class Circle extends Shape {
	private double radius;
	
	public void record() {
		System.out.println("please enter the radius of the circle :");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
	}
	
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
}
