package appJavaBasic;
import java.util.Scanner;
public class testJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String last;
		
		Scanner o = new Scanner(System.in);
		
		System.out.println("Input your name");
		name = o.nextLine();
		System.out.println("Input your Last name");
		last = o.nextLine();
		
			
		System.out.println(name+"\t"+last);
		
		testMethod();
	}
	static void testMethod(){
		Integer age = 15;
		System.out.println("age = "+age);
	}

}