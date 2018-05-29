import java.util.Scanner;

public class HowMuch{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("얼마에요?");
		int vari1=scan.nextInt();
		System.out.println(vari1+" 원입니다.");
		System.out.println("몇 개 드릴까요?");
		int vari2=scan.nextInt();	
		System.out.println(vari2+" 개 주세요.");	
		int sum1=vari1*vari2;
		System.out.println("총 금액은 "+ sum1 +" 원 입니다.");
		System.out.println("비싸요. 깍아주세요.");
		System.out.println("몇 퍼센트 DC 해드릴까요?");
		double dsc=scan.nextInt();
		double fin=sum1*(1-dsc/100);
		String g="";
		if(dsc>10){
		g="안 팔아요.";
		}else{
		g=fin+" 원 입니다.";
		}
		System.out.println(g);
	}	
}