/**
 * 
 */
package polymorphism;

/**
 * @author tirsky
 *
 */
public class Transport {
	public int number;
	public String way;
	public String tool;
	
	public Transport(int number, String way, String tool) {
		this.number = number;
		this.way = way;
		this.tool = tool;
	}
	
	public void go() {
		System.out.println(tool + " go on " + way + " and can carry " + number + " of people.");
	}
	
}
