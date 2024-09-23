import junit.framework.TestCase;

/**
 * regular
 * @author Gautami Shirodkar
 * @description it is for the perimeter of the triangle
 * @since 14-09-2024
 * @version 1.0
 * @exception PersonNotFOUND
 * 
 */

public class TriangleTestPerimeter extends TestCase {

	public void testPerimeter() {
		//fail("Not yet implemented");
		Triangle t1=new Triangle();
		t1.setA1(2);
		t1.setA2(2);
		t1.setA3(2);
		t1.setH(2);
		float p=t1.perimeter();
		System.out.println(p);
		assertEquals((float)6,p);

	}

	public void testPerimeter1() {
		//fail("Not yet implemented");
		Triangle t1=new Triangle();
		t1.setA1(2);
		t1.setA2(2);
		t1.setA3(2);
		t1.setH(2);
		float p=t1.perimeter();
		System.out.println(p);
		assertEquals((float)4,p);

	}

}
