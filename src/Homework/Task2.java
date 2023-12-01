package Homework;

public class Task2 {
public static void main(String[] args) {
	System.out.println("抽卡牌");
	System.out.println("软工221韩毅");
	int card=(int) (Math.random()*52);
	String suit="",rank="";
	switch(card/13) {
	//确定啥色
	case 0:suit="黑桃";break;
	case 1:suit="红桃";break;
	case 2:suit="方块";break;
	case 3:suit="梅花";break;
	}
	
	switch(card%13) {
	//确定啥数
	case 0:rank="A";break;
	case 10:rank="J";break;
	case 11:rank="Q";break;
	case 12:rank="K";break;
	default:rank=""+(card%13+1);
	}
	System.out.println("你抽的牌是"+suit+" "+rank);
}
}
