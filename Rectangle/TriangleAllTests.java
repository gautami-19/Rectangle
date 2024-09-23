
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * regular
 * @author Gautami Shirodkar
 * @description all the tests 
 * @since 14-09-2024
 * @version 1.0
 * @exception PersonNotFOUND
 * 
 */


public class TriangleAllTests extends TestCase {

	public static Test suite() {
		

		TestSuite suite = new TestSuite(TriangleAllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TriangleTestArea.class);
		suite.addTestSuite(TriangleTestPerimeter.class);
		//$JUnit-END$
		return suite;
	}

}
