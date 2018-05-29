import java.util.Scanner;
public class Month{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("마지막 날을 알고 싶은 '월'을 입력하세요.");
			int mon=scan.nextInt();
			int fd= 28;
		switch(mon){
			case 1 :case 12 : case 3 : case 5 : case 7 : case 8 : case 10 : fd=31; break;
			case 4 :case 6 :case 9 :case 11 : fd=30; break;
			default : break;
		}
		System.out.print(mon+"월의 마지막 날은 "+mon+"월 "+fd+"일 "+"입니다");
	}
}


