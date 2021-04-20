package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Serializacao.LoginSalvarDados;
import Classes.SistemaGeral;

public class ViewCadastroAluno extends JFrame {

	private JLabel acessoLabel;
	private JLabel nomeAluno;
	private JLabel cpfAluno;
	private JLabel serieAluno;
	private JLabel senhaAcessoaluno;
	
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField serieField;
	private JTextField senhaField;

	private JComboBox<String> disciplinas;

	private JButton cadastroButton;
	private JButton limparButton;
	private JButton voltarButton;

	private SistemaGeral objSistema;

	public ViewCadastroAluno(SistemaGeral objSistema) {

		super("Cadastro de Aluno");
		setLayout(null);
		this.objSistema = objSistema;
		
		

		this.acessoLabel = new JLabel("Cadastro de Aluno");
		acessoLabel.setBounds(350, 20, 200, 20);
		add(acessoLabel);
		this.nomeAluno = new JLabel("Nome: ");
		nomeAluno.setBounds(200, 100, 100, 40);
		add(nomeAluno);
		this.cpfAluno = new JLabel("CPF: ");
		cpfAluno.setBounds(200, 150, 100, 40);
		add(cpfAluno);
		this.serieAluno = new JLabel("S�rie: ");
		serieAluno.setBounds(200, 200, 100, 40);
		add(serieAluno);
		this.senhaAcessoaluno = new JLabel("Senha: ");
		senhaAcessoaluno.setBounds(200, 250, 100, 40);
		add(senhaAcessoaluno);

		this.disciplinas = new JComboBox<String>();

		for (int i = 0; i < objSistema.getListaDisciplina().size(); i++) {
			this.disciplinas.addItem(objSistema.getListaDisciplina().get(i).getNomeDisciplina());
		}
		add(this.disciplinas);

		this.nomeField = new JTextField();
		nomeField.setBounds(250, 110, 300, 20);
		add(nomeField);
		this.cpfField = new JTextField();
		cpfField.setBounds(250, 160, 300, 20);
		add(cpfField);
		this.serieField = new JTextField();
		serieField.setBounds(250, 210, 300, 20);
		add(serieField);
		this.senhaField = new JTextField();
		senhaField.setBounds(250, 260, 300, 20);
		add(senhaField);

		this.voltarButton = new JButton("Voltar");
		voltarButton.setBounds(20, 20, 80, 20);
		add(voltarButton);
		this.cadastroButton = new JButton("Cadastrar");
		cadastroButton.setBounds(210, 360, 100, 40);
		add(cadastroButton);
		this.limparButton = new JButton("Limpar");
		limparButton.setBounds(440, 360, 100, 40);
		add(limparButton);

		this.objSistema = objSistema;

		voltarButton.addActionListener(new ControleEvento());
		cadastroButton.addActionListener(new ControleEvento());

	}

	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
	}

	private class ControleEvento implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == voltarButton) {
				ViewAdministrador telaAdm = new ViewAdministrador(objSistema);
				telaAdm.exibirTela();
			}
			if (e.getSource() == cadastroButton) {
				String inforNomeAluno = nomeField.getText();
				String inforCpfAluno = cpfField.getText();
				String inforSenhaAluno = senhaField.getText();
				String inforSerie = serieField.getText();
				
				if(nomeField.getText().length()>0 && cpfField.getText().length()>0 && senhaField.getText().length()>0 && serieField.getText().length()>0 ) {
					JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");

					objSistema.setListaAlunos(inforNomeAluno, inforCpfAluno, inforSenhaAluno, inforSerie); 
				
				LoginSalvarDados objSalvarDados = new LoginSalvarDados();
				objSalvarDados.abrirArquivos();
				objSalvarDados.salvarDados(objSistema);
				objSalvarDados.fecharArquivos();
				ViewCadastroAluno telaCadastro = new ViewCadastroAluno(objSistema);
				telaCadastro.exibirTela();
			}
				else {
					JOptionPane.showMessageDialog(null, "Impossivel cadastrar, existe(m) campo(s) nulo(s).");
					
				}
				if(e.getSource()==limparButton) {
					nomeField.setText("");
					cpfField.setText("");
					senhaField.setText("");
					serieField.setText("");
				}
	}
		}
	}
}
