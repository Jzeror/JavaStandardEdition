import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
			String name=scan.next();
		System.out.println("�ֹε�Ϲ�ȣ�� -�����Ͽ� ��� �Է����ּ���");
			String num=scan.next();
			String s="�ܱ���";
			char ch= num.charAt(7);
			if(ch>6||ch<1){ System.out.print("�ٽ� �ѹ� �Է����ֽñ� �ٶ��ϴ�."); return;}
			switch(ch){
				case '1' : case '3' : s="����"; break;
				case '2' : case '4' : s="����"; break;
				default : break;
			}
		System.out.println(name+":"+num+":"+s);
	}
}