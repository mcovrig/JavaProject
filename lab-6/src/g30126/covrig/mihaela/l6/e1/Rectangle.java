package g30126.covrig.mihaela.l6.e1;

import java.awt.*;

public class Rectangle extends Shape{

	 private int length;

	    public Rectangle(Color color, int length, int width) {
	        super(color);
	        this.length = length;
	    }
	    public int getLength() {
	        return length;
	    }
	    


	    @Override
	    public void draw(Graphics g) {
	        System.out.println("Drawing a rectangel "+this.length+" "+getColor().toString());
	        g.setColor(getColor());
	        if (getfilled()==true) {
	        	g.fillRect(getX(), getY(), length, length);
	        }
	        else
	       g.drawRect(getX(), getY(), length, length);
	    }
}