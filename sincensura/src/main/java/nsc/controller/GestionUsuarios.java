package nsc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import nsc.common.Label;
import nsc.services.api.IUsuarioService;
import nsc.so.UsuarioSO;

@Controller
public class GestionUsuarios {
	
	@Autowired
	private IUsuarioService usuarioService;

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public void loginUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("errorRegistro");

		String correo = request.getParameter("correo");
		String contra = request.getParameter("contraseña");
		UsuarioSO usuario = usuarioService.findByCorreo(correo);
		if (usuario != null && BCrypt.checkpw(contra, usuario.getContraseña())) {
			session.setAttribute("usuario", usuario);
			session.removeAttribute("errorInicio");
			response.sendRedirect("principal");
		} else {
			session.setAttribute("errorInicio", Label.getLabel("error.inicio"));
			response.sendRedirect("principal");
		}

	}

	@RequestMapping(path = "/registro", method = RequestMethod.POST)
	public void registroUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("errorInicio");

		String nombre = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		String contra = request.getParameter("contraseña");
		String repiteContraseña = request.getParameter("repiteContraseña");
		if (contra.equals(repiteContraseña)) {
			UsuarioSO usuario = usuarioService.save(nombre, correo, contra);
			session.setAttribute("usuario", usuario);
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
