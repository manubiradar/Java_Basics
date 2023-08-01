package inputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferReader {
	
	public static void main (String[] args) throws IOException {
		String str,str1;
		int n;
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter your Name");
		str=br.readLine();
		System.out.println("Enter your Age");
		str1=br.readLine();
		n=Integer.parseInt(str1);
		System.out.println("The name is "+str);
		System.out.println("The Age is "+n);
		
		
	}

}
