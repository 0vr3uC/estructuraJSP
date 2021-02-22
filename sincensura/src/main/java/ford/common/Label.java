package ford.common;

import java.io.InputStream;
import java.util.Properties;

public class Label {
	public static String getLabel(String key) {
		try {
			InputStream inputStream = Label.class.getClassLoader().getResourceAsStream("/application.properties");
			Properties myproperties = new Properties();
			myproperties.load(inputStream);
			return myproperties.getProperty(key);
		} catch (Exception e) {
			return "No se ha encontrado la propiedad, Avisa al administrador";
		}
	}
}