package basics.java.designpattern.creational.factory.abstractf;


public class SendSmsFactory implements Provider{  
  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}
