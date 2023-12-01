package Homework;

public class Task4 {
public static void main(String[] args) {
	System.out.println("打印前50个素数");
	System.out.println("软工221韩毅");
	int count=0;//计量素数个数
	int number=2;
	boolean isPrime;
	
	System.out.println("前50个素数如下");
	while(count<50){
		isPrime=true;
		for(int divisor=2;divisor*divisor<=number;divisor++) {
			isPrime=true;
			if(number%divisor==0) {
				isPrime=false;
				break;
		}
		}
			if(isPrime) {
				
				count++;
				if(count%10==0)
					System.out.println(number);
				else
					System.out.print(number+" ");
				
		}
			number++;
		}
	}
}

