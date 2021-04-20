
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Professor extends Pessoa implements Serializable {

	
	// private List<Disciplina> disciplinasLecionadas = new ArrayList<Disciplina>();
	private List<Material> materiais;
	private Disciplina disciplinasLecionadas;

	public Professor(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.materiais = new ArrayList<Material>();
		this.disciplinasLecionadas = new Disciplina();
	}

	/*
	 * public List<Disciplina> getDisciplinasLecionadas() { return
	 * disciplinasLecionadas; } public List<Material> getMaterial() { return
	 * this.materiais; } //Consertar essa peste public void
	 * setDisciplinasLecionadas(Disciplina disc) {
	 * 
	 * }
	 */
	// public

	/*
	 * public void inserirDisciplina() { for(int i = 0; i<.size(); i++) {
	 * 
	 * } }
	 */

	public void inserirNotas() {

	}

}
