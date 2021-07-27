package appJavaBasic;

import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Input number of Row : ");
			int row = input.nextInt();
			System.out.print("Input number of Colum : ");
			int col = input.nextInt();
			System.out.println("----------------------------");
			System.out.println("Number of Row : " + row + " | Number of Colum : "+col);
			
			String [][] table = new String [row][col] ;
			
			
			setArray(table);
			System.out.println("----------------------------");
			showArray(table);
			System.out.println("----------------------------");
			}
			
		public static void setArray(String[][] array){
			Scanner input = new Scanner(System.in);
			for (int rowi = 0; rowi < array.length;rowi++){
				for (int coli = 0; coli < array[rowi].length; coli++){
					System.out.print("Enter "+": ");
					array[rowi][coli] = input.nextLine();
				}
			}
		}
			
		public static void showArray(String[][] array){
			System.out.println("The information your entered are :");
			for (int rowi = 0; rowi < array.length;rowi++){
				for (int coli = 0; coli < array[rowi].length;coli++)
					System.out.print(array[rowi][coli]+"\t");
					System.out.println();
			}
		}
		
	}


