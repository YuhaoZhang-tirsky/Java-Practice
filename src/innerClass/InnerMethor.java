/**
 * 
 */
package innerClass;

/**
 * @author tirsky
 *
 */
public class InnerMethor {
	public void show() {
		final int a = 25;
		int b = 13;
		
		class MInner {
			int c = 2;
			public void print() {
				System.out.println("Access to the varible a in outer class method: " + a);
				System.out.println("Access to the varible c in inner class: " + c);
			}
		}
		MInner mi = new MInner();
		mi.print();
	}
	
	public static void main(String[] args) {
		InnerMethor im = new InnerMethor();
		im.show();
	}
}
