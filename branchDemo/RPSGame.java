import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
 		Scanner scan=new Scanner(System.in);
		System.out.print("플레이어1 주먹(R), 보자기(P), 가위(S) 중에 하나를 고르십시오.");
		String P1=scan.next();
		System.out.print("플레이어2 주먹(R), 보자기(P), 가위(S) 중에 하나를 고르십시오.");
		String P2=scan.next();
		if(P1.equals("R") && P2.equals("R")
			||
			P1.equals("P") && P2.equals("P")
			||
			P1.equals("S") && P2.equals("S")){
			System.out.println("두 플레이어가 무승부하였습니다.");
					}else if(P1.equals("R") && P2.equals("S")
				||
				P1.equals("S") && P2.equals("P")
				||
				P1.equals("P") && P2.equals("R")){
			System.out.println("플레이어1이 승리하였습니다.");
		}else{
		System.out.println("플레이어2가 승리하였습니다.");	
		} 
	}
}