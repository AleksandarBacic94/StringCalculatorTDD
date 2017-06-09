import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test (expected = StringCalculatorException.class)
	public void test() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.add(" "), 0);
	}
	
	@Test (expected = StringCalculatorException.class)
	public void Add_test1() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.add("1,2,3"),6);
	} 
	
	@Test (expected = StringCalculatorException.class)
	public void Add_test2() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.add("1\n2,3"),6);
	}
	
	@Test (expected = StringCalculatorException.class)
	public void Add_test3() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.add("1,-2,3");
	}
	
	@Test (expected = StringCalculatorException.class)
	public void Oduzimanje_test1() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.substract("5,2,1"),2);
	}
	
	@Test (expected = StringCalculatorException.class)
	public void Oduzimanje_test2() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.substract("6\n4,1"),1);
	}
	
	@Test (expected = StringCalculatorException.class)	
	public void Oduzimanje_test3() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.substract("1,-5,3");
	}
	@Test (expected = StringCalculatorException.class)
	public void Oduzimanje_test4() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.substract("6,2\n1"),3);
	}
	@Test (expected = StringCalculatorException.class)	
	public void Oduzimanje_test5() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.substract("1,\n");
	}
	
	@Test (expected = StringCalculatorException.class)
	public void Mnozenje_test1() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.multiply("1,2,3"),6);
	}
	
	
	@Test (expected = StringCalculatorException.class)
	public void Mnozenje_test2() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.multiply("1\n4,3"),12);
	}
	
	@Test (expected = StringCalculatorException.class)	
	public void Mnozenje_test3() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.multiply("1,-5,3");
	}
	
	@Test (expected = StringCalculatorException.class)
	public void Mnozenje_test4() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.multiply("1,2\n3"),6);
	}
	
	
	@Test (expected = StringCalculatorException.class)
	public void Deljenje_test1() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.divide("25,5,1"),5);
	}
	
	@Test (expected = StringCalculatorException.class)
	public void Deljenje_test2() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(calc.divide("48\n6,8"),1);
	}
	
	@Test (expected = StringCalculatorException.class)
	public void Deljenje_test3() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.divide("8,-5,3");
	}
	
	
	
	
	

	
	
	

}