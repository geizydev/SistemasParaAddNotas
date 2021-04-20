package Telas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Classes.SistemaGeral;

public class ViewAdministrador extends JFrame {
	
	private JButton cadastrarAlunoButton;
	private JButton cadastrarProfessorButton;
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	
	
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	private JLabel acessoLabel;
		 
	private SistemaGeral objSistema;
	
	public ViewAdministrador(SistemaGeral objSistema) {
		super("Acesso Administrativo");
		
		setLayout(null);
		
		this.objSistema = objSistema;
		
		this.acessoLabel = new JLabel("Acesso Administrativo");
		acessoLabel.setBounds(330,20,150,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.cadastrarAlunoButton = new JButton("Cadastrar Aluno");
		cadastrarAlunoButton.setBounds(200, 300, 160, 40);
		add(cadastrarAlunoButton);
		this.cadastrarProfessorButton = new JButton("Cadastrar Professor");
		cadastrarProfessorButton.setBounds(400, 300, 160, 40);
		add(cadastrarProfessorButton);
		this.ajudaButton = new JButton ("Ajuda");
		ajudaButton.setBounds(500, 500, 70, 20);
		add(ajudaButton);
		this.configuracoesButton = new JButton("Configurações");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		
		cadastrarProfessorButton.addActionListener(new ControleEvento());
		cadastrarAlunoButton.addActionListener(new ControleEvento());
		saidaButton.addActionListener(new ControleEvento());
	}
	
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);

	}
	
	private class ControleEvento implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cadastrarAlunoButton) {
				ViewCadastroAluno cadastroA = new ViewCadastroAluno(objSistema);
				cadastroA.exibirTela();
			}
			if(e.getSource() == cadastrarProfessorButton){
				ViewCadastroProfessor cadastroP = new ViewCadastroProfessor(objSistema);
				cadastroP.exibirTela();
			}
			if(e.getSource() == saidaButton) {
				setVisible(false);
			}
		}
		
	}

}
