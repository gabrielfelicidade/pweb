package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Aluno;
import java.util.List;

@ManagedBean
@SessionScoped
public class AlunoMB {
	private Aluno aluno = new Aluno();
	EntityManagerFactory emf;
	
	public AlunoMB() {
		emf = Persistence.createEntityManagerFactory("prjCadastroAlunoJPA");
	}

	public void salvar() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		em.close();
		aluno = new Aluno();
	}

	public List<Aluno> getAlunos() {
		List<Aluno> alunos;
		EntityManager em = emf.createEntityManager();
		alunos = em.createQuery("SELECT a FROM Aluno a", Aluno.class).getResultList();
		em.close();
		return alunos;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
