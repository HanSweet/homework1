package Homework;
import java.util.Scanner;
public class Task7 {
	public static void main(String[] args) {
		System.out.println("计算贷款支付额");
	System.out.println("软工221韩毅");
	Scanner imput=new Scanner(System.in);
	System.out.println("输入贷款年利率%");
	double rank=imput.nextInt();
	System.out.println("输入总金额");
	double money=imput.nextInt();
	System.out.println("输入年数");
	double year=imput.nextInt();
	double borrowMoney;//月支付金额
	double allMoney;//总金额
	borrowMoney=(money*rank/1200)/(1-(1/Math.pow((1+rank/1200),12)));
	allMoney=12*borrowMoney;
	System.out.println("月支付金额"+borrowMoney);
	System.out.println("总贷款金额"+allMoney);
	
	}
	
}
