import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class GetInputFromKb2 {
    public static void main (String[] args){
    	BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    	String name = "", hobby ="";
    	
    	name = JOptionPane.showInputDialog("Your Name =");
    	hobby = JOptionPane.showInputDialog("Your Hobby =");
    	
    	String msg = ("So your hoby is "+hobby+", nice hobby mister. "+name+"");
    	
    	JOptionPane.showMessageDialog(null, msg);
    	
    	System.out.println("So your hobby is "+hobby+", nice hobby mister. "+name+"");
    }
}
