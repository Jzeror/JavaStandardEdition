import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
 		Scanner scan=new Scanner(System.in);
		System.out.print("�÷��̾�1 �ָ�(R), ���ڱ�(P), ����(S) �߿� �ϳ��� ���ʽÿ�.");
		String P1=scan.next();
		System.out.print("�÷��̾�2 �ָ�(R), ���ڱ�(P), ����(S) �߿� �ϳ��� ���ʽÿ�.");
		String P2=scan.next();
		if(P1.equals("R") && P2.equals("R")
			||
			P1.equals("P") && P2.equals("P")
			||
			P1.equals("S") && P2.equals("S")){
			System.out.println("�� �÷��̾ ���º��Ͽ����ϴ�.");
					}else if(P1.equals("R") && P2.equals("S")
				||
				P1.equals("S") && P2.equals("P")
				||
				P1.equals("P") && P2.equals("R")){
			System.out.println("�÷��̾�1�� �¸��Ͽ����ϴ�.");
		}else{
		System.out.println("�÷��̾�2�� �¸��Ͽ����ϴ�.");	
		} 
	}
}