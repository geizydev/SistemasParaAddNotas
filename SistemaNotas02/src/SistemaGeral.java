import java.util.ArrayList;

import java.util.List;
import java.io.Serializable;

public class SistemaGeral implements Serializable {
	private List<Material> listaMateriais;
	private List<Professor> listaProfessores;
	private List<Aluno> listaAlunos;
	private List<Administrador> listaAdm;
	private List<Disciplina> listaDisciplina;

	public SistemaGeral() {

		// this.listaProfessores = new <Professor> ArrayList();
		this.listaMateriais = new ArrayList<Material>();
		this.listaProfessores = new ArrayList<Professor>();
		this.listaAlunos = new ArrayList<Aluno>();
		this.listaAdm = new ArrayList <Administrador>();
		this.listaDisciplina = new ArrayList<Disciplina>();
	}
//		comportamentos;

//		Material
		public List<Material> getListaMateriais() {
			return listaMateriais;
		}
		public void setListaMateriais(List <String>titulos, List<String>conteudos, List<String> datas) {
			Material objMaterial = new Material (titulos, conteudos, datas);
			this.listaMateriais.add(objMaterial);
		}
	
//		Professor
	public List<Professor> getListaProfessor() {
		return listaProfessores;
	}

	public void setListaProfessor(String nome, String cpf, String senha) {
		Professor objProfessor = new Professor(nome, cpf, senha);
		this.listaProfessores.add(objProfessor);
	}

//		Aluno;
	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(String nome,  String cpf, String senha) {
		Aluno objAluno = new Aluno( nome, cpf, senha, null, listaDisciplina);
		this.listaAlunos.add(objAluno);
	}
	
//		Disciplinas
	public List<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}

	public void setListaDisciplina(List<Disciplina> listaDisciplina) {
		this.listaDisciplina = listaDisciplina;
	}

//		Administrador;
		public List<Administrador> getListaAdm(){
			return listaAdm;
		}
		public void setListaAdm() {
			Administrador objAdm = new Administrador (null, null, null);
			this.listaAdm.add(objAdm);
		}

}// fim da classe SistemaGeral
