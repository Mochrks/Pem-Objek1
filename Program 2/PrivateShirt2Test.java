
public class PrivateShirt2Test {
    public static void main(String[] args) {
	 PrivateShirt2 privShirt = new PrivateShirt2();
	 char kodeWarna;
	 // Mengisi kode warna yang valid
	 privShirt.setKodeWarna('R');
	 kodeWarna = privShirt.getKodeWarna();
	 // Kelas PrivateShirt2Test bisa mengisi sebuah kodeWarna yangvalid
	 System.out.println("Kode Warna: " + kodeWarna);
	 // Mengisi kode warna yang salah
	 privShirt.setKodeWarna('Z');
	 kodeWarna = privShirt.getKodeWarna();
	 // Kelas PrivateShirt2Test bisa mengisi sebuah kodeWarna yangsalah
	 // Kode warna masih R
	 System.out.println("Kode Warna: " + kodeWarna);
	 }

}
