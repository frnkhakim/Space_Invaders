
public class Missile {

  // instance variables
   private double missile_y;// position
   private double missile_vy; // velocity
   private double missile_vx; // velocity
    private  double missile_xx;//solid x position
   private double missile_radius;  // radius
   private final double missile_x;//solid x position
   
   
   // constructor
   public Missile(Move a) {
     missile_x = a.x_direction();//x direction
     missile_y = a.y_direction();//y direction
     missile_xx = missile_x;//x direction
     missile_vy =0.015 + 1 * 0.03;//speed of missle
     
     missile_vx =0.015 + 1 * 0.03;//speed of missle
     
     missile_radius = 0.010;//missle radius
     
   }
   
   //minion shooting
   public void shooting(Shooter a)
   {
     double radians = Math.toRadians(a.degree());
     missile_y = missile_y + Math.sin( radians)* missile_vy;
     missile_xx = missile_xx + Math.cos( radians)* missile_vx;
       
   }
   
   //the x cord of missle
   public double x_position()
   {
     return missile_xx;
   }
   
   //the y cord of missle
   public double y_position()
   {
     return missile_y;
   }
   
   
   
   // draw the missile action
   public void draw(Shooter a) 
   {
     StdDraw.filledCircle(missile_xx, missile_y, missile_radius);
      StdDraw.picture(missile_xx,missile_y,"missile.png",0.15 ,0.15,a.degree()-90);
      
   }
   
}
