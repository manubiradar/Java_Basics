package Java_Lerning;

public class String_demo {

	public static void main(String[] args) {
		char c1= 'c';
		char c2= 'a';
		char c3= 'r';
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		String greet = "hello";
		String name = "manu";
		char space = ' ';
		greet=greet.toLowerCase() ;
		name = name.toUpperCase();
		String msg = greet+space+name;
		System.out.println(msg);

	}

}
/*Strings Outline:

        *char datatype
        *letter,digit,punctuation marks, tab, or space are all characters
        *Program explaining the variable and the character data
        *Introduction to strings
        *Creating string by Direct Initialization
        *Creating string by using new operator
        *String length()
        *String concat()
        *String toUpperCase()
        *String toLowerCase()*/