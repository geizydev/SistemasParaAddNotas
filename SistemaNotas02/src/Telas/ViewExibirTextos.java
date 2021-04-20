package Telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Classes.SistemaGeral;

public class ViewExibirTextos extends JFrame {
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	private JButton voltarButton;
	private JButton voltar;
	private JButton avancar;
	private JButton exibirTexto;
	
	private int indiceMaterial;
	
	private JLabel exibirPanel;
	
	private SistemaGeral objSistema;
	
	public ViewExibirTextos(SistemaGeral objSistema) {
		super("Materiais");
		setLayout(null);
		this.objSistema = objSistema;
		
		this.indiceMaterial=0;
		
		this.exibirPanel = new JLabel();
		exibirPanel.setBounds(90, 100 , 600, 150);
		add(exibirPanel);
		exibirPanel.setBackground(Color.LIGHT_GRAY);
		
		this.acessoLabel = new JLabel ("Visualizar Materiais");
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
	    this.configuracoesButton = new JButton("Configurações");
	    configuracoesButton.setBounds(580, 500, 120, 20);
	    add(configuracoesButton);
	    this.saidaButton = new JButton("Sair");
	    saidaButton.setBounds(710, 500, 60, 20);
	    add(saidaButton);
	    this.voltar = new JButton("<");
	    voltar.setBounds(100, 450, 60, 20);
	    add(voltar);
	    this.avancar = new JButton(">");
	    avancar.setBounds(600, 450, 60, 20);
	    add(avancar);
	
	    voltarButton.addActionListener(new ControleEvento());
		ajudaButton.addActionListener(new ControleEvento());
		configuracoesButton.addActionListener(new ControleEvento());
		saidaButton.addActionListener(new ControleEvento());
		voltar.addActionListener(new ControleEvento());
		avancar.addActionListener(new ControleEvento());
		
		System.out.println(objSistema.getListaMateriaisTextos().size());
			
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
				ViewAluno telaMaterial = new ViewAluno(objSistema);
				telaMaterial.exibirTela();
			}
			if(e.getSource()==ajudaButton) {
				ViewAjuda telaAjuda = new ViewAjuda(objSistema);
				telaAjuda.exibirTela();
			}
			if(e.getSource()==configuracoesButton) {
				ViewConfiguracoes telaConfiguracoes = new ViewConfiguracoes();
				telaConfiguracoes.exibirTela();
			}
			if(e.getSource()==saidaButton) {
				setVisible(false);
			}
			if(e.getSource()==voltar) {
				if (indiceMaterial > 0) {
					indiceMaterial = indiceMaterial -1;
					
				}
			}
			if(e.getSource()==avancar) {
				if (e.getSource() == avancar) {

					if (indiceMaterial < objSistema.getListaMateriaisTextos().size()-1) {
						indiceMaterial = indiceMaterial + 1;
						
					}
				}
			}
		
			
		}
}
}
