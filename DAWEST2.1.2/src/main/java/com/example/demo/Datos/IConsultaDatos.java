package com.example.demo.Datos;

import java.io.IOException;
import java.util.List;

public interface IConsultaDatos {

	List<String> consultaCoches() throws IOException;

}