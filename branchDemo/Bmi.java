import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("������ Ű�� Cm�� �Է����ּ���.");
			double hh=scan.nextDouble();
			double h= hh/100;
		System.out.println("������ �����Ը� Kg���� �Է����ּ���.");
			int w=scan.nextInt();
		double f= w/(h*h);
		String g="3�ܰ� ��";
		if(f<18.5){
			g="��ü��";
		}else if(f<23){
			g="����";
		}else if(f<25){
			g="�� ���ܰ�";
		}else if(f<30){
			g="1�ܰ� ��";
		}else if(f<35){
			g="2�ܰ� ��";
		}


		System.out.println("���ϴ� "+g+"�Դϴ�");
	}

}