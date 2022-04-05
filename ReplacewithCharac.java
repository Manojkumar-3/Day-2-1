package basics1;

public class ReplacewithCharac {

	public static void main(String[] args) {
		char ch='$';
		 String str = new String("Kdramas are one of the best dramas ever");
	     str=str.replace(' ',ch);
	      System.out.println("With special chars :" + str);

	}

}
