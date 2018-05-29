import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int num1 = scan.nextInt();

		System.out.println("Enter number 2");
		int num2 = scan.nextInt();
		
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		int num6 = num1 / num2;
		int num7 = num1 % num2;
		System.out.println(num1 +"+"+ num2+ "="+num3);
		System.out.println(num1 +"-" +num2 +"="+num4);
		System.out.println(num1+ "*" +num2 +"="+num5);
	    System.out.println(num1 +"/" +num2 +"="+num6);
	    System.out.println(num1+"%"+num2+"="+num7);
			}
}