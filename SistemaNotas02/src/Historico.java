import java.io.Serializable;

import java.util.ArrayList;

import java.util.List;

public class Historico implements Serializable {

	private List<Double> notas = new ArrayList<Double>();
	private List<String> nomeDisciplina = new ArrayList<String>();

	public List<String> getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nome) {
		nomeDisciplina.add(nome);
	}

	public List<Double> getNota() {
		return notas;
	}

	public void setNota(double nota) {
		notas.add(nota);
	}
}
