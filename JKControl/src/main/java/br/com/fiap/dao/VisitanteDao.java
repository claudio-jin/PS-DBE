package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Visitante;

public class VisitanteDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("visitante-persistence-unit");
	EntityManager manager = factory.createEntityManager();

	
	public void insert(Visitante visit) {
		
		manager.getTransaction().begin();
		manager.persist(visit);
		manager.getTransaction().commit();
		
		manager.clear();
		
	}
	
	public List<Visitante> list(){
		TypedQuery<Visitante> query = 
				manager.createQuery("SELECT v FROM Visitante v", Visitante.class);
		return query.getResultList();
		
	}
	
	public void update(Visitante visit) {
		manager.getTransaction().begin();
		visit = manager.merge(visit);
		manager.getTransaction().commit();
	}
}
