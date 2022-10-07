package kodalamaIo.core.log;

public class MailLogger implements BaseLogger{

	@Override
	public void log(String data) {
System.out.println("Mail'e loglandý: " +data);		
	}
	

}
