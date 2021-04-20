package Telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import Classes.Material;
import Classes.SistemaGeral;
import Serializacao.LoginSalvarDados;


public class ViewAddImagem extends JFrame{
	
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	private JButton voltarButton;
	private JButton inserirButton;
	private ImageIcon imagem;
	private SistemaGeral objSistema;
	private JLabel exPainel;
	private controleDeEventos evento;
	private JButton enviar;
	
	public ViewAddImagem(SistemaGeral objSistema) {
		
		super("Inserir Imagem");
		setLayout(null);
		this.objSistema = objSistema;
		
		this.enviar = new JButton("Enviar");
		enviar.setBounds(350, 410, 100, 40);
		add(enviar);
		this.imagem = imagem;
		this.exPainel = new JLabel();
		exPainel.setBounds(100, 100, 600, 350);
		add(exPainel);
		
		exPainel.setBackground(Color.white);
		
		this.acessoLabel = new JLabel ("Inserir Imagem");
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
		
		this.inserirButton = new JButton ("Inserir");
		inserirButton.setBounds(570, 440, 130, 40);
		add(inserirButton);
		inserirButton.setBackground(Color.lightGray);
		
		this.evento = new controleDeEventos();
		this.inserirButton.addActionListener(evento);
		
		
		this.objSistema = new SistemaGeral();
		voltarButton.addActionListener(new controleDeEventos());
		ajudaButton.addActionListener(new controleDeEventos());
		configuracoesButton.addActionListener(new controleDeEventos());
		saidaButton.addActionListener(new controleDeEventos());
		enviar.addActionListener(new controleDeEventos());;

		
	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	
	private class controleDeEventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
				if(evento.getSource()==voltarButton) {
					ViewInserirMaterial telaInserir = new ViewInserirMaterial(objSistema);
					telaInserir.exibirTela();
				}
				if(evento.getSource() == saidaButton) {
					setVisible(false);
				}
				if(evento.getSource()==configuracoesButton) {
					ViewConfiguracoes telaConf = new ViewConfiguracoes();
					telaConf.exibirTela();
				}
				if(evento.getSource()==ajudaButton) {
					ViewAjuda telaAjuda = new ViewAjuda(objSistema);
					telaAjuda.exibirTela();
				}
				if(evento.getSource() == inserirButton) {
					JFileChooser caixaDeProcuraDeArquivo = new JFileChooser();
					caixaDeProcuraDeArquivo.setDialogTitle("Selecione Uma Imagem");
					caixaDeProcuraDeArquivo.setFileFilter(new FileNameExtensionFilter("png, jpg, gif, jpeg", "png", "jpg", "gif", "jpeg"));
					caixaDeProcuraDeArquivo.setAcceptAllFileFilterUsed(false);
					caixaDeProcuraDeArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

					int retornoDeSelecao = caixaDeProcuraDeArquivo.showOpenDialog(new ViewAddImagem(objSistema));
					if (retornoDeSelecao == JFileChooser.APPROVE_OPTION) {
					File file;
					file = caixaDeProcuraDeArquivo.getSelectedFile();
					ImageIcon imagemPNG = new ImageIcon(file.getPath());
					imagemPNG.setImage(imagemPNG.getImage().getScaledInstance(500, 300, 1));
					exPainel.setIcon(imagemPNG);
					imagem = imagemPNG;
					objSistema.setListaMateriais(imagemPNG);
					
					LoginSalvarDados objSalvarDados = new LoginSalvarDados();
					objSalvarDados.abrirArquivos();
					objSalvarDados.salvarDados(objSistema);
					objSalvarDados.fecharArquivos();
					}
				if(evento.getSource() == enviar) {						
					//ImageIcon imagensSalvas = exPainel.getText();
					objSistema.setListaMateriais(imagem);
					System.out.println(objSistema.getListaMateriais().size());
					JOptionPane.showMessageDialog(null, "Material enviado com sucesso!");
				}
			}
		}
			
		}
	
}