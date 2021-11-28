package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.Aluno;

import javax.persistence.EntityManagerFactory;
public class AlunoControle {
	private EntityManager em;

	public AlunoControle() {
		EntityManager emf = (EntityManager) Persistence.createEntityManagerFactory("clinica");
		em = ((EntityManagerFactory) emf).createEntityManager();
	}
	public void inserir(Aluno objeto) {}
	public void alterar(Aluno objeto) {}
	public void excluir(Aluno objeto) {}
	public void excluirPorId(Integer id) {}
	public Aluno buscarPorId(Integer id) {
		return null;}
	public List<Aluno> buscarTodos() {
		return null;}
	//outros métodos de busca que achar 
	
	
}
