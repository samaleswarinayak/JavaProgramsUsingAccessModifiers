/*Use of access modifiers in Java*/

package package1;
class FirstProgram
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
	public static void main(String args[])
	{
		FirstProgram ob = new FirstProgram();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
	}
}
