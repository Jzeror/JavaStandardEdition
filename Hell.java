import java.util.Scanner;

public class Calc06{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=scan.nextInt();
		Systme.out.print("Enter OPCODE");
		Systme.out.print("if plus then Enter 1");
		Systme.out.print("if minus then Enter 2");
		Systme.out.print("if multi then Enter 3");
		Systme.out.print("if divid then Enter 4");
		Systme.out.print("if mudular then Enter 5");
		int opcode= scan.nextInt();
		System.out.println("Enter number 2");
		int num2=scan.nextInt();
		
		if(opcode==1){int num3=num1+num2; System.out.print(num1+"+"+num2+"="+num3);}else 
		if(opcode==2){int num4=num1-num2; System.out.print(num1+"-"+num2+"="+num4);}else 
		if(opcode==3){int num5=num1*num2; System.out.print(num1+"*"+num2+"="+num5);}else 
		if(opcode==4){int num6=num1/num2; System.out.print(num1+"/"+num2+"="+num6);}else{int num7=num1%num2; System.out.print(num1+"%"+num2+"="+num7);}

	}

}