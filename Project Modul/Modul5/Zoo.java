
package modul.pkg5;
import java.awt.Color;
public class Zoo {
    public static void main (String args[]){
		Lion singa = new Lion ();
		Horse kuda = new Horse ();
		Kangoroo kangguru = new Kangoroo ();
 		
		singa.warnaBulu = new Color (0, 1, 1);
		singa.nama = "jon";
        singa.asal = "Afrika";
		singa.usia = 11;
		singa.bb = 190;
		singa.diadopsi ("Rizki");
		
		kuda.warnaBulu = new Color (0, 1, 1);
		kuda.nama = "Shuki";
        kuda.asal = "Afrika";
		kuda.usia = 20;
		kuda.bb = 380;
		kuda.diadopsi ("Rizki");

		kangguru.warnaBulu = new Color (0, 1, 1);
		kangguru.nama = "Jimmbo";
		kangguru.asal = "Australia";
        kangguru.usia = 9;
		kangguru.bb = 45;
		kangguru.diadopsi ("Rizki");
		
        singa.cetakInformasi();
		kuda.cetakInformasi();
		kangguru.cetakInformasi();
	}

}
