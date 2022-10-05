
public class Shoot_Minion {

   // instance variables
   private  double bullet_y;// position
  // private double bullet_vy; // velocity
   private final double bullet_radius,bullet_x;  // radius
   
   // constructor
   public Shoot_Minion(Minions a) {
     bullet_x = a.x_direction();
     bullet_y = a.y_direction() ;
     
    // bullet_vy = -0.018 - 1 * 0.03;//speed of bullet 
     
     bullet_radius = 0.010;//bullet radius
   }
   
   //minion shooting
   public void shooting()
   {
     bullet_y = bullet_y - 0.015;
   }
   
   // draw the minion actions
   public void draw() 
   {
     StdDraw.filledCircle(bullet_x, bullet_y, bullet_radius);
     StdDraw.picture(bullet_x,bullet_y,"ball.jpg",0.010,0.010);
   }
   
 
}
