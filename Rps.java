import java.util.Scanner;
public class Rps{
	public static void main(String[] args){
 		Scanner scan=new Scanner(System.in);
		System.out.print("�÷��̾�1 �ָ�(1), ���ڱ�(2), ����(3) �߿� �ϳ��� ���ʽÿ�.");
		int P1=scan.nextInt();
		System.out.print("�÷��̾�2 �ָ�(1), ���ڱ�(2), ����(3) �߿� �ϳ��� ���ʽÿ�.");
		int P2=scan.nextInt();
		if(P1==P2){
			System.out.println("�� �÷��̾ ���º��Ͽ����ϴ�.");
					
		}else if(P1>P2){
			System.out.println("�÷��̾�1�� �¸��Ͽ����ϴ�.");
		}else{
		System.out.println("�÷��̾�2�� �¸��Ͽ����ϴ�.");	
		} 
	}
}