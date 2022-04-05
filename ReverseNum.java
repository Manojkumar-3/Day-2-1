package basics1;

public class ReverseNum {

	public static void main(String[] args) {
		int a,res=0,n=3567;
		while(n!=0)
		{
		a=n%10;
		res=(res*10)+a;
		n=n/10;
		}
		System.out.println(res);

	}

}
