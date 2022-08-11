package modul9;
public class Student1 extends Person {
	public Student1 ()
	{
		//super ( "SomeName", "SomeAddress");
		//super ();
		//super.name = "name";
		
		System.out.println("Inside Student:Constructor");
	}
	
	public String getName() {
		System.out.println("Student Name : " +name);
		return name;
	}
}
