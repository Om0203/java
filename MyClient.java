import java.rmi.*;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {

		PallindromeInterface stub;
		Scanner sc = new Scanner(System.in);
		try {
			stub = (PallindromeInterface) Naming.lookup("rmi://localhost/abc");

			System.out.println("Enter string to check pallindrome:");

			String s = sc.next();
			boolean result = stub.checkPallindrome(s);
			if (result) {
				System.out.println("String is Pallindrome Sequence");

			} else {

			}

			System.out.println("Not a Pallindrome");

		} catch (Exception e) {
			System.out.println("HelloClient exception:" + e);
		}
	}
}
