import java.awt.event.KeyEvent;
public class Shooter {

  // instance variables
   private  double rx, ry; 
   private double top_y;
   private double top_x;
   private double sin;
   private double cos;
   private double degrees;
   
   //constructor
   public Shooter()
   {
     //initial positions
     rx  = 1.0;;
     ry = .08 ;
     
     top_y = .25;
     top_x = 1.0;
     degrees = 90;
   }

   //move the turrent
   public void move_turrent(Move a)
   {
     
     rx = a.x_direction();//x direction
     ry = a.y_direction();//y direction
    
     top_x = rx;
     top_y = a.y_direction() + 0.2;
   }
   
   
   
   //angle the cannon
   public void angle(int d)
   {       
     if(d == 2)
     { 
       rotate_right(degrees);   
     }
           
     if(d == 3)
     {
       degrees-=5;
       if(degrees < 0 )
       {
         degrees = 0;
       }
         
       rotate_right(degrees);
     }
     
     if(d == 1)
     {
      degrees+=5;
        if(degrees > 180 )
       {
         degrees = 180;
       }
      rotate_left(degrees);
     }
   }
   
   
   public void rotate_right(double degress)
   {
    
     double hypo = 0.17; 
     
     double radians = Math.toRadians(degress);
     
     sin =  hypo * Math.sin(radians);
     cos =  hypo * Math.cos(radians);
     
     top_y = ry + sin;
     top_x = rx + cos;
      
     
     
   }
   
   public void rotate_left(double degrees)
   {
     

     double hypo = 0.17; 
     
     double radians = Math.toRadians(degrees);
     
     sin =  hypo * Math.sin(radians);
     cos =  hypo * Math.cos(radians);
     
     top_y = ry + sin;
     top_x = rx + cos;
     
   }
   
   public void rotate_stop(double degrees)
   {
     double hypo = 0.17; 
     
     double radians = Math.toRadians(degrees);
     
     sin =  hypo * Math.sin(degrees);
     cos =  hypo * Math.cos(degrees);
     
     top_y = ry + sin;
     top_x = rx + cos;
     
   }
  
   // draw and rotate the cannon
   public void draw() {
     StdDraw.line(rx, ry,top_x, top_y);;
   }
   
    //x direction
   public double x_direction()
   {
     return rx;    
   }
   //y direction
   public double y_direction()
   {
     return ry;    
   }
   
     //x direction
   public double degree()
   {
     return degrees;    
   }
   
   
}
