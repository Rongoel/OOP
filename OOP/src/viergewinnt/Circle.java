package viergewinnt;
import java.awt.*;

public class Circle
{

 public int left, top, diameter;
 public Color fill=Color.BLACK; 
 
 // sets the Dimensions of the Circle
 public Circle(int l, int t, int d)
 {
 left=l;
 top=t;
 diameter=d;
 }

 // Fills the circle
public void setFill(Color f)
{
fill=f;
}

//Initializes the Oval 
public void draw(Graphics gr)
{
gr.setColor(fill);
gr.fillOval(left, top, diameter, diameter);
}

// If statements that spawns Circles when left click is pressed
public boolean clicked(int x, int y) {
	if(x>=left && x<= (left+diameter) 
    		&& y>= top && y <= (top + diameter)){
        return true;}
    else
    	return false;
	
}

}