import java.util.Scanner;
class Ddd{
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
		char d=result.charAt((num2-num1)/2);
		System.out.print(result+sum+" 중간값 "+d);
	}
}

