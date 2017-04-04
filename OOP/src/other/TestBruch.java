
package other;

public class TestBruch {
	public static void main (String [] args) {
		Bruch a, b, c;
		a=new Bruch(4,10);
		b=new Bruch(10,13);
		c=a.mul(b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.mul(b));
		System.out.println(a.rec());
		System.out.println(b.rec());
		//System.out.println(Bruch.ggt(2,6));
		/* a.reduce();
		System.out.println(a); */

		
		
		
		
	}

}