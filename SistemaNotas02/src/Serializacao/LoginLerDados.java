package Serializacao;
import java.util.ArrayList;
import java.util.List;

import Classes.SistemaGeral;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoginLerDados {

	private ObjectInputStream entrada;

	public void AbrirDados() {
		try {
			entrada = new ObjectInputStream(new FileInputStream("sistemaGeral.ser"));
		} catch (IOException error) {
			System.out.println("Erro ao Abrir o arquivo");
		}

	}

	public SistemaGeral LerDados() {

		SistemaGeral obSistemaGeral = null;

		if (entrada != null) {
			try {
				obSistemaGeral = (SistemaGeral) entrada.readObject();

			} catch (ClassNotFoundException error) {
				System.out.println("N�o foi possivel criar o objeto");
			} catch (IOException error) {
				System.out.println("Erro durante a leitura do arquivo");
			}
		}

		return obSistemaGeral;
	}

	public void fecharArquivo() {

		try {
			if (entrada != null) {
				entrada.close();
			}
		} catch (IOException error) {
			System.out.println("Erro ao fechar arquivo");
		}
	}

}
