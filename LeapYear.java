import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		int y=scan.nextInt();
		double a=y%4;
		double b=y%100;
		double c=y%400;
		String d="���";
		if(c==0.0){
			d="����";
		}else if(b==0.0){

		}else if(a==0.0){
			d="����";
		} //else �� �ְ� ������ ����
		System.out.println(y+"�⵵�� "+d+" �Դϴ�");
	}
}