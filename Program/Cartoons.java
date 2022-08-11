package modul6;
public class Cartoons{
	public static void main (String[]args){
		String [][] Cartoons = {
			{"FlintStone", "Fred", "Wilma", "Pebbles", "Dino"},
        		{"Rubbles", "Barney", "Betty", "Bam Bam"},
          		{"Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie", "Astro"},
           		{"Scobby Doo Gang", "Scoby Doo", "Shaggy", "Velma", "Fred", "Daphne"}
			};
				
		for (int i = 0; i < Cartoons.length; i++){
		 System.out.print(Cartoons[i][0] + "	: ");
			for (int j = 1; j < Cartoons[i].length; j++){
			 System.out.print(Cartoons[i][j] +  " ");
		}
	
		System.out.println();
 	}
 }
}