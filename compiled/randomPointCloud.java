import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class randomPointCloud extends PApplet {


int pointNumber = 0;
int angle = 0;


ArrayList pointCloud;
PrintWriter output;

public void setup() {
  //smooth();
  size(800, 800, OPENGL);
  pointCloud = new ArrayList();
  output = createWriter("points.txt");
}


public void draw() {
  background(255);
  translate(0, height); 
  scale(1, -1, 1);  
  rotateX(radians(angle));

  //  point(1, 1, 0);

  if (pointCloud.size() >  0) {
    for (int i= 0; i <  pointCloud.size(); i++) {
      Cloud allPoints = (Cloud) pointCloud.get(i);
      allPoints.display();
    }
  }
}


public void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      pointCloud.add(new Cloud((int)random(width), (int)random(height), (int)random(height)));
    } 
    else if (keyCode == DOWN) {
      if (pointCloud.size() >  0) {
        pointCloud.remove(pointCloud.size() - 1);
      }
    }
  }
  if (key == 'x') {
    angle = angle-15;
    println(angle) ;
  }
  if (key == 'w') {
    if (pointCloud.size() >  0) {
      for (int i= 0; i <  pointCloud.size(); i++) {
        Cloud allPointsOoutput = (Cloud) pointCloud.get(i);
        output.println(i + " " +  allPointsOoutput.x + " " + allPointsOoutput.y + " " + allPointsOoutput.z);
      }
      output.flush(); // Writes the remaining data to the file
      output.close(); // Finishes the file
      println("Printed " + pointCloud.size() + " points");
      
    }
  }
}




/*
PrintWriter output;
 
 void setup() {
 // Create a new file in the sketch directory
 output = createWriter("positions.txt"); 
 }
 
 void draw() {
 point(mouseX, mouseY);
 output.println(mouseX + "t" + mouseY); // Write the coordinate to the file
 }
 
 void keyPressed() {
 output.flush(); // Writes the remaining data to the file
 output.close(); // Finishes the file
 exit(); // Stops the program
 }
 */
class Cloud {

  int x= 0;
  int y=0;
  int z=0;


  Cloud(int _x, int _y, int _z) {

    x= _x;
    y=_y;
    z=_z;
  }


  public void display() {
    strokeWeight(5);
    point(x,y,z);
  }
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "randomPointCloud" });
  }
}
