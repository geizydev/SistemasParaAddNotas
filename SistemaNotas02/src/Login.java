
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.io.Serializable;

public class Login implements Serializable {

	private List<Aluno> aluno = new ArrayList<Aluno>();
	private SistemaGeral objSistema;

	public Login(SistemaGeral objSistema) {
		this.objSistema = objSistema;
	}

	public void entrarSistema(String cpf, String senha) {

		int idAlunoSelecionado = -1;

		for (int i = 0; i < objSistema.getListaAlunos().size(); i++) {

			if (objSistema.getListaAlunos().get(i).getCpf().equals(cpf)
					&& objSistema.getListaAlunos().get(i).getSenha().equals(senha)) {
				idAlunoSelecionado = i;
			}

		}

		if (idAlunoSelecionado != -1) {
			ViewAluno telaAluno = new ViewAluno(objSistema);
		} else {
			JOptionPane.showMessageDialog(null, "Login errado");
		}

		for (int i = 0; i < aluno.size(); i++) {
			if (aluno.get(i).getCpf() == null && aluno.get(i).getSenha() == null) {
				aluno.add(aluno.get(i));
			}
		}
	}

	public void sairSistema() {
		for (int i = 0; i < aluno.size(); i++) {
			if (aluno.get(i).getCpf() != null && aluno.get(i).getSenha() != null) {
				aluno.remove(aluno.get(i));
			}
		}
	}
}
