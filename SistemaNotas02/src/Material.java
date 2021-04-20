import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Material implements Serializable {

	private List<String> titulos = new <String>ArrayList();
	private List<String> conteudos = new <String>ArrayList();
	private List<String> datas = new <String>ArrayList();

	public Material(List<String> titulos, List<String> conteudos, List<String> datas) {
		this.titulos = titulos;
		this.conteudos = conteudos;
		this.datas = datas;
	}

	public List<String> getTitulos() {
		return titulos;
	}

	public void setTitulos(List<String> titulos) {
		this.titulos = titulos;
	}

	public List<String> getConteudos() {
		return conteudos;
	}

	public void setConteudos(List<String> conteudos) {
		this.conteudos = conteudos;
	}

	public List<String> getDatas() {
		return datas;
	}

	public void setDatas(List<String> datas) {
		this.datas = datas;
	}

}
