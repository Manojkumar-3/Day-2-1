package basics1;

public class Armstrong {

	public static void main(String[] args) {
		int a,arm=0,temp;
		int n=153;
		temp=n;
		while(n!=0)
		{
			a=n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(arm==temp)
		System.out.println(temp+" is a armstrong number ");
		else
		System.out.println(temp+" is not a armstrong number ");

	}

}
