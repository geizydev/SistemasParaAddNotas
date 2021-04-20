package Classes;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Material implements Serializable {

	private List<ImageIcon> imagemPNG;
	private List<String> textos;

	public Material(ImageIcon imagemPNG) {
		this.imagemPNG = new ArrayList <ImageIcon>();
		this.textos = new <String>ArrayList();
	}
	
	public List<ImageIcon> getImagens() {
		return imagemPNG;
	}

	public void setImagens(ImageIcon imagens) {
		this.imagemPNG.add(imagens);
	}
	public List<String> getTextos() {
		return textos;
	}
	public void setTextos(List<String> textos) {
		this.textos = textos;
	}
	

}
