import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("귀하의 키를 Cm로 입력해주세요.");
			double hh=scan.nextDouble();
			double h= hh/100;
		System.out.println("귀하의 몸무게를 Kg으로 입력해주세요.");
			int w=scan.nextInt();
		double f= w/(h*h);
		String g="3단계 비만";
		if(f<18.5){
			g="저체중";
		}else if(f<23){
			g="정상";
		}else if(f<25){
			g="비만 전단계";
		}else if(f<30){
			g="1단계 비만";
		}else if(f<35){
			g="2단계 비만";
		}


		System.out.println("귀하는 "+g+"입니다");
	}

}