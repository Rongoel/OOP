
package other;

public class TestBruch {
	public static void main (String [] args) {
	    
		
	    // defines the two fractions
	    
	    Bruch a, b, c;
		a=new Bruch(-4,2);
		b=new Bruch(10,13);
		c=a.mul(b);
		
		
		// prints the different results in the console
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.mul(b));
		System.out.println(a.rec());
		System.out.println(b.rec());
		//System.out.println(Bruch.ggt(2,6));
		/* a.reduce();
		System.out.println(a); */
		System.out.println(a.equals(b));
		System.out.println(a.isLess(b));
		System.out.println(a.isGreater(b));
		

		
		
		
		
	}

}