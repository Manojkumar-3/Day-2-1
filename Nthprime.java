package basics1;
import java.util.Scanner;
public class Nthprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);   
		int n = sc.nextInt();   
		int num=1, count=0, i;  
		while (count < n)  
		{  
		num=num+1;  
		for (i = 2; i <= num; i++)  
		{     
		if (num % i == 0)   
		{  
		break;  
		}  
		}  
		if (i == num)  
		{  
		count = count+1;  
		}  
		}   
		System.out.println("The " +n +"th prime number is: " + num);

	}

}
