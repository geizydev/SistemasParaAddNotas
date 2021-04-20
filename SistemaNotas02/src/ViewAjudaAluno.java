

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewAjudaAluno extends JFrame {
	
	private JLabel perguntaFrequente1;
	private JLabel perguntaFrequente2;
	private JLabel perguntaFrequente3;
	private JLabel perguntaFrequente4;
	
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JLabel ajuda1Label;
	private JLabel ajuda2Label;
	private JLabel ajuda3Label;
	private JLabel ajuda4Label;
	
	
	private JButton voltarButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	
	private SistemaGeral objSistema;

	
	public ViewAjudaAluno(SistemaGeral objSistema) {
		
		super("Ajuda");
		setLayout(null);
		this.objSistema = objSistema;

		this.acessoLabel = new JLabel ("Ajuda");
		acessoLabel.setBounds(380,20,150,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.voltarButton = new JButton("voltar");
		voltarButton.setBounds(20, 20, 80, 20);
		add(voltarButton);
		this.configuracoesButton = new JButton("Configurações");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		
		this.perguntaFrequente1 = new JLabel("1.O que faço para alterar minha senha?");
		perguntaFrequente1.setBounds(100, 120, 250, 20);
		add(perguntaFrequente1);
		this.ajuda1Label = new JLabel("Para qualquer alteração no sistema, favor solicitar ao administrador.");
		ajuda1Label.setBounds(120, 140, 500, 20);
		add(ajuda1Label);
		
		this.perguntaFrequente2 = new JLabel("2.Onde posso encontrar o administrador do sistema?");
		perguntaFrequente2.setBounds(100, 200, 320, 20);
		add(perguntaFrequente2);
		this.ajuda2Label = new JLabel ("Para consultar o administrador do sistema, vá até a secretaria de sua escola.");
		ajuda2Label.setBounds(120, 220, 440, 20);
		add(ajuda2Label);
		
		saidaButton.addActionListener(new ControleEvento());
		voltarButton.addActionListener(new ControleEvento());
	}
	public void exibirTela() {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
	}
	
	private class ControleEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==saidaButton) {
				setVisible(false);
			}
			if(e.getSource()==voltarButton) {
				ViewAluno telaAluno = new ViewAluno(objSistema);
				telaAluno.exibirTela();
			}
		}
		
	}
}
