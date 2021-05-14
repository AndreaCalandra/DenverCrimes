package it.polito.tdp.crimes.model;

import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.crimes.db.EventsDao;

public class Model {
	
	public SimpleWeightedGraph<String, DefaultWeightedEdge> grafo;
	public EventsDao dao;
	
	public Model () {
		dao = new EventsDao();
	}
	
	
	public void creaGrafo(String categoria, int mese) {
		this.grafo = new SimpleWeightedGraph<> (DefaultWeightedEdge.class);
		
		Graphs.addAllVertices(grafo, dao.getVertici(categoria, mese));
		
	}
}
