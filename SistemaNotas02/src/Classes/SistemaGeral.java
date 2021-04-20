package Classes;
import java.util.ArrayList;

import java.util.List;

import javax.swing.ImageIcon;

import java.io.Serializable;

public class SistemaGeral implements Serializable {
	
	private List<ImageIcon> listaMateriaisImagens;
	private List <String> listaMateriaisTextos;
	private List<Professor> listaProfessores;
	private List<Aluno> listaAlunos;
	private List<Administrador> listaAdm;
	private List<Disciplina> listaDisciplina;

	public SistemaGeral() {

		//this.listaProfessores = new <Professor> ArrayList();
		this.listaProfessores = new ArrayList<Professor>();
		this.listaAlunos = new ArrayList<Aluno>();
		this.listaAdm = new ArrayList <Administrador>();
		this.listaDisciplina = new ArrayList<Disciplina>();
		this.listaMateriaisImagens = new ArrayList<ImageIcon>();
	}
//		comportamentos;

//		Material Imagens
		public List<ImageIcon> getListaMateriais() {
			return listaMateriaisImagens;
		}
		public void setListaMateriais(ImageIcon imagemPNG) {
			Material objMaterial = new Material (imagemPNG);
			System.out.println(imagemPNG);
			this.listaMateriaisImagens.add(imagemPNG);
		}
//		Material Textos
		public List<String> getListaMateriaisTextos() {
			return listaMateriaisTextos;
		}
		public void setListaMateriaisTextos(String textos) {
			Material objMaterial = new Material (null);
			System.out.println(textos);
			this.listaMateriaisTextos.add(textos);
		}	
	
//		Professor
	public List<Professor> getListaProfessor() {
		return listaProfessores;
	}

	public void setListaProfessor(String nome, String cpf, String senha, String inforDisc) {
		Professor objProfessor = new Professor(nome, cpf, senha, null);
		this.listaProfessores.add(objProfessor);
	}

//		Aluno;
	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(String nome,  String cpf, String senha, String serie) {
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
