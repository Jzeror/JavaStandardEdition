import java.util.Scanner;

public class HowMuch{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("�󸶿���?");
		int vari1=scan.nextInt();
		System.out.println(vari1+" ���Դϴ�.");
		System.out.println("�� �� �帱���?");
		int vari2=scan.nextInt();	
		System.out.println(vari2+" �� �ּ���.");	
		int sum1=vari1*vari2;
		System.out.println("�� �ݾ��� "+ sum1 +" �� �Դϴ�.");
		System.out.println("��ο�. ����ּ���.");
		System.out.println("�� �ۼ�Ʈ DC �ص帱���?");
		double dsc=scan.nextInt();
		double fin=sum1*(1-dsc/100);
		String g="";
		if(dsc>10){
		g="�� �Ⱦƿ�.";
		}else{
		g=fin+" �� �Դϴ�.";
		}
		System.out.println(g);
	}	
}