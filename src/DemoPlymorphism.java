/*
 * Demo of polymorphism.
 */
public class DemoPlymorphism {
	
	public static void main(String args[])
	{
		PlymorphismTest pt = new PlymorphismTest();
		
		int var = pt.mathOperation(3);
		
		System.out.println(var);
		
		AnotherPolymorphism ap = new AnotherPolymorphism();
		
		float var1 = ap.mathOperations(19, 4);
		
		System.out.println(var1);
	}
}
