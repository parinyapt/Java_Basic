package appJavaBasic;

public class work1 {

	public static void main(String[] args) {
		char a = 'A' , b = 't';
		float c = -5.5f , d = -2.5f;
		int x = 256 , y = 8;
		String text1 = "!(a != 'A') && ((c%2)>d)";
		String text2 = "!((b <= 't') || ((d-c)>0))" ;
		String text3 = "!((a<='a') || (a != b) && (c+d) == 3";
		String text4 = "(x^y) & x";
		String name = "Parinya Termkasipanich NO.22";
		
		System.out.println(text1 + " = " + (!(a != 'A') && ((c%2)>d)));
		System.out.println(text2 + " = " + (!((b <= 't') || ((d-c)>0))));
		System.out.println(text3 + " = " + (!((a<='a') || (a != b) && (c+d) == 3)));
		System.out.println(text4 + " = " + ((x^y) & x));
		System.out.println(name);
	}

}
