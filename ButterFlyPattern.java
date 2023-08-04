			//Abhishek Sunil Uphade

import java.util.*;
class ButterFlyPattern{
	public static void main(String ar[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you have to print butterfly");
		number = sc.nextInt();
		
		for(int i=1;i<=number;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
	
			int space = 2 * (number-i);
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

		System.out.println();
			
		}

	
		for(int i=number;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
	
			int space = 2 * (number-i);
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

		System.out.println();
			
		}
	}
}