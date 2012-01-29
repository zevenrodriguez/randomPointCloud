import processing.core.*; 

import processing.opengl.*; 

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

ArrayList pointCloud;

public void setup() {
  size(800, 800, OPENGL);
 // pointCloud = new Arraylist();
}


public void draw() {
  background(255);
  scale(-1);
  strokeWeight(5);
  point(10, 30, 100);
}

public void keypressed() {
  if (key == UP) {
    pointNumber++;
  }

  if (key == DOWN) {
    pointNumber--;
    if (pointNumber == 0) {

      pointNumber = 0;
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

  Cloud() {
  }


  public void show() {
  }
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "randomPointCloud" });
  }
}
