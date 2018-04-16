package g30126.covrig.mihaela.l6.e1;

import java.awt.*;

public abstract class Shape {

	 private Color color;
	    private int x,y;
	    private String id;
	    private boolean filled=true;
	    
	    public boolean getfilled() {
	        return filled;
	    }
	    public void setfilled(boolean filled) {
	         this.filled=filled;
	    }
	    public String getId() {
	        return id;
	    }
	    public void setId(String id) {
	        this.id=id;
	    }
	    public Shape(Color color) {
	        this.color = color;
	    }

	    public Color getColor() {
	        return color;
	    }

	    public void setColor(Color color) {
	        this.color = color;
	    }
	    public int getX() {
	        return x;
	    }
	    public int getY() {
	        return y;
	    }
	    
	    public void setX(int x) 
	    {
	         this.x=x;
	    }
	    public void setY(int y) 
	    {
	        this.y=y;
	    }

	    public abstract void draw(Graphics g);
}
