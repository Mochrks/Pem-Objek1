import java.util.Scanner;
public class nilai1 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);

		int x; 
		int y;
		System.out.print("Masukkan Nilai X= ");
		x = input.nextInt(); 
		System.out.print("Masukkan Nilai Y= ");
		y = input.nextInt();
		if(x>y){
			System.out.println(+x);
		}else{
			System.out.println("Nilai Terbesarnya: "+y);		
		}
	}
}
