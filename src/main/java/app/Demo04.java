package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {

	public static void main(String[] args) {
		// -- Obtener un objeto Usuario segun el codigo o id
		
		// fabrica el acceso a los datos --> DAO
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
			EntityManager em = fabrica.createEntityManager();
			
		// ... acciones
		// delete... where codigo
			Usuario u = em.find(Usuario.class, 45); // si existe devuelve el ID --> Devuelve el obj
			System.out.println(u);					// sino existe --> null
			
			if (u != null)
				System.out.print(u);
			else
				System.err.print("Codigo no existe, mongol!!");
			
			em.close();	
		
		
	}
	
}
