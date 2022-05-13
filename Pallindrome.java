import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Pallindrome extends UnicastRemoteObject implements PallindromeInterface {
	protected Pallindrome() throws RemoteException {
		super();
	}

	public boolean checkPallindrome(String s) {
		String reverse = "";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
}
