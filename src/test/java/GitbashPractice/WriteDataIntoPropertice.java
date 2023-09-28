package GitbashPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataIntoPropertice {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		p.setProperty("browser", "chrome");
		p.setProperty("username", "admin");
		p.setProperty("password", "root");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/CommanData.properties");
		p.store(fos, "PropertyFileData");
		FileInputStream fis=new FileInputStream("./src/test/resources/CommanData.properties");
		p.load(fis);
		String Browser=p.getProperty("browser");
		System.out.println(Browser);

	}

}
