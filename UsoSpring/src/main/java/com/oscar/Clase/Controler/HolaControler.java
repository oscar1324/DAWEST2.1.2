/**
 * 
 */

package com.oscar.Clase.Controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 201905
 *
 */
@Controller
public class HolaControler {
	@RequestMapping("saludo")
	@ResponseBody //imprime directamente hola
	public String Hola() {
		return "hola";
	}
}
