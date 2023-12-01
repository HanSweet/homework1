package Homework;
import java.util.Scanner;
public class Task10 {
public static void main(String[] args) {
	System.out.println("猜数");
	System.out.println("软工221韩毅");
	int number=(int)(Math.random()*101)+100;
	System.out.println(number);
	Scanner imput=new Scanner(System.in);
	
	while(number!=0) {
		System.out.println("输入一个你认为的100-200的数字");
		int guessNumber=imput.nextInt();
		if(guessNumber==number) {
			System.out.println("猜对这个数了");;break;
		}
		else if(number>guessNumber) {
			System.out.println("猜小了");
		}
		else if(number<guessNumber) {
			System.out.println("猜大了");
		}
	}
}
}
