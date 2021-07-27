package appJavaBasic;
import java.util.Scanner;
public class array1 {

	private static Scanner input;

	public static void main(String[] args) {
		//final  int citynum = 3;
		 int citynum ;
		
		input = new Scanner(System.in);
		System.out.print("Input number of City? : ");
		citynum = input.nextInt();
		System.out.println("----------------------------");
		System.out.println("Number of city : " + citynum);
		
		String[] cityname = new String[citynum+1];
		//System.out.print("City " +  " : ");
		for (int count = 0; count <= citynum;count++)
		{
			
			cityname[count] = input.nextLine();
			System.out.print("City " + (count+1) + " : ");
		}
		System.out.println("----------------------------");
		System.out.println("The City you entered are :");
		for(int count = 0;count<=citynum;count++){
			
			System.out.println((count)+"."+cityname[count]);}
}
