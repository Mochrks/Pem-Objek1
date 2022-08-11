package modul9;
public class Square extends Shape{
    private double c = 3;
    private String name;
   
    public String getName() {
	 	name = "This Is Square";
	 	return name;
    }
	
    public void setArea(int s) {
	 	this.c = c;
    }
	
    public double getArea() {
	 	area = c*4;
	 	return area;
    }
	
    public static void main(String[] args) {
	 Square p = new Square();
	 System.out.println("Name bentuk : " +p.getName());
	 System.out.println("Luas bentuk : " +p.getArea());
    }

}
