import java.util.Scanner;
public class grade2 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);

		Double grade; //nilai ini dimasukkan dari keyboard

		System.out.print("Masukkan Grade = ");
		grade = input.nextDouble();

		if(grade>=60){
			System.out.println("LULUS!");
		}else{	
			System.out.println("GAGAL!");		
		}
	}
}
