/**
 * 
 */
package interfacepractice;


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
		Telephone tel1 = new CellPhone();
		tel1.call();
		tel1.sms();
		Telephone tel2 = new SmartPhone();
		tel2.call();
		tel2.sms();
		
		IPlayGame ip1 = new SmartPhone();
		IPlayGame ip2 = new Psp();
		ip1.playGame();
		ip2.playGame();
		
		IPlayGame ip3 = new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("ann inner class");
			}
		};
		
		ip3.playGame();
		
		new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("ann inner class2");
			}
		}.playGame();
	}

}
