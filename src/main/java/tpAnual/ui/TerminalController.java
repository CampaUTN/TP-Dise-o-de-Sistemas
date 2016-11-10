package tpAnual.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import tpAnual.Terminal;
import tpAnual.POIs.Banco;
import tpAnual.POIs.Negocio;
import tpAnual.POIs.Poi;
import tpAnual.util.wrapper.PointWrapper;

public class TerminalController {

	public static ModelAndView get(Request req, Response res){
		
		Map<String, Object> viewModel = new HashMap<String, Object>();

	 //TODO borrar
		
		Terminal terminal = new Terminal(12);
		terminal.setNombre("test");
		
		viewModel.put("terminal",terminal);
		
		return new ModelAndView(viewModel, "terminal.hbs");
	}
	
	public static ModelAndView listar(Request req, Response res){
		
		//ACA DEBERIAMOS TENER EL REPO QUE SE ENCARGEU DE BUSCAR LOS POIS EN LA BD Y LUEGO MOSTRARLOS		
		
		Map<String, List<Terminal>> model = new HashMap<>();
  		//List<Proyecto> proyectos = RepositorioProyectos.instancia.listar();
  		
		//BORRAR ESTO DE PRUEBA
		List<Terminal> terminales = new ArrayList<Terminal>();
		
		Terminal terminal = new Terminal(10);
		terminal.setNombre("test10");
		Terminal terminal2 = new Terminal(12);
		terminal2.setNombre("test12");
		
		terminales.add(terminal);
		terminales.add(terminal2);
		
  		model.put("terminales", terminales);
  		return new ModelAndView(model, "terminal.hbs");
	
	}
	
}

