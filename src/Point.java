public class Point {
    // instance variables
    private int x;
    private int y;

    // constructor to create a Point object with a particular x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // constructor to create a Point object that sets both x and y to the same value
    public Point(int value) {
        x = value;
        y = value;
    }

    //"no-argument" constructor that creates a Point object with default values
    public Point() {
        x = 0;
        y = 0;
    }

    // "getter" method that returns the x value
    public int getX() {
        return x;
    }

    // "setter" methods that sets the x value of the Point to a new value
    public void setX(int newX) {
        x = newX;
    }

    // "getter" method that returns the y value
    public int getY() {
        return y;
    }

    // "setter" methods that sets the y value of the Point to a new value
    public void setY(int newY) {
        y = newY;
    }

    // method that returns the x and y value as a String coordinate in this format: "(x, y)"
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    // method that returns as a String the quadrant the point is in
    public String quadrant() {
        String quadrant;
        if (x>0 && y>0) {
            quadrant = "I";
        } else if (x<0 && y>0) {
            quadrant = "II";
        } else if (x<0 && y<0) {
            quadrant = "III";
        } else if (x>0 && y<0) {
            quadrant = "IV";
        } else if (x == 0 && y==0) {
            quadrant = "origin";
        } else {
            quadrant = "on an axis";
        }
        return quadrant;
    }
}
