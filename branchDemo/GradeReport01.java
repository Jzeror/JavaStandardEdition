import java.util.Scanner;
public class GradeReport01{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸� ? \n");
		String name=scan.next();
		System.out.print("�������� ? \n");
		int ks=scan.nextInt();
		if(ks>100 || ks<0){System.out.println("�߸��� ���Դϴ�."); return;}
		System.out.print("�������� ? \n");
		int es=scan.nextInt();
		if(es>100 || es<0){System.out.println("�߸��� ���Դϴ�."); return;}
		System.out.print("�������� ? \n");
		int ms=scan.nextInt();
		if(ms>100 || ms<0){System.out.println("�߸��� ���Դϴ�."); return;}
		int rs= (ks+es+ms)/3;
		String gs="F";
		
		switch(rs/10){
			case 10 :gs="A"; break;
			case 9 : gs="A"; break;
			case 8 : gs="B"; break;
			case 7 : gs="C"; break;
			case 6 : gs="D"; break;
			case 5 : gs="E"; break;
			default : break;
		}

		System.out.println(name+" ��� "+ rs+" ���� " + gs );
	}

}