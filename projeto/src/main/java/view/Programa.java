package view;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence;

import control.AlunoControle;
import model.Aluno;

public class Programa {
	public static void main(String[] args) {
		
		
		//Aluno aluno2 = new Aluno(null, "Maria Joana Fagundes", "2000-10-11",   "201119224", "1", "mariaj2@gmail.com","F");
		//Aluno aluno3 = new Aluno(null,"Marcos Fabiano Reis", "1999-05-15",    "558833316", "1", "marcosfa@gmail.com","M");		
		//Aluno aluno4 = new Aluno(null,"Marcos Fabiano Reis", "1999-05-15",    "558833316", "1", "marcosfa@gmail.com","M");	
		

		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto"); 
		EntityManager em = emf.createEntityManager(); 
	
		em.getTransaction().begin();
		*/
		
		//em.persist(aluno1); // chamo o gerenciador de tabelas (em) para fazer o comando insert realacionado ao aluno
		//em.persist(aluno3);
		//em.persist(aluno4);
		
		/*em.getTransaction().commit();

		em.close(); 
		emf.close();
		*/
		Aluno aluno1 = new Aluno(null, "Mario Nogueira", "2000-08-12", "1745291234", "1", "amarieis@gmail.com","F");
		AlunoControle controle = new AlunoControle();
		controle.buscarPorId(6);
		//controle.inserir(aluno1);
		//controle.alterar(aluno1);
		//controle.excluir(aluno1);
		
		/*List<Aluno> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
		Aluno obj = (Aluno) iterator.next();
			System.out.println(obj.getNome());
	}
	*/
		

}
}