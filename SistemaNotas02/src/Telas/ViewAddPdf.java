package Telas;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Classes.SistemaGeral;
public class ViewAddPdf extends JFrame{
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	private JButton voltarButton;
	private JButton inserirButton;
	
	private SistemaGeral objSistema;
	
	private JPanel exPainel;
	
	public ViewAddPdf(SistemaGeral objSistema) {
		super("Inserir PDF");
		setLayout(null);
		this.objSistema = objSistema;
		
		this.exPainel = new JPanel();
		exPainel.setBounds(100, 100, 600, 350);
		add(exPainel);
		
		exPainel.setBackground(Color.white);
		this.acessoLabel = new JLabel ("Inserir PDF");
		acessoLabel.setBounds(350,20,120,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.voltarButton = new JButton("Voltar");
		voltarButton.setBounds(20, 20, 80, 20);
		add(voltarButton);
		this.ajudaButton = new JButton ("Ajuda");
		ajudaButton.setBounds(500, 500, 70, 20);
		add(ajudaButton);
		this.configuracoesButton = new JButton("Configura��es");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		this.inserirButton = new JButton ("Inserir PDF");
		inserirButton.setBounds(340, 260, 130, 40);
		add(inserirButton);
		inserirButton.setBackground(Color.lightGray);
	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
}
