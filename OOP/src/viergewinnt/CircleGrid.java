package viergewinnt;
import java.awt.*;


public class CircleGrid {
	
  private int n, m, d;
  
  
  // sets the grit size based on the size of the circles
	public CircleGrid(int n, int m, int diameter) {
		
		this.m = m;
		this.n = n;
		this.d = diameter;
		
		

		
	}
  
	//draws a circle in the grid
  public void draw(Graphics gr){
  
  for (int i = 0; i<=n; i++){
	  for( int j = 0; j<=m; j++){
		  Circle c = new Circle((j*d),(i*d),(d));
		  c.draw(gr);
		  
	  }
		  
		  
	  }
  }
  // Checks if the click was inside the grid
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
		
	   
	    	
		
	
		  
  
  
  
  
  


  



