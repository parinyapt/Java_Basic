/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        float grade;
        String line = "-----------------------------";
        String fix = "คณะที่ท่านมีสิทธิในการสมัครเรียน";
        String u1 = "คณะทั่วไปอื่นๆ";
        String u2 = "คณะเทคโนโลยีสารสนเทศ";
        String u3 = "คณะวิศวกรรมศาสตร์";
        String u4 = "คณะทันตแพทย์";
        String u5 = "คณะแพทยศาสตร์";
        
        System.out.println("Input your Grade?");
        grade = input.nextFloat();
        if(grade<2.00){
            System.out.println(line);
            System.out.println("ท่านไม่มีสิทธิในการสมัครเรียนมหาวิทยาลัย");
        }
        else if(grade>=2.00 && grade<=4.00){
            System.out.println(line);
            if(grade<2.75){
                System.out.println(fix);
                System.out.println(u1);
            }
            else if(grade>=2.75 && grade<3.00){
                System.out.println(fix);
                System.out.println(u1);
                System.out.println(u2);
            }
            else if(grade>=3.00 && grade<3.50){
                System.out.println(fix);
                System.out.println(u1);
                System.out.println(u2);
                System.out.println(u3);
            }
            else if(grade>=3.50 && grade<3.90){
                System.out.println(fix);
                System.out.println(u1);
                System.out.println(u2);
                System.out.println(u3);
                System.out.println(u4);
            }
            else if(grade>=3.90){
                System.out.println(fix);
                System.out.println(u1);
                System.out.println(u2);
                System.out.println(u3);
                System.out.println(u4);
                System.out.println(u5);
            }
        }
        else{
            System.out.println(line);
            System.out.println("โปรดตรวจสอบเกรดของท่านอีกครั้ง");
        }
	}
}
        
        