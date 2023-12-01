package Homework;
import java.util.Scanner;
public class task6 {
public static void main(String[] args) {

	System.out.println("软工221韩毅");
	Scanner imput=new Scanner(System.in);
	System.out.println("输入a");
	int a=imput.nextInt();
	System.out.println("输入b");
	int b=imput.nextInt();
	System.out.println("输入c");
	int c=imput.nextInt();
	int number;
	int temp=(int)Math.sqrt(b*b-4*a*c);
	number=(-b+temp)/2*a;
	System.out.println("打印"+number);
}
}
