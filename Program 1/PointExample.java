package modul7;
public class PointExample{
	public static void main(String[] args){
	Point titik = new Point(1,2,3);
	titik.geser(2,3,4);
	titik.geser(1);
	titik.geser(1,1);
	System.out.println("X :" + titik.getX());
	System.out.println("Y :" + titik.getY());
	System.out.println("Z :" + titik.getZ());
	}
}

