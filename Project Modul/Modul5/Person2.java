
package modul.Modul5;
import java.lang.*;
public class Person2 {
    public String name;
	public char gender;
	public int age;
	public String dateOfBirth;
	public float height;
	public float weight;
	public String address;
	public static void main (String[] args) {
    
	public void cetakBiodata (String name, char gender, String address){
		System.out.println("Nama :"+name+"\nJenis kelamin :"+gender+"\nAlamat :"+address);
	}
	public void cetakFisik(int age, String dateOfBirth, float height, float weight){
		System.out.println("Umur : "+age);
		System.out.println("Tanggal Lahir : "+dateOfBirth);
		System.out.println("Tinggi : "+height);
		System.out.println("Berat : "+weight);
	}
	}
}
