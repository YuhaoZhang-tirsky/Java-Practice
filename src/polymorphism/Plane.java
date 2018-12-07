/**
 * 
 */
package polymorphism;

/**
 * @author tirsky
 *
 */
public class Plane extends Transport{


	/**
	 * @param number
	 * @param way
	 * @param tool
	 */
	public Plane(int number, String way, String tool) {
		super(number, way, tool);
		// TODO Auto-generated constructor stub
		this.number = number;
		this.tool = tool;
		this.way = way;
	}
	
}
