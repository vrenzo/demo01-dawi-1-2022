package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {

	public static void main(String[] args) {
		// -- Eliminar un usuario 
		
		// fabrica el acceso a los datos --> DAO
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
			EntityManager em = fabrica.createEntityManager();
			em.getTransaction().begin();
				
		// ... acciones
		// delete... where codigo
			Usuario u = new Usuario();
			u.setCodigo(45); 
				
			em.remove(u); // !! se necesita pasar un objeto --> buscar y devolver..
			
			em.getTransaction().commit();
			em.close();		
	}
	
}
