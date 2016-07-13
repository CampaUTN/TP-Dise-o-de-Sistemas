package tpAnual.batch.procesos;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import tpAnual.Mapa;
import tpAnual.POIs.Poi;
import tpAnual.externo.adapters.BajaPoiAdapter;
import tpAnual.externo.sistemasExternos.PoiAEliminarDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcesoBajaPoi extends Proceso {
	
	public List<PoiAEliminarDTO> poisExternos = new ArrayList<PoiAEliminarDTO>();
	BajaPoiAdapter bajaPoiAdapter = new BajaPoiAdapter();
	String url;
	String path;
	
	public ProcesoBajaPoi(){ //Cuando se instancia la clase se trae la ultima modificacion
		poisExternos = bajaPoiAdapter.consultar(url, path);
	}
	
	@Override
	public void ejecutar(){ //Command para el lanzador
		 poisExternos.forEach(poi -> this.eliminarPoi(poi.getId()));
	}
	 
	 public void eliminarPoi(Integer id){
		Mapa mapa = Mapa.getInstance();
		List<Poi> pois = new ArrayList<>();
		pois = mapa.pois;
		pois.stream().filter(p -> p.getId().equals(id)).forEach(p -> mapa.baja(p));
	 }	
	 
	 public void setUrl(String url){
		 this.url=url;
	 }
	 
	 public String getUrl(){
		 return this.url;
	 }
	 
	 public void setPath(String path){
		 this.path=url;
	 }
	 
	 public String getPath(){
		 return this.path;
	 }
	 

}