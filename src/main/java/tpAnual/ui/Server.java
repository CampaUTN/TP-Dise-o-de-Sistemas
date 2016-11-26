package tpAnual.ui;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import spark.Request;
import spark.Response;
import spark.Spark;
import tpAnual.busquedas.BuscadorLocal;
import tpAnual.busquedas.RepositorioBuscadores;
import tpAnual.util.Reseter;

public class Server {
	public static void main(String[] args) {

		Reseter.resetSingletons();

		RepositorioBuscadores.getInstance().agregarConsultora( new BuscadorLocal());
		configurarSpark();
		Router.configure();
		Spark.after((req,res)-> {
			PerThreadEntityManagers.getEntityManager().clear(); //si no va, poner close.
		});
		
		Reseter.resetSingletons();
	}
	
	
	public static void configurarSpark(){
		Spark.port(4567);
		Spark.staticFileLocation("/ui");
	}
	
	public static String paginaPrincipal(Request req, Response res){
		return "hola";
	}
}
