import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PallindromeInterface extends Remote {
	public boolean checkPallindrome(String str) throws RemoteException;
}
