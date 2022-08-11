
package modul.Modul5;
import java.awt.Color;
public class LingkunganRumah2 {
    public static void main (String args[]){
		Kucing michael = new Kucing ();
		Kucing2 garfield = new Kucing2 ();
		garfield.warnaBulu = new Color (0, 1, 1);
		garfield.nama = "Garfield";
		garfield.usia = 3;
		garfield.bb = 3.5;
		garfield.diadopsi ("Riski");
		garfield.cetakInformasi( );	
	}

}
