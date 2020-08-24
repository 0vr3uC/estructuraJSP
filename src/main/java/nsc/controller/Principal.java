package nsc.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import nsc.services.api.INoticiaService;
import nsc.so.NoticiaSO;

@Controller
public class Principal {
	private static Logger log = Logger.getLogger(Principal.class.getName());

	@Autowired
	private INoticiaService noticiaService;
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws IOException
	 * @throws ServletException
	 */
	@RequestMapping(path = "/principal", method = RequestMethod.GET)
	public String init(HttpServletRequest request, HttpServletResponse response) {
		log.info("mapeado correcto principal.jsp");
		
		List<NoticiaSO> noticias = noticiaService.findAll();
		System.out.println(noticias.size());
		
		return "principal";
	}

}
