package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Classes.SistemaGeral;
import Serializacao.LoginSalvarDados;

public class ViewAddTexto extends JFrame{
	private JTextArea insercaoTexto;
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	private JButton voltarButton;
	private JButton inserirButton;
	private String texto;
	private JButton enviar;
	private ControleEvento evento;
	private SistemaGeral objSistema;
	private JLabel exPainel;
	
	public ViewAddTexto(SistemaGeral objSistema) {
		
		super("Inserir Texto");
		setLayout(null);
		this.objSistema = objSistema;

		this.enviar = new JButton("Enviar");
		enviar.setBounds(350, 410, 100, 40);
		add(enviar);
		enviar.setBackground(Color.LIGHT_GRAY);
		this.texto = texto;
		this.exPainel = new JLabel();
		exPainel.setBounds(90, 100 , 600, 150);
		add(exPainel);
		exPainel.setBackground(Color.LIGHT_GRAY);
		
		this.acessoLabel = new JLabel ("Inserir Link");
		acessoLabel.setBounds(350,20,120,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.insercaoTexto = new JTextArea();
		insercaoTexto.setBounds(90, 300, 600, 100);
		add(insercaoTexto);
		insercaoTexto.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 14));
        insercaoTexto.setLineWrap(true);
        insercaoTexto.setWrapStyleWord(true);
        
      //  this.barra = new JScrollPane(insercaoTexto);
		
		
		this.voltarButton = new JButton("Voltar");
		voltarButton.setBounds(20, 20, 80, 20);
		add(voltarButton);
		this.ajudaButton = new JButton ("Ajuda");
		ajudaButton.setBounds(500, 500, 70, 20);
		add(ajudaButton);
		this.configuracoesButton = new JButton("Configurações");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		
		this.inserirButton = new JButton ("Inserir Link");
		inserirButton.setBounds(340, 260, 130, 40);
		add(inserirButton);
		inserirButton.setBackground(Color.lightGray);
		
		this.evento = new ControleEvento();
		this.inserirButton.addActionListener(evento);
		
		voltarButton.addActionListener(new ControleEvento());
		ajudaButton.addActionListener(new ControleEvento());
		configuracoesButton.addActionListener(new ControleEvento());
		saidaButton.addActionListener(new ControleEvento());
		enviar.addActionListener(new ControleEvento());;
		
	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	private class ControleEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
			if(evento.getSource() == voltarButton) {
				ViewInserirMaterial telaMaterial = new ViewInserirMaterial(objSistema);
				telaMaterial.exibirTela();
			}
			if(evento.getSource() == ajudaButton) {
				ViewAjuda telaAjuda = new ViewAjuda(objSistema);
				telaAjuda.exibirTela();
			}
			if(evento.getSource() == configuracoesButton) {
				ViewConfiguracoes telaConfiguracoes = new ViewConfiguracoes();
				telaConfiguracoes.exibirTela();
			}
			if(evento.getSource() == saidaButton) {
				setVisible(false);
			}
			if(evento.getSource() == inserirButton) {
				texto = texto;
				objSistema.setListaMateriaisTextos(texto);
				
				LoginSalvarDados objSalvarDados = new LoginSalvarDados();
				objSalvarDados.abrirArquivos();
				objSalvarDados.salvarDados(objSistema);
				objSalvarDados.fecharArquivos();
			}
			if(evento.getSource() == enviar) {
				String material = insercaoTexto.getText();
				objSistema.setListaMateriaisTextos(material);
				JOptionPane.showMessageDialog(null, "Material enviado com sucesso!");
			}
		}
}
}
