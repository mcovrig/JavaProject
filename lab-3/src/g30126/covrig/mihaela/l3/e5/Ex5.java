package g30126.covrig.mihaela.l3.e5;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

public class Ex5
{
   public static void main(String[] args)
   {
      // Set up the initial situation
      City ny = new City();
      Thing parcel = new Thing(ny, 2, 2);
      Wall blockAve0 = new Wall(ny, 1, 1, Direction.WEST);
      Wall blockAve1 = new Wall(ny, 2, 1, Direction.WEST);
      Wall blockAve2 = new Wall(ny, 1, 2, Direction.EAST);
      //Wall blockAve3 = new Wall(ny, 2, 2, Direction.EAST);
      Wall blockAve4 = new Wall(ny, 1, 1, Direction.NORTH);
      Wall blockAve5 = new Wall(ny, 1, 2, Direction.NORTH);
      Wall blockAve3 = new Wall(ny, 1, 2, Direction.SOUTH);
      Wall blockAve6 = new Wall(ny, 2, 1, Direction.SOUTH);
     // Wall blockAve7 = new Wall(ny, 2, 2, Direction.SOUTH);
      Robot mark = new Robot(ny, 1, 2, Direction.SOUTH);
      //Robot ann = new Robot(ny, 0, 1, Direction.EAST);
 
 
      // mark goes around the roadblock
      //mark.turnLeft();
     
      mark.turnLeft();
      mark.turnLeft();
      mark.turnLeft();
      mark.move();
      
      mark.turnLeft();     // start turning right as three turn lefts
      mark.move();
      
      mark.turnLeft();
      mark.move();
      mark.pickThing();
      mark.turnLeft();
      mark.turnLeft();
     
      mark.move();
      mark.turnLeft();
      mark.turnLeft();
      mark.turnLeft();
      mark.move();
      mark.turnLeft();
      mark.turnLeft();
      mark.turnLeft();
      mark.move();
      mark.turnLeft();
      mark.turnLeft();
      mark.turnLeft();
      //mark.putThing();
      
      
 
     
   }
} 