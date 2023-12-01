package Homework;
import java.util.Scanner;
public class Task9 {
public static void main(String[] args) {
	System.out.println("年月日");
	System.out.println("软工221韩毅");
	Scanner imput=new Scanner(System.in);
	System.out.println("请输入一个年份");
	int year=imput.nextInt();
	System.out.println("请输入一个月份");
	int month=imput.nextInt();
	int x;
	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	{ 
		x = 29;

	}
	else 
	{
	x= 28;
	}
	
	int dayTime[]= new int[]{31, x, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
	switch(month) {
	case 1:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 2:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 3:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 4:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 5:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 6:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 7:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 8:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 9:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 10:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 11:System.out.println("该月天数是"+dayTime[month-1]);break;
	case 12:System.out.println("该月天数是"+dayTime[month-1]);break;
	
	}
	
}
}
