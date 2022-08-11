package modul7;
public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void geser(int dx, int dy, int dz){
        x += dx;
        y += dy;
        z += dz;
    }

    public void geser(int dx){
        x += dx;
    }

    public void geser(int dx, int dy){
        x += dx;
        y += dy;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }
}
