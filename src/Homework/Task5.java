package Homework;

public class Task5 {
	public static void main(String[] args) {
		System.out.println("个十百千");
		System.out.println("软工221韩毅");
		int number=(int)(Math.random()*1000);
		System.out.println("打印该数"+number);
		int qian;
		int bai;
		int shi;
		int ge;
		ge=number%10;number=number/10;
		shi=number%10;number=number/10;
		bai=number%10;number=number/10;
		qian=number%10;
		System.out.println("ge "+ge+" shi "+shi+" bai "+bai+" qian "+qian);
		System.out.println(ge+shi+bai+qian);
	}
}
