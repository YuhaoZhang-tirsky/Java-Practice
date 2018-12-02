/**
 * 
 */
package innerClass;

/**
 * @author tirsky
 *
 */
public class Outer {
	private int a = 99;
	
	public class Inner{
		int b = 2;
		public void test() {
			System.out.println("get access of a from outer class " + a);
			System.out.println("get access of b from inner class " + b);
		}
	}

public static void main(String[] args) {
	Outer o = new Outer();
	Inner i = o.new Inner();
	i.test();
}
}
