/**
 * 
 */
package classExtends;

/**
 * @author tirsky
 *
 */
public class TelephoneInitail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone tel1 = new Telephone();
		Telephone tel2 = new Telephone();
		tel1.cpu = 2.0;
		tel2.cpu = 2.0;
		tel1.size = 6.2;
		tel2.size = 6.5;
		tel1.mem = 1024;
		tel2.mem = 1024;
		
		if (tel1.equals(tel2)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}

}
