package Classes;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;

public class Aluno extends Pessoa implements Serializable {

	// private String discDificuldades;
	private List<Integer> serie;
	private List<Disciplina> disciplinasDificuldade;

	public Aluno(String nome, String cpf, String senha, List<Integer> serie, List<Disciplina> disciplinasDificuldade) {
		super(nome, cpf, senha);
		
		this.serie = new ArrayList<Integer>();
		this.disciplinasDificuldade = new ArrayList<Disciplina>();
	}

	public List<Integer> getSerie() {
		return serie;
	}

	public void setSerie(List<Integer> serie) {
		this.serie = serie;
	}

	public List<Disciplina> getDisciplinasDificudade() {
		return disciplinasDificuldade;
	}

	public void setDisciplinasDificudade(Disciplina discDificuldade) {
		disciplinasDificuldade.add(discDificuldade);
	}
//	public void imprimirHistorico() {
//		if(getCpf()=="222.222.222-22" && getSenha()=="1234@") {
//			System.out.println("#############################################");
//			System.out.println("HISTÓRICO ESCOLAR");
//			System.out.println("Nome do Aluno(a): " + getNome());
//			System.out.println("CPF: " + getCpf());
//			System.out.println("Série: " +getSerie() + "º");
//			System.out.println("NOTAS");
//			for(int i =0; i<historicoEscolar.getNota().size(); i++) {
//				System.out.println("Disciplina: " + historicoEscolar.getNomeDisciplina().get(i) +"_____________" + "Nota: " + historicoEscolar.getNota().get(i));
//				}
//			System.out.println("#############################################");
//			}else {
//				System.out.println("IMPOSSÍVEL IMPRIMIR HISTÓRICO. ACESSO NEGADO.");
//			}
}
