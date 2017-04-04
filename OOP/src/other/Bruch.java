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
	}	
	

