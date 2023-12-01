package Homework;
import java.util.Scanner;
public class Task1 {
		public static void main(String[] args) {
			System.out.println("日历");
			System.out.println("软工221韩毅");
			int year,time,month;
			int num1=0,num2=0;
			int sum=0;
			int sum1=0;
			int day = -1;
			Scanner input=new Scanner(System.in);
			System.out.println("输入年份");
			year=input.nextInt();
			System. out.println("输入月份");
			month=input.nextInt();
			String[] yuefen={"January","Feb","Mar","April","Jun","July","Aug","Sept","Oct","Nov","Dec"};
	
						int x;
						if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
						{
							x = 29;
						num2++;
						}
						else 
						{
						x= 28;
							
						}
						
						int dayTime[]= new int[]{31, x, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
						System.out.println("请输入开始星期");
						int startday=input.nextInt();//输入开头
					for(int f=0;f<month;f++) {
						System.out.println();
						System.out.println();
					System.out.println(         "\t\t\t" +yuefen[f]            );
					System.out.println("--------------------------------------------------");
					System.out.println ("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t");	
					int n=1;//n要放在，不然局部变量，无法加加
					int a;
					int key=0;
					key=sum1%7;//多少个空格
					sum1=+dayTime[f];	
				for(int c=0;c<startday;c++) {
						System.out.print("\t");
					}//第一行打空格
					
					for( a=1;a<=dayTime[f];a++) {
						
						System.out.print(a+"\t") ;//打天数
					if(7*n-startday==a){
						n++;System.out.println();}
					}
					System.out.println();
					startday=(startday+dayTime[f])%7;
					
					}

		}
	}


