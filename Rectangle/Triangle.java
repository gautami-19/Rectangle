
public class Triangle {
	float a1,a2,a3;
	float h;
	float area,perimeter;
	
	public float getA1() {
		return a1;
	}
	public void setA1(float a1) {
		this.a1 = a1;
	}
	public float getA2() {
		return a2;
	}
	public void setA2(float a2) {
		this.a2 = a2;
	}
	public float getA3() {
		return a3;
	}
	public void setA3(float a3) {
		this.a3 = a3;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	
	/**
	 * regular
	 * @author Gautami Shirodkar
	 * @param a1,h
	 * @return area
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFOUND
	 * 
	 */
	
	public float area () {
		return area = (float) (0.5*a1*h);	
	}
	
	/**
	 * regular
	 * @author Gautami Shirodkar
	 * @param a1,a2,a3
	 * @return perimeter
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFOUND
	 * 
	 */
	
	public float perimeter() {
		return perimeter= a1+a2+a3;
	}
	

}
