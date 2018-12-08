/**
 * 
 */
package abstractclass;

/**
 * @author tirsky
 *
 */
public class Initiail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel1 = new CellPhone();
		tel1.call();
		tel1.sms();
		Telphone tel2 = new SmartPhone();
		tel2.call();
		tel2.sms();
	}

}
