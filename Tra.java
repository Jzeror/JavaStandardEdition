public class Tra{
	public static void main(String[] args){
		String result="";
		int a=1, sum=0;

		while(a<11){
			if(a==10){
				result += a+"=";
			}else{
				result += a+"+";
			}
			sum += a;
			a++;
		}

		System.out.print(result+sum);

	}
}