import java.util.Scanner;
public class nilai2 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);

		int x; 
		int y;
		int z;
		System.out.print("Masukkan Nilai X= ");
		x = input.nextInt();
		System.out.print("Masukkan Nilai Y= ");
		y = input.nextInt();
		System.out.print("Masukkan Nilai Z= ");
		z = input.nextInt();

		if(x>y && x>z){
			System.out.println("Nilai Terbesarnya: "+x);
		}else if(y>x && y>z){
			System.out.println("Nilai Terbesarnya: "+y);
		}else{
			System.out.println("Nilai Terbesarnya: "+z);		
		}
	}
}
