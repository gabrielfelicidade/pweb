package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entidades.Aluno;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class AlunoMB {
	private List<Aluno> listaAlunos = new ArrayList<Aluno>();
	private Aluno aluno = new Aluno();

	public void salvar() {
		listaAlunos.add(aluno);
		aluno = new Aluno();
	}

	public List<Aluno> getAlunos() {
		return listaAlunos;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
