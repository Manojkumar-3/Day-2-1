package basics1;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="peek", str2="keep";
        
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
 
        Arrays.sort(array1);
        Arrays.sort(array2);
 
        if (String.valueOf(array1).equals(String.valueOf(array2))) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram ");
        }

	}

}
