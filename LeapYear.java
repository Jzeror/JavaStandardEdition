import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("연도를 입력해주세요.");
		int y=scan.nextInt();
		double a=y%4;
		double b=y%100;
		double c=y%400;
		String d="평년";
		if(c==0.0){
			d="윤년";
		}else if(b==0.0){

		}else if(a==0.0){
			d="윤년";
		} //else 를 넣고 말고의 차이
		System.out.println(y+"년도는 "+d+" 입니다");
	}
}