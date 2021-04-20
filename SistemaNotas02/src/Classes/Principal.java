package Classes;
import java.util.ArrayList;
import java.util.List;

import Serializacao.LoginLerDados;
import Telas.TelaLogin;
import Telas.ViewAddImagem;
import Telas.ViewAdministrador;
import Telas.ViewAluno;
import Telas.ViewCadastroAluno;
import Telas.ViewCadastroProfessor;
import Telas.ViewExibirMaterial;
import Telas.ViewProfessor;

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

		// ViewProfessor telaProfessor = new ViewProfessor(objGeral);
		// telaProfessor.exibirTela();

		// ViewAdministrador telaAdm = new ViewAdministrador(objGeral);
		// telaAdm.exibirTela();

		// ViewHistorico telaHistorico = new ViewHistorico();
		// telaHistorico.exibirTela();

		// ViewAcessoNotas telaNotas = new ViewAcessoNotas();
		// telaNotas.exibirTela();

		// ViewCadastroAluno telaCadastroAluno = new ViewCadastroAluno(objGeral);
		// telaCadastroAluno.exibirTela();

//		 ViewCadastroProfessor telaCadastroProf = new ViewCadastroProfessor(objGeral);
//		 telaCadastroProf.exibirTela();

		 TelaLogin telaLogin = new TelaLogin(objGeral);
		 telaLogin.exibirTela();
		
		//ViewAddImagem telaAddImagem = new ViewAddImagem();
		//telaAddImagem.exibirTela();
		
		// ViewExibirMaterial exibeMaterial = new ViewExibirMaterial(objGeral);
		// exibeMaterial.exibirTela();
//		https://brasilescola.uol.com.br/o-que-e/biologia/o-que-e-celula.htm
//		 https://www.infoescola.com/citologia/celula-animal/
	}

}
