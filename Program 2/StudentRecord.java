public class StudentRecord {
	private String name;
	private String address;
	private int age;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;
	private double average;
	private static int studentCount;
	public StudentRecord(){
		studentCount++;
}
	public StudentRecord(String temp){
	this.name = temp;
	studentCount++;
}
	public StudentRecord (String name, String address){
		this.name = name;
		this.address = address;
		studentCount++;
}
	public String getName(){
		return name;
}
	public void setName(String temp){
		name = temp;
}
	public void getAddress(String temp){
		address = temp;
}

	public int getAge(){
		return age;
}
	public void setAge(int temp){
		age = temp;
}		
	public static int getStudentRecord(){
		return studentCount;
  }
}
