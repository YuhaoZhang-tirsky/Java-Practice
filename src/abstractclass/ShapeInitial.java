/**
 * 
 */
package abstractclass;

/**
 * @author tirsky
 *
 */
public class ShapeInitial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		circle.record();
		double carea = circle.area();
		double cperineter = circle.perimeter();
		rectangle.record();
		double rarea = rectangle.area();
		double rperimeter = rectangle.perimeter();
		
		System.out.println("area of circle is " + carea +", and perimeter of the circle is " + cperineter);
		System.out.println("area of rectangle is " + rarea +", and perimeter of the rectangle is " + rperimeter);
	}

}
