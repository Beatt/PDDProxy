package pdd.proxy.test;


import pdd.proxy.ISubject;
import pdd.proxy.proxy.ProtectionProxy;
import pdd.proxy.proxy.ProxyAccessor;


public class Client {
	
	public static void main(String...args) {
		
		System.out.println("Proxy Patterno\n");
		
		ISubject subject = new ProxyAccessor();
		System.out.println(subject.request());
		System.out.println(subject.request());
		
		ProtectionProxy subjectP = new ProtectionProxy();
		System.out.println(subjectP.request());
		
		System.out.println( ((ProtectionProxy) subjectP).authenticate("Secret"));
		System.out.println( ((ProtectionProxy) subjectP).authenticate("Abracadabra"));
		System.out.println(subjectP.request());
	
	}
}
