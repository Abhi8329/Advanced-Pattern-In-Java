			//Abhishek Sunil Uphade

import java.util.*;
class SolidRombus{
	public static void main(String ar[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		for(int i=1;i<=number;i++){

	
			for(int j=1;j<=number-i;j++){
				System.out.print(" ");
			}
		
			for(int j=1;j<=number;j++){
				System.out.print("*"+" ");
			}
		System.out.println();
		}

	}
}