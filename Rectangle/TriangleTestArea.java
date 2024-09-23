import junit.framework.TestCase;

/**
 * regular
 * @author Gautami Shirodkar
 * @description it is for the area of triangle
 * @since 14-09-2024
 * @version 1.0
 * @exception PersonNotFOUND
 * 
 */

public class TriangleTestArea extends TestCase {

	public void testArea() {
		//fail("Not yet implemented");
		Triangle t1=new Triangle();
		t1.setA1(2);
		t1.setA2(2);
		t1.setA3(2);
		t1.setH(2);
		//float u=t1.getA1();
		//System.out.println(u);
		//float v=t1.getH();
		//System.out.println(v);
		
		float p=t1.area();
		System.out.println(p);
		assertEquals((float)2,p);
	}
	public void testArea1() {
		//fail("Not yet implemented");
		Triangle t1=new Triangle();
		t1.setA1(2);
		t1.setA2(2);
		t1.setA3(2);
		t1.setH(2);
		//float u=t1.getA1();
		//System.out.println(u);
		//float v=t1.getH();
		//System.out.println(v);
		
		float p=t1.area();
		System.out.println(p);
		assertEquals((float)0,p);
	}


}
