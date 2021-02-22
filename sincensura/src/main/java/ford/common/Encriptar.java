package ford.common;

import java.util.logging.Logger;

import org.mindrot.jbcrypt.BCrypt;
public class Encriptar {
	private static Logger log = Logger.getLogger(Encriptar.class.getName());

	public static String encript(String texto) {
		try {
			return BCrypt.hashpw(texto, BCrypt.gensalt());
		} catch (Exception exc) {
			log.info("Problema al hacer el encode64");
			return null;
		}
	}

	
	public static boolean comprobar(String texto,String textoEncriptado) {
		return BCrypt.checkpw(texto, textoEncriptado);
	}
}
