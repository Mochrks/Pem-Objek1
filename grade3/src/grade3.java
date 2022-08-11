import java.util.Scanner;
public class grade3 {
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);

		double grade = 92.0;
		
		System.out.print("Masukkan Nilai grade= ");
		grade = input.nextInt();
		
		if(grade >= 90){
			System.out.println("Excellent!");
		}	
		else if((grade < 90) && (grade >=80)){
			System.out.println("Bagus!");
		}
		else if ((grade <80) && (grade >= 60)){
			System.out.println("Belajar Lagi!");
		}
		else{
			System.out.println("Maaf, Anda gagal.");
		}
	}
}
	