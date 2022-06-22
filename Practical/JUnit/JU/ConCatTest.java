package JU;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
    public void ConCatTest() 
	{
		//creating object class
		MyJUnitClass mju = new MyJUnitClass();
		String result = mju.ConCat("Rohan"," Ghadge");
		assertEquals("Rohan Ghadge",result);
	}
}
