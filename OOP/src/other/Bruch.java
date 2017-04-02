package other;

public class Bruch {
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
	

}