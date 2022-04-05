package basics1;

public class Punctuation {

	public static void main(String[] args) {
		  int count = 0;  
	        String str = "Ohayo Gozaimasu!Namae wa nan desu ka?";  
	        for (int i = 0; i < str.length(); i++) {  
	                //Checks whether given character is punctuation mark  
	            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
	                     str.charAt(i) == ':') {  
	                count++;  
	            }  
	        }  
	        System.out.println("number of punctuation characters: " + count);  

	}

}
