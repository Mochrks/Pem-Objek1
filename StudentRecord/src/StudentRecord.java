public class StudentRecord
{
	private String name;
	private String address;
	private int age;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;
	private double average;
	private static int studentCount;
	/**
	6.Menghasilkan nama dari Siswa
	*/
	public String getName(){
	return name;
	}
	/**
	//Mengubah nama siswa
	*/
	public void setName( String temp ){
	name = temp;
	}
	// area penulisan kode lain
	/**
	* Menghitung rata – rata nilai Matematik, Bahasa Inggris, * * Ilmu
	Pasti
	*/
	public double getAverage(){
	double result = 0;
	result = ( mathGrade+englishGrade+scienceGrade )/3;
	return result;
	
}
}