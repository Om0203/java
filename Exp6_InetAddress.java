import java.net.*;

public class Exp6_InetAddress {

	public static void main(String args[]) throws UnknownHostException {

		System.out.println("Details of Machine getLocalHost(): ");
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);

		System.out.println();

		System.out.println("Details of Machine getByName(): ");
		Address = InetAddress.getByName("LAPTOP-A6EGQJ60"); // PC Name
															// System.out.println(Address);

		System.out.println();

		System.out.println("Details 'https://www.google.com/' getByName(): ");
		InetAddress SW1[] = InetAddress.getAllByName("https://www.google.com");
		for (int i = 0; i < SW1.length; i++)
			System.out.println(SW1[i]);
		System.out.println();
		System.out.println("Details 'https://www.sinhgad.com' getByName(): ");
		InetAddress SW2[] = InetAddress.getAllByName("https://www.sinhgad.com");
		for (int i = 0; i < SW2.length; i++)
			System.out.println(SW2[i]);
	}
}
