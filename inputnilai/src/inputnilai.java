import java.util.Scanner;
public class inputnilai {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);

		int n; //nilai ini dimasukkan dari keyboard

		System.out.print("Masukkan Nilai = ");
		n = input.nextInt();

		if(n%2==0){
			System.out.println("EVEN");
		}else{
			System.out.println("ODD");		
		}
	}
}
