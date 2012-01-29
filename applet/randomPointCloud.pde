int pointNumber = 0;

ArrayList pointCloud;

void setup() {
  size(800, 800, OPENGL);
 // pointCloud = new Arraylist();
}


void draw() {
  background(255);
  scale(-1);
  strokeWeight(5);
  point(10, 30, 100);
}

void keypressed() {
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
