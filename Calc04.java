import java.util.Scanner;

public class Calc04{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number1		");
		int num1=scan.nextInt();
		System.out.print("Enter OPCODE [+-*/%]");
		String op=scan.next();
		System.out.print("Enter number2		");
		int num2=scan.nextInt();
		int num3=0;
		String g;
		switch(op){
			case "+":num3=num1+num2;  break;
			case "-":num3=num1-num2;  break;
			case "/":num3=num1/num2;  break;
			case "*":num3=num1*num2;  break;
			case "%":num3=num1%num2;  break;
			default : g="삐"; break;
		}
		if(g.equals("삐")){
			g="잘못된 입력입니다.";
		}else{ g=num1+op+num2+"="+num3;
		}
		System.out.print(g);
	}

}