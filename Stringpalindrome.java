package basics1;
import java.util.*;
import java.util.Scanner;
public class Stringpalindrome {

	public static void main(String[] args) {
		
		String str="momo";
		StringBuilder sc=new StringBuilder(str);
		sc.reverse();
		String rev=sc.toString();
		if(str.equals(rev))
		{
			System.out.println("The strirng is palindrome");
		}
		else
		{
			System.out.println("The string is not Palindrome");
		}

	}

}
