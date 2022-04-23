package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {

	public static void main(String[] args) {
		//eliminar ya habiendo obtenido los datos
		
		// fabrica el acceso a los datos --> DAO
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
			EntityManager em = fabrica.createEntityManager();
					
		// ... acciones
		// delete... where codigo
			Usuario u = em.find(Usuario.class, 45); // si existe devuelve el ID --> Devuelve el obj
			System.out.println(u);					// sino existe --> null
					
			if (u != null) {
				em.getTransaction().begin();
				em.remove(u);
				em.getTransaction().commit();
				System.out.print("Se elimino, bien hecho!");
			}	else {
				System.out.print("Codigo no existe, mongol!!");
			}		
			
			em.close();		
	}
}
