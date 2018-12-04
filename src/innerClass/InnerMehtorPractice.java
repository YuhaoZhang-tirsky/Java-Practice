/**
 * 
 */
package innerClass;

/**
 * @author tirsky
 *
 */
public class InnerMehtorPractice {

	/**
	 * @param args
	 */
	
	private String name = "imooc";
	
	public void show() {
		class MInner{
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
		
		MInner mi = new MInner();
		int newScore = mi.getScore();
		
		System.out.println("name: " + name + "\nnew score: " + newScore);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerMehtorPractice im = new InnerMehtorPractice();
		im.show();
	}

}
