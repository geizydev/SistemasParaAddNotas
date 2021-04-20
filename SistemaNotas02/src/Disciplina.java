import java.io.Serializable;

public class Disciplina implements Serializable {

	private String nomeDisciplina;
	private String codigoDisciplina;
	private int anoEspecifico;
	private int bimestreEspecifico;

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public int getAnoEspecifico() {
		return anoEspecifico;
	}

	public void setAnoEspecifico(int anoEspecifico) {
		this.anoEspecifico = anoEspecifico;
	}

	public int getBimestreEspecifico() {
		return bimestreEspecifico;
	}

	public void setBimestreEspecifico(int bimestreEspecifico) {
		this.bimestreEspecifico = bimestreEspecifico;
	}

}
