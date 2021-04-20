package Telas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Classes.Aluno;
import Classes.SistemaGeral;

public class ViewAluno extends JFrame{
	
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton textosButton;
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	private JButton materialButton;
		
	private JButton voltarButton;

	private SistemaGeral objSistema;
	
	public ViewAluno(SistemaGeral objSistema) {
		super("Acesso Discente");
		
		setLayout(null);
		this.objSistema = objSistema;
		
		this.acessoLabel = new JLabel ("Acesso Discente");
		acessoLabel.setBounds(500,20,100,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		
		this.textosButton = new JButton("Links");
		textosButton.setBounds(400, 280, 160, 40);
		add(textosButton);
		this.ajudaButton = new JButton ("Ajuda");
		ajudaButton.setBounds(500, 500, 70, 20);
		add(ajudaButton);
		this.configuracoesButton = new JButton("Configura��es");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		this.materialButton = new JButton ("Imagens");
		materialButton.setBounds(200, 280, 160, 40);
		add(materialButton);
//		this.voltarButton = new JButton("Voltar");
//		voltarButton.setBounds(20, 20, 80, 20);
//		add(voltarButton);
		
		saidaButton.addActionListener(new ControleEvento());
		textosButton.addActionListener(new ControleEvento());
		ajudaButton.addActionListener(new ControleEvento());
		materialButton.addActionListener(new ControleEvento());
	//	voltarButton.addActionListener(new ControleEvento());		
	}
	
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	
	private class ControleEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==saidaButton) {
				setVisible(false);
			}
			if(e.getSource()==textosButton) {
				ViewExibirTextos telaTextos = new ViewExibirTextos(objSistema);
				telaTextos.exibirTela();
			}
			if(e.getSource()==ajudaButton) {
				ViewAjudaAluno telaAjuda = new ViewAjudaAluno(objSistema);
				telaAjuda.exibirTela();
			}
			if(e.getSource()==materialButton) {
				ViewExibirMaterial telaMaterial = new ViewExibirMaterial(objSistema);
				telaMaterial.exibirTela();	
			}

	
		
	}
}
}