import java.util.Scanner;

public class Calc06{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=scan.nextInt();
		System.out.println("Enter OPCODE");
		System.out.println("if Plus then Enter 1");
		System.out.println("if Minus then Enter 2");
		System.out.println("if Multi then Enter 3");
		System.out.println("if Divid then Enter 4");
		System.out.println("if Mudular then Enter 5");
		int opcode= scan.nextInt();
		System.out.println("Enter number 2");
		int num2=scan.nextInt();
		int num3=num1+num2;
		int num4=num1-num2;
		int num5=num1*num2;
		int num6=num1/num2;
		int num7=num1%num2;
		if(opcode == 1){
		System.out.print(num1+"+"+num2+"="+num3);
		}else if(opcode==2){
		System.out.print(num1+"-"+num2+"="+num4);
		}else if(opcode==3){
		System.out.print(num1+"*"+num2+"="+num5);
		}else if(opcode==4){
		System.out.print(num1+"/"+num2+"="+num6);
		}else{
		System.out.print(num1+"%"+num2+"="+num7);
		}

	}

}