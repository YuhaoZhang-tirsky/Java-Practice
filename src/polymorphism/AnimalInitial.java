/**
 * 
 */
package polymorphism;


/**
 * @author tirsky
 *
 */
public class AnimalInitial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		Animal obj3 = new Cat();
		obj1.eat();
		obj2.eat();
		obj3.eat();
	
	}

}
