package MainPackage;

import junit.framework.TestCase;


public class MyClassTest extends TestCase {
	
	public void testSum() {
		
		assertEquals("10 + 10 must Equal 20",20,MyClass.AddTwoNumbers(10, 10));
		
	}
	
	public void testBoolean() {
		
		assertEquals("Method must Yield to True",true,MyClass.ReturnTrue());
		
	}
	
	
}