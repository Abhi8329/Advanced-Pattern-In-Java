			//Abhishek Sunil Uphade

import java.util.*;
class NumberPyramid{
	public static void main(String ar[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		for(int i=1;i<=number;i++){

	
			for(int j=1;j<=number-i;j++){
				System.out.print(" ");
			}
		
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
		System.out.println();
		}

		for(int i=number;i>=1;i--){

	
			for(int j=1;j<=number-i;j++){
				System.out.print(" ");
			}
		
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
		System.out.println();
		}

	}
}