/**
 * 
 */
package classExtends;

/**
 * @author tirsky
 *
 */
public class AnimalInitail {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("animal age " + animal.age);
		Dog dog = new Dog();
		dog.age = 15;
		dog.name = "dogname";
		dog.eat();
		dog.method();
		System.out.println(dog);
		Dog dog2 = new Dog();
		dog2.age = 15;
		dog2.name = "dogname";
		
		if(dog.equals(dog2)) {
			System.out.println("the two objects are equal");
		}else {
			System.out.println("the two objects are not equal");
		}
	}
	
}
