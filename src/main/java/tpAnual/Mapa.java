package tpAnual;

import java.util.ArrayList;
import java.util.List;
import org.uqbar.geodds.Point;

public class Mapa {

	private BuscadorTexto buscador = new BuscadorTexto();
	private List<Poi> pois = new ArrayList<Poi>();

	public List<Poi> buscarPoi(String tags) {
		return buscador.BuscameSegunTags(tags, pois);
	}

	public boolean estaCerca(Poi poi, Point unPunto) {
		return poi.estaCerca(unPunto);
	}

	public boolean estaDisponible(Poi poi) {
		return poi.estaDisponible();
	}

	public boolean estaDisponible(Poi poi, String servicio) {
		return poi.estaDisponible(servicio);
	}

	// Manejo de lista
	public void agregarPoi(Poi poi) {
		pois.add(poi);
	}

	public void sacarPoi(Poi poi) {
		pois.remove(poi);
	}

	public int cantidadPois() {
		return pois.size();
	}

	public void mostrar(List<Poi> list) {
		// list.forEach(System.out.println();); Imprimir en pantalla la lista
		// que quedo con los tags
	}

}
