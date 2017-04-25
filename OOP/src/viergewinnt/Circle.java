package viergewinnt;
import java.awt.*;

public class Circle
{

 public int left, top, diameter;
 public Color fill=Color.BLACK; 
 
 // sets th
 public Circle(int l, int t, int d)
 {
 left=l;
 top=t;
 diameter=d;
 }

public void setFill(Color f)
{
fill=f;
}

public void draw(Graphics gr)
{
gr.setColor(fill);
gr.fillOval(left, top, diameter, diameter);
}
public boolean clicked(int x, int y) {
	if(x>=left && x<= (left+diameter) 
    		&& y>= top && y <= (top + diameter)){
        return true;}
    else
    	return false;
	
}

}