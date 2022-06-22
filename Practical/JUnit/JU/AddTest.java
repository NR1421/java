package JU;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
    public void Addtest() 
	{
		//creating object class
		MyJUnitClass mju = new MyJUnitClass();
		int result = mju.add(50,70);
		assertEquals(120,result);
	}
}
