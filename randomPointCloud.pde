
int pointNumber = 0;
int angle = 0;


ArrayList pointCloud;
PrintWriter output;

void setup() {
  //smooth();
  size(800, 800, OPENGL);
  pointCloud = new ArrayList();
  output = createWriter("points.txt");
}


void draw() {
  background(255);
  translate(0, height); 
  scale(1, -1, 1);  
  rotateX(radians(angle));

  //  point(1, 1, 0);

  if (pointCloud.size() > 0) {
    for (int i= 0; i < pointCloud.size(); i++) {
      Cloud allPoints = (Cloud) pointCloud.get(i);
      allPoints.display();
    }
  }
}


void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      pointCloud.add(new Cloud((int)random(width), (int)random(height), (int)random(height)));
    } 
    else if (keyCode == DOWN) {
      if (pointCloud.size() > 0) {
        pointCloud.remove(pointCloud.size() - 1);
      }
    }
  }
  if (key == 'x') {
    angle = angle-15;
    println(angle) ;
  }
  if (key == 'w') {
    if (pointCloud.size() > 0) {
      for (int i= 0; i < pointCloud.size(); i++) {
        Cloud allPointsOoutput = (Cloud) pointCloud.get(i);
        output.println("p" + i + " " +  allPointsOoutput.x + " " + allPointsOoutput.y + " " + allPointsOoutput.z);
      }
      output.flush(); // Writes the remaining data to the file
      output.close(); // Finishes the file
      println("Printed");
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
