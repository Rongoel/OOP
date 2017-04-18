package viergewinnt;
import java.awt.*;


public class CircleGrid {
	
  private int n, m, d;
  
	public CircleGrid(int n, int m, int diameter) {
		
		this.m = m;
		this.n = n;
		this.d = diameter;
		
		

		
	}
  
  public void draw(Graphics gr){
  
  for (int i = 0; i<=n; i++){
	  for( int j = 0; j<=m; j++){
		  Circle c = new Circle((j*d),(i*d),(d));
		  c.draw(gr);
		  
	  }
		  
		  
	  }
  }
	public Position clicked(int x, int y) {
		int coloumn;
		int row;
		
		coloumn = x/d;
		row = y/d;
		
		if(coloumn<0 || row <0 || coloumn >=n || row>=m)
			return null;
		
		return new Position(row , coloumn);
		}
	}
		
	   
	    	
		
	
		  
  
  
  
  
  


  



