import junit.framework.TestCase;

public class RectangleTestPerimeter extends TestCase {
	
	public void testperimeter() {
		NewRectangle R1=new NewRectangle();
		R1.setLength(2);
		R1.setBreadth(3);
		float p=R1.perimeter();
		assertEquals((float)10,p);
		
	}

	public void testperimeter1() {
		NewRectangle R1=new NewRectangle();
		R1.setLength(1);
		R1.setBreadth(3);
		float p=R1.perimeter();
		assertEquals((float)10,p);
		
	}
	
	public void testperimeter2() {
		NewRectangle R1=new NewRectangle();
		R1.setLength(1);
		R1.setBreadth(1);
		float p=R1.perimeter();
		assertEquals((float)4,p);
		
	}
	
	public void testperimeter3() {
		NewRectangle R1=new NewRectangle();
		R1.setLength(2);
		R1.setBreadth(2);
		float p=R1.perimeter();
		assertEquals((float)1,p);
		
	}
}
