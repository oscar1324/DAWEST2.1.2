/**
 * 
 */
package com.example.demo.abajo;

import javax.servlet.annotation.WebServlet;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 201905
 *
 */
@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("Hola")
	public String Hola(ModelMap model) {
		Persona p = new Persona("Alba",20);
		model.addAttribute("Persona",p);
		return "documentoJSP";
	}
	
}
