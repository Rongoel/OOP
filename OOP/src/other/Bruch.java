package other;

public class Bruch implements Comparable<Bruch>{
	int zaehler, nenner;
	
	// returns the value of zaehler
	public int getzaehler(){ 
		return zaehler;
	}
	
	// returns the value of nenner
	public int getnenner(){
		return nenner;
	}
	
	// converts nenner and zaehler into the int z, n
	public Bruch(int z, int n) {
		zaehler = z;
		nenner = n;
		normalize();
		
	// generates the fraction z/1
	}
	public Bruch(int z){
	    zaehler = z;
	    nenner = 1;
	    
	}
	
	// multiplies the the two fractions defined in TestBruch
	public Bruch mul(Bruch other){
		
		return new Bruch(this.zaehler*other.getzaehler(),this.nenner*other.getnenner());	
		
		
	}
	
	// gives the recursive of a fraction
	public Bruch rec(){
		return new Bruch(nenner,zaehler);
		
	}
	
	// returns the string with the content ( zaehler/nenner )
	public String toString(){
		return zaehler+"/"+nenner;
	}
		
		
	// divides the second fraction with the recursive of the first
	public Bruch div(Bruch other) {
		
		return mul(other.rec());
	
	}
	// returns the biggest common denominator 
	private static int ggt(int a, int b){
		
		int h = (a > b) ? b : a;
		
		for (int ggt = h; ggt > 1; ggt--){
			if ((a % ggt) == 0 && (b%ggt) ==0){
				return ggt;
			}
			
		}
		return 1;
		
	}
	
	// Reduces the fraction
	public void reduce(){
		int ggt;
		
		ggt = ggt(zaehler,nenner);
		zaehler = zaehler / ggt;
		nenner = nenner / ggt;
		
		
	}
	
	//  returns the sum of the two fractions
	public Bruch add(Bruch other){
		Bruch b = new Bruch((this.zaehler*other.getnenner())+(other.getzaehler()*this.nenner),(this.getnenner()*other.getnenner()));
    b.reduce();
    return b;
		
	}
	
	// returns the negative of the fraction this
	public Bruch neg(){
		return new Bruch(-zaehler,nenner);
	}
	
	// returns the difference of this and other
	public Bruch sub(Bruch other){
		return add(other.neg());
		
	}
	
	// commpares the two fractions
	@Override
	public int compareTo (Bruch other){
		if(this.sub(other).getzaehler()<0)
			return -1;
		if (this.sub(other).getzaehler()>0)
			return 1;
		else
			return 0;
			
		
	}
	
	// returns true if they are equal and false when not
	public boolean equals(Bruch other){
		if(compareTo(other)==0)
			return true;
		else 
			return false;
		
		
	}	
	
	// returns true if other is less than this and false if not
	public boolean isLess(Bruch other){
		if(compareTo(other)==-1)
			return true;
		else 
			return false;
	}
	
	// returns true if other is greater than this and false if not
	public boolean isGreater(Bruch other){
		if(compareTo(other)== 1)
			return true;
		else 
			return false;
	}
	
	// multiplies zeahler and nenner with k
	private void expand(int k){
	    this.zaehler *= k;
	    this.nenner *= k;
	          
	          
	 
	// normalizes the fraction this by running the expand function with the modifier -1
	}
	 private void normalize(){
	       if(this.nenner < 0)
	         expand(-1);
	}
	
	
	
	
	
	}
	

	

