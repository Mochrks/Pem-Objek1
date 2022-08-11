package modul9;
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double computerGrade;
    private double average;
    private static int studentCount;
	
    public StudentRecord() { 
	studentCount++;
    }
	
    public StudentRecord(String temp) {
	this.name = temp;
	studentCount++;
    }
	
    public StudentRecord(String name, String Address) {
   this.name = name;
	this.address = Address;
	studentCount++;
    }

    public StudentRecord(double mGrade, double eGrade, double sGrade, double cGrade) {
	mathGrade = mGrade; 
	englishGrade = eGrade;
	scienceGrade = sGrade;
	computerGrade = cGrade;
	studentCount++;
    }
	
    public String getName() {
	return name;
    }
	
    public void setName(String temp) {
	name = temp;
    }
	
    public String getAddress() {
	return address;
    }
	public void setAddress(String temp) {
	address = temp;
    }
	
    public int getAge() {
	return age;
    }
    public void Average(int temp) {
	age = temp;
    }

    public double getAverage() {
	double result=0;
	result = (mathGrade+englishGrade+scienceGrade+computerGrade)/4;
	return result;
    }
	
    public static int getStudentRecord() {
	return studentCount; 
    }
	
    public void print(String temp){
	System.out.println("Name    :" +name);
	System.out.println("Address :" +address);
	System.out.println("Age     :" +age);
    }
	
    public void print(double mGrade, double eGrade, double sGrade, double cGrade) {
	System.out.println("Name :"+name);
	System.out.println("Math Grade     :" +mGrade);
	System.out.println("English Grade  :" +eGrade);
	System.out.println("Science Grade  :" +sGrade);
	System.out.println("Computer Grade :" +cGrade);
    }
	
    public double getEnglishGrade() {
	return englishGrade;
    }
	
    public void setEnglishGrade(double englishGrade) {
	this.englishGrade = englishGrade;
    }

    public double getMathGrade() {
	return mathGrade;
    }
	
    public void getMathGrade(double mathGrade) {
	this.mathGrade = mathGrade;
    }

    public double getScienceGrade() {
	return scienceGrade;
    }
	
    public void setScienceGrade(double scienceGrade) {
	this.scienceGrade = scienceGrade;
    }
	
    public double getComputerGrade() {
	return computerGrade;
    }

    public void setComputerGrade(double computerGrade) {
	this.computerGrade = computerGrade;
    }

}
