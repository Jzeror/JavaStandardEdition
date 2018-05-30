import java.util.Scanner;
class WhileDemo{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요");
		int num1=scan.nextInt();
		System.out.print("두번째 수를 입혁하세요?");
		int num2=scan.nextInt();
		int c=num2;
		if(num1>num2){
			num2=num1; 
			num1=c;
		}
		String result="";
		int sum=0;
		while (num1 <= num2){
			if(num1==num2){
				result += num1 + "=";
			}else {
				result += num1 + "+";
			}
			sum+=num1;
			num1++;
		}
		System.out.print(result+sum);
	}
}



/* 선생님이 한 거. 
import java.util.Scanner;
class WhileDemo{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요");
		int num1=scan.nextInt();
		System.out.print("두번째 수를 입혁하세요?");
		int num2=scan.nextInt();
		int start=0; 
		int end=0;
		if(num1>num2){
			start=num2; 
			end=num1;
		}else{
			start=num1; 
			end=num2;	
		}
		String result="";
		int sum=0;
		while (start <=end){
			if(start==end){
				result += start + "=";
			}else {
				result += start + "+";
			}
			sum+=start;
			start++;
		}
		System.out.print(result+sum);
	}
}

