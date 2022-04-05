package basics1;

public class vowelconso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Desendents of the Sun";    
        System.out.println("The String is: "+str);
        
        int vcount=0,ccount=0;    
      
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'||str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            vcount++;  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
            ccount++;   
        }        
     
        System.out.println(" vowels are: "+vcount);
     
        System.out.println("consonents are: "+ccount);

	}

}
