import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		int y=scan.nextInt();
		
		double a=y;
		String d="���";
		
		if(a%400==0.0){
		d="����";
		}else if(a%100==0.0){
		}else if(a%4==0.0){
		d="����";
		} else//else �� �ְ� ������ ����
		System.out.println(y+"�⵵�� "+d+" �Դϴ�");
	}
}