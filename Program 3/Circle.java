package modul9;
public class Circle extends Shape{
   private double a = 10;
    private String name;	
   
    public String getName() {
	 	name = "This Is Circle";
	 	return name;
    } 
        public void setArea(int a) {
		this.a = a;
    }
	
    public double getArea() { 
	 	area = Math.PI * Math.pow(a,2);
	 	return area;
    }
	
    public static void main(String []args) {
	 Circle l = new Circle();
	 System.out.println("Name bentuk : " +l.getName());
	 System.out.println("Jari-jari   : " +l.getArea());
    }

}
