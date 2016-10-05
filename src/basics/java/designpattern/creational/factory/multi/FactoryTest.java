package basics.java.designpattern.creational.factory.multi;

public class FactoryTest {  
	  
	public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send();  
    }  
} 