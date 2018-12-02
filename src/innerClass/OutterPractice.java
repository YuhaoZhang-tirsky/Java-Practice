/**
 * 
 */
package innerClass;

/**
 * @author tirsky
 *
 */
public class OutterPractice {

	/**
	 * @param args
	 */
	
	private String name = "imooc";
	
	int age = 20;
	
	public class Inner {
		String name = "°®Ä½¿Î";
		public void show() {
			System.out.println("the name from outer class " + OutterPractice.this.name);
			System.out.println("the name from inner class " + name);
			System.out.println("the age from outer class " + age);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutterPractice o = new OutterPractice();
		Inner i = o.new Inner();
		i.show();
	}

}
