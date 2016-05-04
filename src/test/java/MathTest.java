

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MathTest {
	
	@Test(dataProvider = "dpAdd")
	public void testAdd(int a, int b) {
		
		try {
			
			MathSolution ms = new MathSolution();
			int actual = ms.Add(a, b);
			Assert.assertEquals(actual , 8);
		} catch(Exception e) {
			System.out.println("Enter the valid inputs");
		}
	}
	
	@Test(dataProvider = "dpSub")
	public void testSub(int a, int b) {
		
		try {
			
			MathSolution ms = new MathSolution();
			int actual 	= ms.Sub(a , b);
			Assert.assertEquals(actual , 0);
		} catch(Exception e) {
			System.out.println("Enter the valid inputs");
		}
	}
	
	@Test(dataProvider = "dpMulti")
	public void testMult(int a, int b) {
		
		try {
			
			MathSolution ms = new MathSolution();
			int actual = ms.Multi(a , b);
			Assert.assertEquals(actual , 25);
		} catch(Exception e) {
			System.out.println("Enter the valid inputs");
		}
	}
	
	@Test(dataProvider = "dpDivide")
	public void testDivide(int a, int b) {
		
		try {
			
			MathSolution ms = new MathSolution();
			int actual = ms.Divide(a , b);
			Assert.assertEquals(actual , 1);
		} catch(Exception e) {
			System.out.println("Enter the valid inputs");
		}
	}
	
	@DataProvider
	public Object[][] dpAdd() {
		
		return new Object[][] {
			new Object[] {3, 5} 
		};
	}
	
	@DataProvider
	public Object[][] dpSub() {
			
		return new Object[][] {
			new Object[] { 5 , 5 }
		};
	}
	
	@DataProvider
	public Object[][] dpMulti() {
			
		return new Object[][] {
			new Object[] { 5 , 5 }
		};
	}
		
	@DataProvider
	public Object[][] dpDivide() {
			
		return new Object[][] {
			new Object[] { 5 , 5 } 
		};
	}
}
