package control;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.Aluno;

import javax.persistence.EntityManagerFactory;
public class AlunoControle {
	private EntityManager em;
	private EntityManagerFactory emf;

	public AlunoControle() {
		emf = Persistence.createEntityManagerFactory("projeto"); 
	 em = emf.createEntityManager(); 
	}
	public void inserir(Aluno objeto) {
		try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
            
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	public void alterar(Aluno objeto) {
		try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	public void excluir(Aluno objeto) {
		try {
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	public void excluirPorId(Integer id) {
		try {
            Aluno objeto = buscarPorId(id);
            excluir(objeto);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
	}
	public Aluno buscarPorId(Integer id) {
		
		return em.find(Aluno.class, id)
;}
	public List<Aluno> buscarTodos() {
		String nomeClasse = Aluno.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();}
	//outros métodos de busca que achar 
	
	
}
