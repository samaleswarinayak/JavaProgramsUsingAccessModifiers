/*Use of access modifiers in outside package*/

package package2;
import package1.*;

class SecondProgram1 extends FirstProgram1
{
	public static void main(String args[])
	{
		SecondProgram1 ob = new SecondProgram1();
		//ob.m1();Not allowed due to default
		//ob.m2();Not allowed due to private
		ob.m3();
		ob.m4();
	}
}