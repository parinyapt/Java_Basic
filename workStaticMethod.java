package staticMethod;
import java.util.Scanner;
public class workStaticMethod {
	
		
public static void main(String[] args) {
	
		float sp , ti;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Speed : ");
		sp = input.nextFloat();
		System.out.print("Input Time : ");
		ti = input.nextFloat();
		
		System.out.println("Speed = "+sp);
		System.out.println("Time = "+ti);
		System.out.println("***********************");
		float distance = mDistance(sp,ti);
		System.out.println("Distance = "+distance);
		double speed = mspeed(distance,ti);
		System.out.println("Speed = "+speed);
		
	}
	static float mDistance(float speed,float time)
	{
		float distance = speed*time;
		return distance;
	}
	
	static double mspeed(float distance,float time)
	{
		double speed = distance/time;
		return speed;
	}
}
