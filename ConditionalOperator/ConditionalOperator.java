import java.util.Scanner;
public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String status = "";
		double grade;

		// status dari siswa
		System.out.print("Masukkan nilai grade siswa = ");
		grade = input.nextDouble();
		status = (grade>=60)?"Passed":"Fail";

		// cetak status
		System.out.println(status);
	}
} 
