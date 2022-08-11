/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;

/**
 *
 * @author USER
 */
public class ArithmeticOperation {
    public static void main (String[] args){
    int i=0;
		if(args.length>0){
		i=Integer.parseInt(args[0]);
		}
		int j=0;
		if(args.length>0){
		j=Integer.parseInt(args[1]);
		}
                System.out.println ("sum=" + (i+j));
		System.out.println ("difference=" + (i-j));
		System.out.println ("product=" + (i*j));
		System.out.println ("quotient=" + (i/j));

    }
}
