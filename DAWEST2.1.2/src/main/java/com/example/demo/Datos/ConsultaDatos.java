/**
 * 
 */
package com.example.demo.Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * @author 201905
 *
 */
@Component
public class ConsultaDatos implements IConsultaDatos {
	@Autowired
	@Override
	public List<String> consultaCoches() throws IOException {
		File f = new File("C:/Users/201905/Documents/coches.txt");
		BufferedReader lector = new BufferedReader(new FileReader(f));
		String linea;
		
		List<String> nombres = new ArrayList<>();
		
		while((linea = lector.readLine()) != null) {
			nombres.add(recuperaNombre(linea));
			
		}
		
		lector.close();
		return nombres;
	}
	
	String recuperaNombre(String linea) {
		String[] persona = linea.split("-");
		
		return persona[0];
	}
	
}