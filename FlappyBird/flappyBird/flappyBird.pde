int x1 = width/3;
int y1 = height/3;

int birdYVelocity = 20;
int gravity = 5;

int x2 = width;
int upperPipeHeight = (int) random(100, 400);

int pipeGap = 150;
int lowerY = upperPipeHeight + pipeGap;

PImage image;
PImage bottomPipe;
PImage topPipe;
  
void setup() {
  size(400, 600);
  width = 400;
  height = 600;
  
  image = loadImage("flappyBackground.jpg");
  image.resize(width, height);
  
  bottomPipe = loadImage("bottomPipe.png");
  topPipe = loadImage("topPipe.png");
  
}

void draw() {
  background(image);
  
  fill(255, 204, 0);
  ellipse(x1, y1, 40, 35);

  fill(11, 102, 35);
  rect(x2, 0, width/7, upperPipeHeight);
  

  fill(11, 102, 35);
  rect(x2, lowerY, width/7, height - lowerY);
  
  y1 += gravity;
  
  if (mousePressed) {
    y1 -= birdYVelocity;
  }
  

  x2--;
  teleportPipes();
  
}

void teleportPipes(){
  if (x2 + width/7 < 0){
    x2 = width;
    int newUpperPipeHeight = (int) random(100, 400);
    upperPipeHeight = newUpperPipeHeight;
    lowerY = upperPipeHeight + pipeGap;
  }
}

boolean intersectsPipes() { 
  if (y1 < upperPipeHeight && x1 > x2 && x1 < (x2 + width/7)){
    return true; }
  else if (y1 > lowerY && x1 > x2 && x1 < (x2 + width/7)) {
    return true; }
  else { return false; }
}

boolean endGame() {
  if (y1 + 17.5 == height) {
    return true;
  }
  else { return false; }
}
