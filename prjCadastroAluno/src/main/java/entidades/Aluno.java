package entidades;

public class Aluno {
	private String ra;
	private String nome;
	private String dataNascimento;
	private String cpf;
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String maskCpf() {
		if(cpf != null && cpf.replace("_", "").length() > 13) {
			return "999.999.999-99";
		}else {
			return "99.999.999-99?9";
		}
	}
}
