/**
 * 
 */
package casting;



/**
 * @author tirsky
 *
 */
public class Initial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Animal animal = dog; //向上类型转换
		Dog dog2 = (Dog)animal;//向下类型强制转换
		if (animal instanceof Cat) {
		Cat cat =(Cat)animal;
		}else {
			System.out.println("cant cast");
		}
		}

}
