import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("연도를 입력해주세요.");
		int y=scan.nextInt();
		
		double a=y;
		String d="평년";
		
		if(a%400==0.0){
		d="윤년";
		}else if(a%100==0.0){
		}else if(a%4==0.0){
		d="윤년";
		} else//else 를 넣고 말고의 차이
		System.out.println(y+"년도는 "+d+" 입니다");
	}
}