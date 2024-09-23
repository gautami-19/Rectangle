import junit.framework.TestCase;

public class RectangleTestArea extends TestCase {
	
		
		public void testarea() {
			NewRectangle R=new NewRectangle();		
			R.setLength(2);
			R.setBreadth(3);
			float a=R.area();
			assertEquals((float)6,a);
		}
		public void testarea1() {
			NewRectangle R=new NewRectangle();		
			R.setLength(1);
			R.setBreadth(2);
			float a=R.area();
			assertEquals((float)3,a);	
		}
		
		public void testarea2() {
			NewRectangle R=new NewRectangle();		
			R.setLength(2);
			R.setBreadth(2);
			float a=R.area();
			assertEquals((float)4,a);	
		}
		
		public void testarea3() {
			NewRectangle R=new NewRectangle();		
			R.setLength(1);
			R.setBreadth(1);
			float a=R.area();
			assertEquals((float)2,a);
				
		}
		

	}


