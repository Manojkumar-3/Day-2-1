package basics1;

public class Fibonacci {

	public static void main(String[] args) {
		int temp1=0,temp2=1;
		int n=7;
	
		for (int i = 1; i <= n; ++i)
        {
			System.out.print(temp1 + " ");
            int sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
            

	}
	}
}
