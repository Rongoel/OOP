package other;

public class Bruch implements Comparable<Bruch>{
	int zaehler, nenner;
	public int getzaehler(){
		return zaehler;
	}
	public int getnenner(){
		return nenner;
	}
	public Bruch(int z, int n) {
		zaehler = z;
		nenner = n;
	}
	public Bruch mul(Bruch other){
		
		return new Bruch(this.zaehler*other.getzaehler(),this.nenner*other.getnenner());	
		
		
	}
	public Bruch rec(){
		return new Bruch(nenner,zaehler);
		
	}
	public String toString(){
		return zaehler+"/"+nenner;
	}
		
		
	
	public Bruch div(Bruch other) {
		
		return mul(other.rec());
	
	}
	
	private static int ggt(int a, int b){
		
		int h = (a > b) ? b : a;
		
		for (int ggt = h; ggt > 1; ggt--){
			if ((a % ggt) == 0 && (b%ggt) ==0){
				return ggt;
			}
			
		}
		return 1;
		
	}
	public void reduce(){
		int ggt;
		
		ggt = ggt(zaehler,nenner);
		zaehler = zaehler / ggt;
		nenner = nenner / ggt;
		
		
	}
	public Bruch add(Bruch other){
		Bruch b = new Bruch((this.zaehler*other.getnenner())+(other.getzaehler()*this.nenner),(this.getnenner()*other.getnenner()));
    b.reduce();
    return b;
		
	}
	public Bruch neg(){
		return new Bruch(-zaehler,nenner);
	}
	
	
	public Bruch sub(Bruch other){
		return add(other.neg());
		
	}
	
	@Override
	public int compareTo (Bruch other){
		if(this.sub(other).getzaehler()<0)
			return -1;
		if (this.sub(other).getzaehler()>0)
			return 1;
		else
			return 0;
			
		
	}
	public boolean equals(Bruch other){
		if(compareTo(other)==0)
			return true;
		else 
			return false;
		
		
		}	
	
	
	public boolean isLess(Bruch other){
		if(compareTo(other)==-1)
			return true;
		else 
			return false;
	}
	public boolean isGreater(Bruch other){
		if(compareTo(other)== 1)
			return true;
		else 
			return false;
	}
	
	}
	

	

