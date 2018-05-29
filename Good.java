import java.util.Scanner;

public class Good{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=scan.nextInt();
		System.out.println("Enter OPCODE");
		String op=scan.next();
		System.out.println("Enter number 2");
		int num2=scan.nextInt();
		int num3=0;
		if(op.equals("+")){
		num3=num1+num2;
		}else if(op.equals("-")){
		num3=num1-num2;
		}else if(op.equals("*")){
		num3=num1*num2;
		}else if(op.equals("/")){
		num3=num1/num2;
		}else{
		num3=num1%num2;
		}

		System.out.print(num1+op+num2+"="+num3);

	}

}