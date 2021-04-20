import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		SistemaGeral objGeral = null;

		LoginLerDados obLerDados = new LoginLerDados();
		obLerDados.AbrirDados();
		objGeral = obLerDados.LerDados();
		obLerDados.fecharArquivo();
		
		if(objGeral == null) {
			objGeral = new SistemaGeral();
		}

		// ViewAluno telaAluno = new ViewAluno(objGeral);
		// telaAluno.exibirTela();

		// ViewProfessor telaProfessor = new ViewProfessor();
		// telaProfessor.exibirTela();

		// ViewAdministrador telaAdm = new ViewAdministrador(objGeral);
		// telaAdm.exibirTela();

		// ViewHistorico telaHistorico = new ViewHistorico();
		// telaHistorico.exibirTela();

		// ViewAcessoNotas telaNotas = new ViewAcessoNotas();
		// telaNotas.exibirTela();

		// ViewCadastroAluno telaCadastroAluno = new ViewCadastroAluno(objGeral);
		// telaCadastroAluno.exibirTela();

		// Professor p1 = new Professor("djgkfd", "111.111.111-11", "123!", "estudo");
		// p1.setDisciplinasLecionadas();

		// ViewCadastroProfessor telaCadastroProf = new ViewCadastroProfessor(objGeral);
		// telaCadastroProf.exibirTela();

		 TelaLogin telaLogin = new TelaLogin(objGeral);
		 telaLogin.exibirTela();

	}

}
