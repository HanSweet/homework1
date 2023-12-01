package Homework;
import java.util.Scanner;
public class Task3 {
public static void main(String[] args) {
	System.out.println("最大公约数");
	System.out.println("软工221韩毅");
	int numberOne,numberTwo;
	Scanner input=new Scanner(System.in);
	System.out.println("请输入第一个数");
	numberOne=input.nextInt();
	System.out.println("请输入第二个数");
	numberTwo=input.nextInt();
	//欧几里得算法
	boolean  thing=true;
	int r=1;
	if(numberOne>numberTwo) {
	while(thing) {
		r=numberOne%numberTwo;
		if(r==0) {
			System.out.println("最大公因数是"+numberTwo);
			thing=false;
			break;
		}
		numberOne=numberTwo;
		numberTwo=r;
	}
	}
	
}
}
