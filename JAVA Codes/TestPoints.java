
class Point2D {
    private int x = 0;
    private int y = 0;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


class Point3D extends Point2D {
    
    private int z = 0;
    public Point3D() {
        super(); 
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y); 
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}


public class TestPoints {
    public static void main(String[] args) {
        
        Point2D p2 = new Point2D(3, 4);
        System.out.println("Point2D: " + p2.toString());

        
        Point3D p3 = new Point3D(5, 6, 7);
        System.out.println("Point3D: " + p3.toString());

        
        p3.setX(10);
        p3.setY(20);
        p3.setZ(30);

        System.out.println("Updated Point3D: " + p3.toString());
    }
}