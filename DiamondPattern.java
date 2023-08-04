			//Abhishek Sunil Uphade
	
import java.util.*;
class DiamondPattern{
	public static void main(String ar[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		for(int i=1;i<=number;i++){

	
			for(int j=1;j<=number-i;j++){
				System.out.print(" ");
			}
			int spaces = 2 * (i - 1);
			for(int j=0;j<=spaces;j++){
				System.out.print("*");
			}
		System.out.println();
		}

		for(int i=number;i>=1;i--){

	
			for(int j=1;j<=number - i;j++){
				System.out.print(" ");
			}
		
			int spaces = 2 * (i - 1);
			for(int j=0;j<=spaces;j++){
				System.out.print("*");
			}
		System.out.println();
		}

	}
}