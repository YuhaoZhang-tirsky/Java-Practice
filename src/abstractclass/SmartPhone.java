/**
 * 
 */
package abstractclass;

/**
 * @author tirsky
 *
 */
public class SmartPhone extends Telphone {

	/* (non-Javadoc)
	 * @see abstractclass.Telphone#call()
	 */
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call via 4G");
	}

	/* (non-Javadoc)
	 * @see abstractclass.Telphone#sms()
	 */
	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("send sms via whatup");
	}

}
