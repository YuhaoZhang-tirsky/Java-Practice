/**
 * 
 */
package innerClass;

/**
 * @author tirsky
 *
 */
public class StaticInnerClass {
	private int a = 99; 
	static int b = 1;
	
	public static class SInner{
		int b = 2;
		public void test() {
			System.out.println("access to outter b: " + StaticInnerClass.b);
			System.out.println("access to inner b: " + b);
		}
	}
	
	public static void main(String[] args) {
		SInner si = new SInner();
		si.test();
	}
}
