package basics.java.designpattern.creational.factory.staticf;

public class FactoryTest {  
	  
	public static void main(String[] args) {   
        Sender sender = SendFactory.produceMail();  
        sender.Send();  
    }  
} 