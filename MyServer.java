import java.rmi.Naming;

public class MyServer {

	public static void main(String[] argv) {
		try {
			Pallindrome skeleton = new Pallindrome();

			Naming.rebind("rmi://localhost/abc", skeleton);
			System.out.println("Server is ready...");
		} catch (Exception e) {
			System.out.println("Server failed to start...:" + e);

		}
	}

}
