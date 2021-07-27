package appJavaBasic;
import java.util.Scanner;
public class workLoop {

	public static void main(String[] args) {
		int namenum , namefull;
		int count = 0;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of Teacher? : ");
		namenum = input.nextInt();
		System.out.println("----------------------------");
		System.out.println("Number of Teacher : " + namenum);
		
				while(count <= namenum){
				System.out.println("Enter Teacher name " + count + ": ");
				name = input.nextLine();
				
				count++;
			}	
				System.out.println("----------------------------");
				System.out.println("Complete!");

	}
}