package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("user.dir"));
		String path=System.getProperty("user.dir") + "\\src\\test\\resources\\prod.properties";
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		
		System.out.println(prop.getProperty("username"));

	}

}
