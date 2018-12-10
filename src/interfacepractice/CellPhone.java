/**
 * 
 */
package interfacepractice;


/**
 * @author tirsky
 *
 */
public class CellPhone extends Telephone {

	/* (non-Javadoc)
	 * @see abstractclass.Telphone#call()
	 */
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call via keyboard");
	}

	/* (non-Javadoc)
	 * @see abstractclass.Telphone#sms()
	 */
	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("sms via keyboard");
	}

}