
public class Minions {

 // instance variables
   private  double rx, ry;        // position
   private double vx;        // velocity
   private final double radius;  // radius
   
   // constructor
   public Minions(double x,double y,double r) {
     rx = x;//x position
     ry = y;//y position
     vx     = 0.012 - 1 * 0.03;//speed of minion   
     radius = r;//radious of ball
   }
   
   // bounce of vertical wall by reflecting x-velocity
   private void bounceOffVerticalWall() { 
     vx = -vx;   //change direction
     ry = ry - 0.1;//go down after bouncing off wall
   }
   
   // move the minion
   public void move(Minions b,Minions c) {
     if( (  (rx + vx) < 0.0    ) || (   (Math.abs(rx + vx) + radius)   >   2.0) )
     {
       bounceOffVerticalWall();//when minion touches wall
     }
     else if((c.sensor() == 1)||(b.sensor()==1))
     {
       bounceOffVerticalWall();//when minion touches wall it makes all other minions bounce off wall
     }
     rx = rx + vx;//continuously move minion   
   }
   
   //x co od
   public double x_direction()
   {
     return rx;    
   }
   //y co od
   public double y_direction()
   {
     return ry;    
   }
   
   //to detect the extreme left and right minion to cause the rest to change direction
   public int sensor()
   {
      if( ((rx + vx) < 0.0) || (Math.abs(rx + vx) + radius > 2.0) ) return 1; 
     else return 0;
   }
   

   // draw the minion actions
   public void draw() {
       StdDraw.picture(rx,ry,"pinky.png",0.15,0.15);
   }
   
   //the x cord of minion
   public double x_position()
   {
     return rx;
   }
   
   //the y cord of minion
   public double y_position()
   {
     return ry;
   }
   

   
}
