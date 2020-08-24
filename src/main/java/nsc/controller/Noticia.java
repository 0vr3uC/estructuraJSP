package nsc.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import nsc.services.api.INoticiaService;

@Controller
public class Noticia {
	private static Logger log = Logger.getLogger(Noticia.class.getName());

	@Autowired
	INoticiaService noticiaService;
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws IOException
	 * @throws ServletException
	 */
	@RequestMapping(path = "/crear/noticia", method = RequestMethod.GET)
	public String init(HttpServletRequest request, HttpServletResponse response) {
		log.info("mapeado correcto creaNoticia.jsp");

		
		
		return "creaNoticia";
	}

}
