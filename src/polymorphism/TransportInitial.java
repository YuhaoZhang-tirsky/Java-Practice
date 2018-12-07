/**
 * 
 */
package polymorphism;

/**
 * @author tirsky
 *
 */
public class TransportInitial {
	public static void main(String[] args) {
	Transport bus = new Bus(50, "land", "bus");
	Transport ship = new Ship(500, "water", "ship");
	Transport plane = new Plane(300, "air", "plane");
	bus.go();
	ship.go();
	plane.go();
	}
}
