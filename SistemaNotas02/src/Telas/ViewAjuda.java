package Telas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Classes.SistemaGeral;

public class ViewAjuda extends JFrame{
	
	private JLabel perguntaFrequente1;
	private JLabel perguntaFrequente2;

	
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JLabel ajuda1Label;
	private JLabel ajuda2Label;

	
	private JButton voltarButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	
	private SistemaGeral objSistema;
	
	public ViewAjuda(SistemaGeral objSistema) {
		
		super("Ajuda");
		setLayout(null);
		this.objSistema = objSistema;

		this.acessoLabel = new JLabel("Ajuda");
		acessoLabel.setBounds(380,20,150,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.perguntaFrequente1 = new JLabel("1.Como fa�o para alterar minha senha? ");
		perguntaFrequente1.setBounds(100, 120, 300, 20);
		add(perguntaFrequente1);
		this.ajuda1Label = new JLabel("Para fazer qualquer tipo de altera��o no sistema � necess�rio entrar em contato com o administrador.");
		ajuda1Label.setBounds(120, 140, 600, 20);
		add(ajuda1Label);
		
		this.perguntaFrequente2 = new JLabel("2.Onde posso encontrar o setor de administra��o?");
		perguntaFrequente2.setBounds(100, 180, 300, 20);
		add(perguntaFrequente2);
		this.ajuda2Label = new JLabel("Buscando a secretaria de sua unidade escolar.");
		ajuda2Label.setBounds(120, 200, 600, 20);
		add(ajuda2Label);
		
		this.voltarButton = new JButton("voltar");
		voltarButton.setBounds(20, 20, 80, 20);
		add(voltarButton);
		this.configuracoesButton = new JButton("Configura��es");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		
		saidaButton.addActionListener(new ControleEvento());
		voltarButton.addActionListener(new ControleEvento());
	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	private class ControleEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == saidaButton) {
				setVisible(false);
			}
			if(e.getSource()==voltarButton) {
				ViewProfessor telaProfessor = new ViewProfessor(objSistema);
				telaProfessor.exibirTela();
			}
		}
		
	}
}
