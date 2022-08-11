import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class InputKeyboard {
	public static void main(String[]args){
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String name = "", alamat="", kota="";

		name = JOptionPane.showInputDialog("Nama Anda : ");
		alamat = JOptionPane.showInputDialog("Alamat Anda : ");
		kota = JOptionPane.showInputDialog("Kota Alamat Anda : ");
		
		String msg = ("Nama Anda adalah "+name+". Alamat Anda di "+alamat+". Kota Alamat Anda adalah "+kota);
		JOptionPane.showMessageDialog(null, msg);
	
		System.out.println("\n Nama Anda adalah "+name+"\n. Alamat Anda di "+alamat+"\n. Kota Alamat Anda adalah "+kota);

	}
}
