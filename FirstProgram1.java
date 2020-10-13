/*Use of access modifiers in Java*/

package package1;
public class FirstProgram1
{
	void m1()
	{
		System.out.println("Default");
	}
	private void m2()
	{
		System.out.println("Private");
	}
	protected void m3()
	{
		System.out.println("Protected");
	}
	public void m4()
	{
		System.out.println("Public");
	}
}

/*class DemoPackage extends FirstProgram
{
	public static void main(String args[])
	{
		DemoPackage ob = new DemoPackage();
		ob.m1();
		//ob.m2();Not allowed to call private 
		ob.m3();
		ob.m4();
	}
}*/
