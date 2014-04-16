package pdd.proxy.proxy;


import pdd.proxy.ISubject;
import pdd.proxy.entity.Subject;

/**
 * 
 * @author beat
 * @see Client
 */
public class ProtectionProxy implements ISubject {
	
	Subject subject;
	String password = "Abracadabra";
	
	public String authenticate(String supplied) {
		
		if(!supplied.equals(password)) {
		
			return "Protection proxy: No access";
		
		} else {
			
			subject = new Subject();
			return "Protection Proxy: Authenticated";
		}
		
	}
	
	@Override
	public String request() {
		
		if(subject == null) {
			
			return "Protection Proxy: Authenticate first";
			
		} else {
			
			return "Protection Proxy: Call to " + subject.request();
		}
		
	}//Fin request

}//Fin ProtectionProxy
