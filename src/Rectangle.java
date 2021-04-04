package app;

import java.util.*;

public class Rectangle{

    private double lowerLeftCornerX;       // upper-left corner of rectangle
    private double lowerLeftCornerY;       // upper-left corner of rectangle
    private double width;   // width of the rectangle
    private double height;  // height of the rectangle

    public double getlowerLeftCornerX(){
        return this.lowerLeftCornerX;
    }

    public double getlowerLeftCornerY(){
        return this.lowerLeftCornerY;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setlowerLeftCornerX(double x){
        this.lowerLeftCornerX = x;
    }

    public void setlowerLeftCornerY(double y){
        this.lowerLeftCornerY = y;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public Rectangle(){

    }

    public boolean isSquare( ){
        if (this.width > 0 && this.height > 0)
            return this.width == this.height;
        return false;
    }

    public boolean isPoint(){
      if(this.width == 0 && this.height == 0)
        return true;
      return false;
    }

    public int getQuadrant(){
      if (!isPoint()){
        if (this.lowerLeftCornerX > 0 && this.lowerLeftCornerY > 0)
          return 1;
        else if (this.lowerLeftCornerX < 0 && this.lowerLeftCornerY > 0)
          return 2;
        else if (this.lowerLeftCornerX < 0 && this.lowerLeftCornerY < 0)
          return 3;
        else
          return 4;
      }

      return -1;
    }

    public Rectangle(double x, double y, double width, double height){
        this.lowerLeftCornerX = x;
        this.lowerLeftCornerY = y;

        this.width = width;
        this.height = height;
    }

    // Returns true if this Rectangle intersects otherRect.
    public boolean intersects(Rectangle otherRect) {
        return (
            otherRect.width > 0 && otherRect.height > 0 &&
            this.width > 0 && this.height > 0 &&
            otherRect.lowerLeftCornerX < this.lowerLeftCornerX + this.width &&
            otherRect.lowerLeftCornerX + otherRect.width > this.lowerLeftCornerX &&
            otherRect.lowerLeftCornerY < this.lowerLeftCornerY + this.height &&
            otherRect.lowerLeftCornerY + otherRect.height > this.lowerLeftCornerY
        );
    }

    // Returns true if this Rectangle contains otherRect.
    public boolean contains(Rectangle otherRect) {
        return (
            otherRect.width > 0 && otherRect.height > 0 &&
            this.width > 0 && this.height > 0 &&
            otherRect.lowerLeftCornerX >= this.lowerLeftCornerX &&
            otherRect.lowerLeftCornerX + otherRect.width <= this.lowerLeftCornerX + this.width &&
            otherRect.lowerLeftCornerY >= this.lowerLeftCornerY &&
            otherRect.lowerLeftCornerY + otherRect.height <= this.lowerLeftCornerY + this.height
        );
    }


    // Return true if any of the sides are adjacent
    public boolean isAdjacent(Rectangle otherRect){
        double y1 = this.lowerLeftCornerY + this.height;
        double y2 = otherRect.lowerLeftCornerY+otherRect.height;

        double x1 = this.lowerLeftCornerX+this.width;
        double x2 = otherRect.lowerLeftCornerX+otherRect.width;

        //any of the four sides can be adjacent..
        boolean topAdj = (
            Double.compare(y1,otherRect.lowerLeftCornerY) == 0 &&
            Double.compare(otherRect.lowerLeftCornerX, this.lowerLeftCornerX) == 0);

        boolean bottomAdj = (
            Double.compare(y2, otherRect.lowerLeftCornerY) == 0 &&
            Double.compare(otherRect.lowerLeftCornerX, this.lowerLeftCornerX) == 0);

        boolean rightAdj = (
            Double.compare(x1, otherRect.lowerLeftCornerX) == 0 &&
            Double.compare(otherRect.lowerLeftCornerY, this.lowerLeftCornerY) == 0);

        boolean leftAdj = (
            Double.compare(x2, this.lowerLeftCornerX) == 0 &&
            Double.compare(otherRect.lowerLeftCornerY, this.lowerLeftCornerY) == 0);

        if (topAdj || bottomAdj || rightAdj || leftAdj) {
            return true;
        }
        return false;
    }
}
