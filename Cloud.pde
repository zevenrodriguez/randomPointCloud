class Cloud {

  int x= 0;
  int y=0;
  int z=0;


  Cloud(int _x, int _y, int _z) {

    x= _x;
    y=_y;
    z=_z;
  }


  void display() {
    strokeWeight(5);
    point(x,y,z);
  }
}

