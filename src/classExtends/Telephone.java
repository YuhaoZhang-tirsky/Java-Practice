/**
 * 
 */
package classExtends;

/**
 * @author tirsky
 *
 */
public class Telephone {
	double size;
	double cpu;
	double mem;
	
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
		Telephone other = (Telephone) obj;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (Double.doubleToLongBits(mem) != Double.doubleToLongBits(other.mem))
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}
	
}
