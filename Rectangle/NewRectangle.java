
public class NewRectangle {
	
	float length,breadth,area,perimeter;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	/**
	 * regular
	 * @author Gautami Shirodkar
	 * @param l,b
	 * @return area
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFOUND
	 * 
	 */
	
	
	public float area () {
		return area= length*breadth;	
	}
	
	/**
	 * regular
	 * @author Gautami Shirodkar
	 * @param l,b
	 * @return perimeter
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFOUND
	 * 
	 */
	
	
	public float perimeter() {
		return perimeter= 2*(length+breadth);
	}

}
