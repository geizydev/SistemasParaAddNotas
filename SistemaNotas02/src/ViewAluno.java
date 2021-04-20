

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewAluno extends JFrame{
	
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton notasButton;
	private JButton historicoButton;
	private JButton dificuldadesButton;
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	
	private Aluno objAluno;
	private SistemaGeral objSistema;
	
	public ViewAluno(SistemaGeral objSistema) {
		super("Acesso Discente");
		
		setLayout(null);
		this.objSistema = objSistema;
		
		this.acessoLabel = new JLabel ("Acesso Discente");
		acessoLabel.setBounds(350,20,100,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.notasButton = new JButton("Acessar Notas");
		notasButton.setBounds(50, 300, 160, 40);
		add(notasButton);
		this.historicoButton = new JButton("Histórico Escolar");
		historicoButton.setBounds(310, 300, 160, 40);
		add(historicoButton);
		this.dificuldadesButton = new JButton("Dificuldades");
		dificuldadesButton.setBounds(570, 300, 160, 40);
		add(dificuldadesButton);
		this.ajudaButton = new JButton ("Ajuda");
		ajudaButton.setBounds(500, 500, 70, 20);
		add(ajudaButton);
		this.configuracoesButton = new JButton("Configurações");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		
	}
	
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	
	private class ControleEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
		
	}
}
