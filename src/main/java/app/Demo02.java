package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {

	public static void main(String[] args) {
		
		// -- Actualizar un usuario 
		
		// fabrica el acceso a los datos --> DAO
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
			EntityManager em = fabrica.createEntityManager();
			em.getTransaction().begin();
		
		// ... acciones
		// update set...
			Usuario u = new Usuario(45, "Juan", "Alcantara", "jjpedro@mail.com", "524", "2000/03/11", 2, 2);
			em.merge(u); // si el existe el codigo -> actualiza // sino existe -> lo crea
				
			em.getTransaction().commit();
			em.close();
	}
	
}
