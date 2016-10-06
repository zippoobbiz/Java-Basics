package basics.java.designpattern.behavioral.visitor;

public interface Subject {  
    public void accept(Visitor visitor);  
    public String getSubject();  
}  