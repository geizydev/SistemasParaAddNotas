import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoginSalvarDados {

	private ObjectOutputStream saida;

	public void abrirArquivos() {
		try {
			this.saida = new ObjectOutputStream(new FileOutputStream("sistemaGeral.ser"));
		} catch (IOException error) {
			System.out.println("Erro ao tentar abrir/criar o arquivo");
			// System.exit(1);
		}
	}

	public void salvarDados(SistemaGeral sistemaGeral) {

		try {
			saida.writeObject(sistemaGeral);
		} catch (IOException error) {
			System.out.println("Erro ao escrever arquivo");
		} catch (NoSuchElementException error) {
			System.out.println("Entrada inválida");
		}

	}

	public void fecharArquivos() {
		try {
			if (saida != null) {
				saida.close();
			}
		} catch (IOException error) {
			System.out.println("Erro ao fechar o arquivo");
		}
	}
}
