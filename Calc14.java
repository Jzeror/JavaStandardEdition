import java.util.Scanner;
public class Calc14{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자1");
		int num1=scan.nextInt();
		System.out.print("연산자");
		String op=scan.next();
		System.out.print("숫자2");
		int num2=scan.nextInt();
		int num3=0;
		String result="";

		switch(op){
			case"+":num3=num1+num2; break;
			case"-":num3=num1-num2; break;
			case"*":num3=num1*num2; break;
			case"/":num3=num1/num2; break;
			case"%":num3=num1%num2; break;
			default : result="ERROR"; break;
		}
		if(!result.equals("ERROR")){
			result=num1+op+num2+"="+num3;
		}
		System.out.print(result);
	}
}