import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // images
 PImage imgSunset;
 PImage imgMountain;
 PImage imgMoon;
// _________________________
// float variables
 float fltSunsetX = 0;
 float fltSunsetY = 0;
// _________________________
 float fltMountainX = 0;
 float fltMountainY = 0;
// _________________________
 float fltMoonX = 0;
 float fltMoonY = 0;
// _________________________
  float x = 150;
  float y = 100;
  float xSpeed = 4;
  float ySpeed = 4;
// _________________________
  //float circleY = 0;
 // float ySpeed1 = 1;
// _________________________
  // rectangle boundary
  float centerRectX = 155;
  float centerRectY = 120; 
  float centerRectWidth = 50;
  float centerRectHeight = 100;
// _________________________
  // collision rectangle
  float bouncingRectX = 10;
  float bouncingRectY = 10;
  float bouncingRectWidth = 100;
  float bouncingRectHeight = 50;
  float bouncingSpeedX = 1;
  float bouncingSpeedY = 1;
// _________________________
  // collision rectangle 1
  float bouncingRectX1 = 20;
  float bouncingRectY1 = 30;
  float bouncingRectWidth1 = 50;
  float bouncingRectHeight1 = 50;
  float bouncingSpeedX1 = 2;
  float bouncingSpeedY1 = 1;
// _________________________
 
 /**
  * Called once at the beginning of execution, put your size all in this method
  */
 public void settings() {
 // put your size call here
   size(400, 400);
 }



 /**
  * Called once at the beginning of execution.  Add initial set up
  * values here i.e background, stroke, fill etc.
  */
 public void setup() {
   background(0);
   imgSunset = loadImage("Sunset.jpg");
   imgMountain = loadImage("Mountain.png");
   imgMoon = loadImage("Moon.jpg");
// _________________________
   //resize background image
   imgSunset.resize(imgSunset.width/1, imgSunset.height/1);
   imgMoon.resize(imgMoon.width/2, imgMoon.height/2);
 }




 /**
  * Called repeatedly, anything drawn to the screen goes here
  */
 public void draw() {
 
 // load to screen
 image(imgSunset, fltSunsetX, fltSunsetY);
 image(imgMountain, fltMountainX, fltMountainY);
 image(imgMoon, fltMoonX, fltMoonY);
// _________________________

  fill(115, 161, 252);
  noStroke();
  ellipse(x ,y, 25, 25);
  x += xSpeed;
  y += ySpeed;
 
  if (x < 0 || x > width) {
    xSpeed *= -1;
  }
 
  if (y < 0  || y > height) {
    ySpeed *= -1;
  }



// _________________________

// fill(148, 9, 9);
 //ellipse(100, circleY, 50, 50);
 //circleY = circleY + ySpeed1;



// _________________________
// larger circle
//if(circleY < 0 || circleY > height) {
  //ySpeed1 = ySpeed1 * -1;
//}

// _________________________

  // center rectangle
  fill(194, 150, 224);
  rect(centerRectX, centerRectY, centerRectWidth, centerRectHeight);

  if (bouncingRectX + bouncingRectWidth + bouncingSpeedX > centerRectX &&
      bouncingRectX + bouncingSpeedX < centerRectY + centerRectWidth &&
      bouncingRectY + bouncingRectHeight > centerRectY &&
      bouncingRectY < centerRectY + centerRectHeight) {
        bouncingSpeedX *= -1;
      } 

      else if(bouncingRectX < -1 || bouncingRectX + bouncingRectWidth > width) {
        bouncingSpeedX *= -1;
      }

      if (bouncingRectX + bouncingRectWidth > centerRectX &&
      bouncingRectX < centerRectY + centerRectWidth &&
      bouncingRectY + bouncingRectHeight + bouncingSpeedY > centerRectY &&
      bouncingRectY + bouncingSpeedY < centerRectY + centerRectHeight) {
        bouncingSpeedY *= -1;
      } 

      else if(bouncingRectY < 0 || bouncingRectY + bouncingRectHeight > height) {
        bouncingSpeedY *= -1;
      }

      bouncingRectX += bouncingSpeedX;
      bouncingRectY += bouncingSpeedY;

      //bouncing rectangle
      fill(44, 57, 77);
      rect(bouncingRectX, bouncingRectY, bouncingRectWidth, bouncingRectHeight);
// _________________________
  
  fill(194, 150, 224);
  rect(centerRectX, centerRectY, centerRectWidth, centerRectHeight);
  if (bouncingRectX1 + bouncingRectWidth1 + bouncingSpeedX1 > centerRectX &&
      bouncingRectX1 + bouncingSpeedX1 < centerRectY + centerRectWidth &&
      bouncingRectY1 + bouncingRectHeight1 > centerRectY &&
      bouncingRectY1 < centerRectY + centerRectHeight) {
        bouncingSpeedX1 *= -1;
      } 

      else if(bouncingRectX1 < 0 || bouncingRectX1 + bouncingRectHeight > width) {
        bouncingSpeedX1 *= -1;
      }

      if (bouncingRectX1 + bouncingRectWidth1 > centerRectX &&
      bouncingRectX1 < centerRectY + centerRectWidth &&
      bouncingRectY1 + bouncingRectHeight1 + bouncingSpeedY1 > centerRectY &&
      bouncingRectY1 + bouncingSpeedY1 < centerRectY + centerRectHeight) {
        bouncingSpeedY1 *= -1;
      } 

      else if(bouncingRectY1 < 0 || bouncingRectY1 + bouncingRectHeight > height) {
        bouncingSpeedY1 *= -1;
      }

      bouncingRectX1 += bouncingSpeedX1;
      bouncingRectY1 += bouncingSpeedY1;

      //bouncing rectangle
      fill(115, 47, 163);
      rect(bouncingRectX1, bouncingRectY1, bouncingRectWidth1, bouncingRectHeight1);


  }

  // define other methods down here.
 }
 


