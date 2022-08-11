public class CommandLineExample
{
public static void main( String[] args ){
int numberOfArgs = args.length;
		int firstArg = 0;
		if(args.length > 0){
		firstArg = Integer.parseInt(args[0]);
		}
		System.out.println("Number of arguments=" + args.length);
		System.out.println("First Argument="+ args[0]);
	}
}
