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
		Animal animal = dog; //��������ת��
		Dog dog2 = (Dog)animal;//��������ǿ��ת��
		if (animal instanceof Cat) {
		Cat cat =(Cat)animal;
		}else {
			System.out.println("cant cast");
		}
		}

}
