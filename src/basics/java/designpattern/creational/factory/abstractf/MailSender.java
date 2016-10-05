package basics.java.designpattern.creational.factory.abstractf;

public class MailSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}
}