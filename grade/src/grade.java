import java.util.Scanner;
public class grade {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);

		Double grade; //nilai ini dimasukkan dari keyboard

		System.out.print("Masukkan Grade = ");
		grade = input.nextDouble();

		if(grade>69){
			System.out.println("Selamat!");
		}
	}
}
