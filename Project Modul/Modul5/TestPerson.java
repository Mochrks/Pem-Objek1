
package modul.Modul5;
import java.lang.*;
public class TestPerson {
  public static void main (String [] args ){
		Person2 rizki = new Person2();
		rizki.name="Moch Rizki Kurniawan";
		rizki.gender='L';
		rizki.age=21;
		rizki.dateOfBirth="Bandung, 21 Juni 1999";
		rizki.address="Padalarang,Kab,Bandung Barat";
		rizki.height=170;
		rizki.weight=55;
		
		rizki.cetakBiodata(rizki.name, rizki.gender, rizki.address);
		rizki.cetakFisik(rizki.age, rizki.dateOfBirth, rizki.height, rizki.weight);
		
	}

}
