package appJavaBasic;
import java.util.Scanner;
public class money {

	public static void main(String[] args) {
		int hour;
		float total,money;
		String name;
		String qname = "What is your name?";
		String qhour = "How many hours did you work this week?";
		String qmoney = "What is your hourly pay rate?";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(qname);
		name = input.nextLine();
		System.out.println(qhour);
		hour = input.nextInt();
		System.out.println(qmoney);
		money = input.nextInt();
		total = money*hour;
		
		System.out.println("--------------------------------");
		
		System.out.println("Hello " + name);
		System.out.println("Your gross pay is " + total + " Bath");

	}
}