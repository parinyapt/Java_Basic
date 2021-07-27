package appJavaBasic;
import java.util.Scanner;
public class midtermJava22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of Student : ");
		int stNum = input.nextInt();
		int c = 1;
		System.out.println("---------------------------");
		
		String[] count1 = new String[stNum];
		float[] scoreg = new float[stNum];
		String[] count2 = new String[stNum];
		
		for(int i = 0;i<count1.length; i++){
			System.out.println("Information Student No." + c);
			count2[i] = setNameStudent();
			scoreg[i] = setScore();
			System.out.println("---------------------------");
			System.out.println("Report grade Student No." + c);
			c++;
			calGrade(scoreg[i]);
			System.out.println("---------------------------");
			}
		}
		
	public static String setNameStudent(){
		Scanner input = new Scanner(System.in);
		String stName;
		System.out.print("Student Name : ");
		return stName = input.nextLine();
	}
		
	static float setScore(){
		Scanner input = new Scanner(System.in);
		float boScore , midScore , finalScore , totalScore;
		
		System.out.print("B.O. Score : ");
		boScore = input.nextFloat();
		System.out.print("Midterm Score : ");
		midScore = input.nextFloat();
		System.out.print("Final Score : ");
		finalScore = input.nextFloat();
		totalScore = boScore + midScore + finalScore;
		
		return totalScore;
	}
		
	public static void calGrade(float score){
		if(score>100 || score<0){
			System.out.println("Total Score : " + score);
			System.out.println("Error! | Please check you score again! | score must be less than 100 & not less than 0");
		}
		else if(score>=80){
			System.out.println("Total Score : " + score);
			System.out.println("Grade result : A");
		}
		else if(score>=75){
			System.out.println("Total Score : " + score);
			System.out.println("Grade result : B");
		}
		else if(score>=70){
			System.out.println("Total Score : " + score);
			System.out.println("Grade result : C");
		}
		else if(score>=65){
			System.out.println("Total Score : " + score);
			System.out.println("Grade result : D");
		}
		else{
			System.out.println("Total Score : " + score);
			System.out.println("Grade result : F");
		}
	}

}
