/**
 * 
 */
package innerClass;

/**
 * @author tirsky
 *
 */
public class StaticInnerClassPractice {

	/**
	 * @param args
	 */
	
	private static int score = 84;
	
	public static class SInner{
		int score = 91;
		
		public void show() {
			System.out.println("access score from outer: " + StaticInnerClassPractice.score);
			System.out.println("access score from inner: " + score);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SInner si = new SInner();
		si.show();
	}

}
