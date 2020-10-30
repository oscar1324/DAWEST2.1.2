/**
 * 
 */
package com.example.demo.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Component;

/**
 * @author 201905
 *
 */
@Component
public class ConsultaDatos implements IConsultaDatos {
	@Override
	public Integer consultaEdad(String nombre) {

		File file = new File("C://Users//201905//Documents//Personas.txt");
		BufferedReader lector;
		try {
			lector = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = lector.readLine()) != null) {
				if (linea.contains(nombre)) {
					// devolvemos la edad
					return recuperaEdad(linea);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}

	private Integer recuperaEdad(String linea) {
		String[] arrayDePersonas = linea.split("-");
		return Integer.parseInt(arrayDePersonas[1]);

	}

	private String recuperaNombre(String linea) {
		String[] arrayDePersonas = linea.split("-");
		return arrayDePersonas[0];

	}
}
