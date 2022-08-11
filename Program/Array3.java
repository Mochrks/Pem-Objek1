package modul6;
import java.lang.Math;
public class Array3 {
public static void main (String[] args ) {
	int [] anArray = new int [11];
	double N;
		
	for (int i = 0; i < anArray.length; i++) {
	N = Math.pow(2,i);
	anArray[i] = (int) N;
	System.out.println("an Array ke " + i + " = " + anArray[i]);
	}
}
}
