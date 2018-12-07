/**
 * 
 */
package polymorphism;

/**
 * @author tirsky
 *
 */
public class Ship extends Transport{


	/**
	 * @param number
	 * @param way
	 * @param tool
	 */
	public Ship(int number, String way, String tool) {
		super(number, way, tool);
		// TODO Auto-generated constructor stub
		this.number = number;
		this.way = way;
		this.tool = tool;
	}

}
