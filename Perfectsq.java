package basics1;

public class Perfectsq {

	public static void main(String[] args) {
		int n=64;
	
		for (int i11=1; i11*i11<=n; i11++)   
		{   
		  
		if((n%i11==0) && (n/i11==i11)) 
		{
			System.out.println(i11);
		}
		}
		

	}

}
