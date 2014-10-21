import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_1 extends Ex{
	void execute(){
		double x;
		double y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
		int z;

		x = 63;
		y = 18;
		z = 30;   

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 2 + "です。");
	}
}

class Ex2_3 extends Ex{
	void execute(){
	Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値:");
		int a = stdIn.nextInt();

		System.out.println( a+ "です。");
			 
 }
}


class Ex2_4 extends Ex{
	void execute(){
	Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値:");
		int a = stdIn.nextInt();

		System.out.println("10を加えた値は" +(a+10)+ "です。");
		System.out.println("10を減じた値は" +(a-10)+ "です。");	
 
 }
}

class Ex2_5 extends Ex{
	void execute(){
	Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値:");
		int x = stdIn.nextInt();

		System.out.print("yの値:");
		int y = stdIn.nextInt();


		System.out.println((x + y) +   "です。");
		System.out.println((x + y)/2 + "です。");	
 
 }
}

class Ex2_6 extends Ex{
	void execute(){
	Scanner stdIn = new Scanner(System.in);

		System.out.print("底辺:");
		double x = stdIn.nextDouble();

		System.out.print("高さ:");
		double y = stdIn.nextDouble();


		System.out.println(( x * y) /2 +  "です。");	
 
 }
}


public class Ex2 {
	public static void main(String[] args){
		Ex a;
		a = new Ex2_0();
		a.execute();
		a = new Ex2_1();
		a.execute();
		a = new Ex2_2();
		a.execute();
		a = new Ex2_3();
		a.execute();
		a = new Ex2_4();
		a.execute();
		a = new Ex2_5();
		a.execute();
		a = new Ex2_6();
		a.execute();
	}
}
