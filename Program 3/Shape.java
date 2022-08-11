package modul9;
public abstract class Shape {
   protected String name;
    protected double area;
    int b;
    
    public Shape() {
    }
	
    public Shape(String n, float c) {
	      this.name=name;
	      this.area=c;
    }		
	
    public abstract double getArea();
 
    public void setArea(double b) {
		area = b;
    }
	
    public abstract String getName();

}
