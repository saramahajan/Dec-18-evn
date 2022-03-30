package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class ReadPropertyClass {
	public static Properties prop;
 public static FileInputStream fis;
 public String s="sample String";
	
	public static String readProperties1(String arg) throws IOException  {
		
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		 prop=new Properties();
		 
		 fis =new FileInputStream(path);
		 
		
			prop.load(fis);
			
	
		String value=prop.getProperty(arg);
		return value;
		 
	}



}
