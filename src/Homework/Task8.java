package Homework;
import java.util.Scanner;
public class Task8 {
public static void main(String[] args) {
	System.out.println("输入成绩");
	Scanner imput=new Scanner(System.in);
	int score=imput.nextInt();
	if(score<60) System.err.println("不及格");
	else if(score<70) System.out.println("及格");
	else if(score<80)System.out.println("中等");
	else if(score<90)System.out.println("良好");
	else System.out.println("优秀");
}
}
