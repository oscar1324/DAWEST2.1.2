/**
 * 
 */
package com.example.demo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.demo.datos.ConsultaDatos;
import com.example.demo.datos.IConsultaDatos;

/**
 * @author 201905
 * funcion del componene: es un beans que sabe que tiene que inyectar en algun lado
 */
@Component
public class Descuento implements IDescuento {
	@Autowired
	IConsultaDatos consultaDatos;
	@Override
	public Integer calculaDescuento(String nombre) {

		// ConsultaDatos consultaDatos = new ConsultaDatos();

		// L�gica de negocio

		if (consultaDatos.consultaEdad(nombre) < 20) {
			return 5;
		} else {
			return 10;
		}

	}
}
