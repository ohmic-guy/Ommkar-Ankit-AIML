interface Movable { 
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "Point at (" + x + "," + y + ") with speed (" + xSpeed + "," + ySpeed + ")";
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }
}
class MovableCircle implements Movable {
    int radius;
    MovablePoint center; 

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Circle center: " + center + " and radius: " + radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}
public class Main {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(2, 3, 1, 1);
        System.out.println(p1);
        p1.moveUp();
        System.out.println("After moving up: " + p1);
        MovableCircle c1 = new MovableCircle(0, 0, 2, 2, 5);
        System.out.println(c1);
        c1.moveRight();
        System.out.println("After moving right: " + c1);
    }
}
