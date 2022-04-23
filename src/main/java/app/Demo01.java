package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {

	public static void main(String[] args) {
		// -- Registrar un nuevo usuario 
		
		// fabrica el acceso a los datos --> DAO
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		// manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		
		// empezar los procesos --> Registro, actualizacion, eliminacion
		em.getTransaction().begin();
		// ... acciones
		// insert into...
		Usuario u = new Usuario(13, "Soila", "Baca", "soilab@mail.com", "1234", "2000/03/15", 1, 1);
		em.persist(u);
		
		// confirmar la transacción
		em.getTransaction().commit();
		
		// cerrar manejador
		em.close();
	}
	
}
