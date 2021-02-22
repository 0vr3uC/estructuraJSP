package ford.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ford.common.Label;
import ford.services.api.IUsuarioService;

@Controller
public class GestionUsuarios {

	@Autowired
	private IUsuarioService usuarioService;

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public void loginUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("errorRegistro");

		response.sendRedirect("principal");

	}

	@RequestMapping(path = "/registro", method = RequestMethod.POST)
	public void registroUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("errorInicio");

		String contra = request.getParameter("contraseña");
		String repiteContraseña = request.getParameter("repiteContraseña");
		if (contra.equals(repiteContraseña)) {
			session.removeAttribute("errorRegistro");
			response.sendRedirect("principal");
		} else {
			session.setAttribute("errorRegistro", Label.getLabel("error.registro"));
			response.sendRedirect("principal");
		}
	}

	@RequestMapping(path = "/salir", method = RequestMethod.POST)
	public void salir(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.getSession().removeAttribute("usuario");
		response.sendRedirect("principal");
	}
}
