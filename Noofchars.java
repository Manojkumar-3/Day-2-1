package basics1;

public class Noofchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Shingeki no kyojin";    
        int count = 0;    
            
       
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
       
        System.out.println("NO.of characters are :" +count); 
		

	}

}
