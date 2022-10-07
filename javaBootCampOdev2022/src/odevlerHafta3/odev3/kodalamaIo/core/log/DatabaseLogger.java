package kodalamaIo.core.log;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void log(String data) {
System.out.println("Database'e loglandý: " + data);		
	}

}
