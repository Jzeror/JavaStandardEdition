import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
			String name=scan.next();
		System.out.println("주민등록번호를 -포함하여 모두 입력해주세요");
			String num=scan.next();
			String s="외국인";
			char ch= num.charAt(7);
			if(ch>6||ch<1){ System.out.print("다시 한번 입력해주시기 바랍니다."); return;}
			switch(ch){
				case '1' : case '3' : s="남성"; break;
				case '2' : case '4' : s="여성"; break;
				default : break;
			}
		System.out.println(name+":"+num+":"+s);
	}
}