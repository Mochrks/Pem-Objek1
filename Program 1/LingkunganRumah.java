package modul7;
import java.awt.Color;
public class LingkunganRumah{
	public static void main (String args[]){
		Kucing michael = new Kucing ();
		michael.setWarnabulu(new Color (0, 1, 1));
		michael.setNama("Michael");
		michael.setUsia(3);
		michael.setBb(4.5);
		michael.diadopsi("Rizki");
		michael.cetakInformasi();
	}
}
