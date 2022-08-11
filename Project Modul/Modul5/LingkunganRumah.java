
package modul.pkg5;




import java.awt.Color;
public class LingkunganRumah {
	public static void main (String args[]){
	Kucing2 michael = new Kucing2 ();
	Kucing garfield = new Kucing ();
	
	michael.warnaBulu = new Color (0 , 1 , 1);
	michael.nama = "Michael";
	michael.usia = 3;
	michael.bb = 4.5;
	michael.diadopsi("Rizki");
	
	garfield.warnaBulu = new Color (0 , 1 , 1);
	garfield.nama = "Garfield";
	garfield.usia = 3;
	garfield.bb = 4.5;
	garfield.diadopsi("Rizki");
	
	michael.cetakInformasi();
	garfield.cetakInformasi();
	}
 
}
