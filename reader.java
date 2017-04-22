package optum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reader {
	
	public static String getdate(String Member) throws FileNotFoundException{
		
		String x = "data.txt";
		Scanner sc = new Scanner(new File(x));
		String word = sc.next();
		while (sc.hasNext()) {
			if(word.equals(Member)){
				String date = sc.next();
				System.out.print(("Date is" + " "));
				System.out.print(date);
				return date;
			}
				
				word = sc.next();
			}
		return Member;
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("What id are you looking for? (Number only)");
		String m = sc.next();
		getdate("MemberID" + m);
		
}}
