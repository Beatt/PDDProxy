package pdd.proxy.proxy;

import pdd.proxy.ISubject;
import pdd.proxy.entity.Subject;

public class ProxyAccessor implements ISubject {

	Subject subject;
	
	@Override
	public String request() {
		
		if(subject == null) {
			System.out.println("Subject inactive");
			subject = new Subject();
		}
		
		System.out.println("Subject active");
		return "Proxy: Call to " + subject.request();
	}	
	
}//Fin class Proxy
