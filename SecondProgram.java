/*Use of access modifiers in outside package*/

package package2;
import package1.*;

class SecondProgram
{
	public static void main(String args[])
	{
		FirstProgram1 ob = new FirstProgram1();
		//ob.m1();Not allowed due to default
		//ob.m2();Not allowed due to private
		//ob.m3();Not allowed due to protected
		ob.m4();
	}
}