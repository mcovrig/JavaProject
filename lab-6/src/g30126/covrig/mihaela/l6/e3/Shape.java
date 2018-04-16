package g30126.covrig.mihaela.l6.e3;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
    public Color getColor();
    public void setColor(Color color);
    public void setfill(boolean fill);
    public boolean  getfill();
    public int getx();
   public void setx(int x);
   public int gety();
   public void sety(int y);
   public void setId(int i);
   public String getId();
    public void draw(Graphics g);
	public void setId(String string);
	
}
