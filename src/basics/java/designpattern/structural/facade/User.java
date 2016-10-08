package basics.java.designpattern.structural.facade;

public class User {  
	  
    public static void main(String[] args) {  
        Computer computer = new Computer();  
        computer.startup();  
        computer.shutdown();  
    }  
}  