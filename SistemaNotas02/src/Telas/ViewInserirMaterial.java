package Telas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Classes.SistemaGeral;

public class ViewInserirMaterial extends JFrame{
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton imagemButton;
	private JButton pdfButton;
	private JButton textoButton;
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	private JButton voltarButton;
	private SistemaGeral objSistema;
	
	public ViewInserirMaterial(SistemaGeral objSistema) {
		
		super("Inserir Materiais");
		setLayout(null);
		
		this.objSistema = objSistema;
		
		this.acessoLabel = new JLabel ("Inserir Materiais");
		acessoLabel.setBounds(350,20,120,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.ajudaButton = new JButton ("Ajuda");
		ajudaButton.setBounds(500, 500, 70, 20);
		add(ajudaButton);
		this.configuracoesButton = new JButton("Configura��es");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		this.imagemButton = new JButton("Adicionar Imagem");
		imagemButton.setBounds(80, 300, 160, 40);
		add(imagemButton);
		this.pdfButton = new JButton("Adicionar PDF");
		pdfButton.setBounds(310, 300, 160, 40);
		add(pdfButton);
		this.textoButton = new JButton("Adicionar Texto");
		textoButton.setBounds(540, 300, 160, 40);
		add(textoButton);
		this.voltarButton = new JButton("Voltar");
		voltarButton.setBounds(20, 20, 80, 20);
		add(voltarButton);
		
		voltarButton.addActionListener(new ControleEvento());
		saidaButton.addActionListener(new ControleEvento());
		ajudaButton.addActionListener(new ControleEvento());
		imagemButton.addActionListener(new ControleEvento());
		textoButton.addActionListener(new ControleEvento());
		pdfButton.addActionListener(new ControleEvento());
		
	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	private class ControleEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==voltarButton) {
				ViewProfessor telaProf = new ViewProfessor(objSistema);
				telaProf.exibirTela();
			}
			if(e.getSource()==saidaButton) {
				setVisible(false);
			}
			if(e.getSource()==ajudaButton) {
				ViewAjudaAluno telaAjuda = new ViewAjudaAluno(objSistema);
				telaAjuda.exibirTela();
			}
			if(e.getSource()==imagemButton) {
				ViewAddImagem telaAddImagem = new ViewAddImagem(objSistema);
				telaAddImagem.exibirTela();
			}
			if(e.getSource()==pdfButton) {
				ViewAddPdf telaAddPdf = new ViewAddPdf(objSistema);
				telaAddPdf.exibirTela();
			}
			if(e.getSource()==textoButton) {
				ViewAddTexto telaAddTexto = new ViewAddTexto(objSistema);
				telaAddTexto.exibirTela();
			}
			
		}
}
}
