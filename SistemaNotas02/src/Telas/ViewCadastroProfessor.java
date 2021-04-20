package Telas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Serializacao.LoginSalvarDados;
import Classes.SistemaGeral;

public class ViewCadastroProfessor extends JFrame{
	
	private JLabel acessoLabel;
	private JLabel nomeProfessor;
	private JLabel cpfProfessor;
	private JLabel senhaAcessoProfessor;
	private JLabel bimestreProfessor;
	private JLabel disciplinasProfessor;
	
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField bimestreField;
	private JTextField senhaField;
	private JTextField disciplinaField;
	
	//private JPasswordField senha;
	
	private JButton cadastroButton;
	private JButton limparButton;
	private JButton voltarButton;
	
	private SistemaGeral objSistema;
	
	public ViewCadastroProfessor(SistemaGeral objSistema) {
		super("Cadastro Docente");
		setLayout(null);
		
		this.objSistema = objSistema;
		//this.senha = new JPasswordField();
		//this.senha.setBounds(250, 160, 300, 20);
		//add(senha);
		
		this.acessoLabel = new JLabel("Cadastro Docente");
		acessoLabel.setBounds(350,20,200,20);
		add(acessoLabel);
		this.nomeProfessor = new JLabel("Nome: ");
		nomeProfessor.setBounds(200, 100, 100, 40);
		add(nomeProfessor);
		this.cpfProfessor = new JLabel("CPF: ");
		cpfProfessor.setBounds(200, 150, 100, 40);
		add(cpfProfessor);
		this.bimestreProfessor = new JLabel ("Bimestre: ");
		bimestreProfessor.setBounds(200, 200, 100, 40);
		add(bimestreProfessor);
		this.senhaAcessoProfessor = new JLabel ("Senha: ");
		senhaAcessoProfessor.setBounds(200, 250, 100, 40);
		add(senhaAcessoProfessor);
		this.disciplinasProfessor = new JLabel("Disciplina Lecionada: ");
		disciplinasProfessor.setBounds(200, 300, 140, 40);
		add(disciplinasProfessor);
		
		this.nomeField = new JTextField(null);
		nomeField.setBounds(250, 110, 300, 20);
		add(nomeField);
		this.cpfField = new JTextField(null);
		cpfField.setBounds(250, 160, 300, 20);
		add(cpfField);
		this.bimestreField = new JTextField(null);
		bimestreField.setBounds(270, 210, 280, 20);
		add(bimestreField);
		this.senhaField = new JTextField(null);
		senhaField.setBounds(250, 260, 300, 20);
		add(senhaField);
		this.disciplinaField = new JTextField(null);
		disciplinaField.setBounds(330, 310, 220, 20);
		add(disciplinaField);
		
		this.voltarButton = new JButton("Voltar");
		voltarButton.setBounds(20, 20, 80, 20);
		add(voltarButton);
		this.cadastroButton = new JButton ("Cadastrar");
		cadastroButton.setBounds(210, 380, 100, 40);
		add(cadastroButton);
		this.limparButton = new JButton ("Limpar");
		limparButton.setBounds(440, 380, 100, 40);
		add(limparButton);
		
		voltarButton.addActionListener(new ControleEvento());
		cadastroButton.addActionListener(new ControleEvento());
	}
	
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	private class ControleEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		//	List<SistemaGeral> obSistemaGerals = new ArrayList<SistemaGeral>();
			
			if(e.getSource() == voltarButton) {
				ViewAdministrador telaAdm = new ViewAdministrador(objSistema);
				telaAdm.exibirTela();
			}
			if(e.getSource() == cadastroButton) {
				String inforNome = nomeField.getText();
				String inforCpf = cpfField.getText();
				String inforSenha = senhaField.getText();
				String inforDisc = disciplinaField.getText();
				//verificando se existe valor nos campos;
				System.out.println(inforNome);
				System.out.println(inforCpf);
				System.out.println(inforSenha);
				
				if(nomeField.getText().length()>0 && cpfField.getText().length()>0 && senhaField.getText().length()>0 && disciplinaField.getText().length()>0 ) {
					
					JOptionPane.showMessageDialog(null, "Professor Cadastrado com Sucesso!");
				
					
					objSistema.setListaProfessor(inforNome, inforCpf, inforSenha, inforDisc);
					
					LoginSalvarDados obSalvarDados = new LoginSalvarDados();
					obSalvarDados.abrirArquivos();
					obSalvarDados.salvarDados(objSistema);
					obSalvarDados.fecharArquivos();
					ViewCadastroProfessor telaCadastro = new ViewCadastroProfessor(objSistema);
					telaCadastro.exibirTela();
				
				}	else {
					JOptionPane.showMessageDialog(null, "Impossivel cadastrar, existe(m) campo(s) nulo(s).");

				}			 			
				
			}
			if(e.getSource()==limparButton) {
				nomeField.setText("");
				cpfField.setText("");
				senhaField.setText("");
				disciplinaField.setText("");
			}
				
			}
		}
}
