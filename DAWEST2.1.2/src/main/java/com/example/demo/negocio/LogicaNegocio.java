/**
 * 
 */
package com.example.demo.negocio;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Datos.ConsultaDatos;
import com.example.demo.Datos.IConsultaDatos;



/**
 * @author 201905
 *
 */

@Component
public class LogicaNegocio implements ILogicaNegocio {
	@Autowired // logica de negocios utiliza clase acesso de datos
	IConsultaDatos consultaDatos; 
	@Override
	public  int cuantosCoches(String nombre) throws IOException {
		 
		// ConsultaDatos consultaDatos = new ConsultaDatos();
		List<String> nombres = consultaDatos.consultaCoches(); //Array de string que devuelve la capa de datos
		int contador = 0;
		
		for (String nombreArray : nombres) {
			if(nombreArray.contentEquals(nombre)) {
				contador++;
			}
		}
		return contador;
	}

}