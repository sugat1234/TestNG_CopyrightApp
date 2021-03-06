package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	
	 public static Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
	
	public static String getPropertyFromFile(String property) {
		
		Properties prop=null;
		String propertyValue=null;
		try {
			prop = readPropertiesFile(".\\properties\\copyright.properties");
			propertyValue=prop.getProperty(property);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return propertyValue;
	}
	
	public static void main(String[] args) {

		System.out.println(getPropertyFromFile("url"));
		getPropertyFromFile("browser");
		
	}

}
