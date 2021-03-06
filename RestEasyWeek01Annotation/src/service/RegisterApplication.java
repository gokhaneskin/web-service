package service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RegisterApplication extends Application{

	private Set<Object> singletons=new HashSet<Object>();
	
	public RegisterApplication() {
		singletons.add(new MessageService());
	}
	
	public Set<Object> getSingletons() {
		return singletons;
	}
}
