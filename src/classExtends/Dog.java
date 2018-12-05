/**
 * 
 */
package classExtends;

/**
 * @author tirsky
 *
 */
public class Dog extends Animal {
	public int age = 20;
	public void eat() {
		System.out.println("dog can eat");
	}
	public Dog() {
		System.out.println("dog class is running");
	}
	
	public void method() {
		System.out.println("parent class: " + super.age);
		super.eat();
		eat();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
