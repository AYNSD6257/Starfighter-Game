//© A+ Computer Science  -  www.apluscompsci.com
//Name - Aayan Asad
//Date - May 31st 2024
//Class - AP Computer Science A
//Lab - Starfighter

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
public class Alien extends MovingThing {
   private int speed;
   private Image image;
   public Alien() {
      this(0,0,30,30,0);
   }
   public Alien(int x, int y) {
      super(x,y);
   }
   public Alien(int x, int y, int w, int h, int s) {
      super(x, y, w, h);
      speed=s;
      try{
         image = ImageIO.read(new File("images/alien.jpg"));
      }
      catch(Exception e){
      }
   }
   public void setSpeed(int s) {
      speed = s;
   }
   public int getSpeed(){
      return 0;
   }
   public void draw( Graphics window ) {
      window.drawImage(image,getX(),getY(),80,80,null);
   }
   public void move(String direction) {
      if (direction.equals("LEFT")) {
         setX(getX() + speed);
      }
      if (direction.equals("RIGHT")) {
         setX(getX() - speed);
      }                                   
      if (direction.equals("DOWN")) {
         setY(getY() + speed);
      }
      if (direction.equals("UP")) {
         setY(getY() - speed);
      }
   }
   public String toString(){
      return "Alien " + super.toString() + " Speed " + getSpeed();
   }
}