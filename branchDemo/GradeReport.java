import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸� ? \n");
		String name=scan.next
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
		if(rs>=90){
			gs="A";}else if(rs>=80 && rs<90){
				gs="B";
			}else if(rs>=70 && rs<80){
				gs="C";
			}else if(rs>=60 && rs<70){
				gs="D";
			}else if(rs>=50 && rs<60){
				gs="E";
			}
		System.out.println(name+" ��� "+ rs+" ���� " + gs );
	}

}