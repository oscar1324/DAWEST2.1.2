/**
 * 
 */
package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.negocio.ILogicaNegocio;
import com.example.demo.negocio.LogicaNegocio;



/**
 * @author 201905
 *
 */
@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	ILogicaNegocio negocio;
	
	@RequestMapping("negocio") // al enviar se introduce por el mapping
	public String CalculaDescuento(@RequestParam("nombre")String n, ModelMap model) {
		
		// el container nos genera la inyección de dependencias para poder
		// utilizar el objeto tal cual, al que le llamamos al metodo calcular ddescuento
		
		try {
		//			LogicaNegocio on = new LogicaNegocio();
		//			on.cuantosCoches(n);
			Integer nCoches = negocio.cuantosCoches(n);
			
			model.addAttribute("numeroCoches", nCoches);
			return "dd";
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		return "negocio";
		
	}
}
