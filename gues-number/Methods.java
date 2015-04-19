import java.util.Random;
import java.util.Scanner;

public class Methods {
	Random r = new Random();
	Scanner input = new Scanner(System.in);
	int x;
	
	public void start(){
		
		while (true){
		int random = r.nextInt(10);
		System.out.print("Gues number 0 to 9 : ");
		x = input.nextInt();
		System.out.println();
		
		if (x == random){
			System.out.println("you got it right");
			break;
			}else{
				
				System.out.println("player must roll number again.");
				System.out.println();
			}
		
		
		}
		
	}	
	

}
