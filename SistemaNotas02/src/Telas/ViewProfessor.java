package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Classes.Professor;
import Classes.SistemaGeral;

public class ViewProfessor extends JFrame{
	
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton materialButton;
	private JButton disciplinasButton;
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	
	private JButton listarInfor;
	
	private SistemaGeral objSistema;

	
	public ViewProfessor(SistemaGeral objSistema) {
		super("Tela Principal");
		
		setLayout(null);
		this.objSistema = objSistema;
		
		this.acessoLabel = new JLabel("Acesso Docente");
		acessoLabel.setBounds(350,20,100,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.materialButton = new JButton("Inserir Material");
		materialButton.setBounds(100, 280, 160, 40);
		add(materialButton);
		this.disciplinasButton = new JButton("Disciplinas");
		disciplinasButton.setBounds(300, 280, 160, 40);
		add(disciplinasButton);
		this.ajudaButton = new JButton ("Ajuda");
		ajudaButton.setBounds(500, 500, 70, 20);
		add(ajudaButton);
		this.configuracoesButton = new JButton("Configura��es");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		this.listarInfor = new JButton("Informações");
		listarInfor.setBounds(500, 280, 160, 40);
		add(listarInfor);
		
		saidaButton.addActionListener(new ControleEvento());
		ajudaButton.addActionListener(new ControleEvento());
		disciplinasButton.addActionListener(new ControleEvento());
		materialButton.addActionListener(new ControleEvento());
		listarInfor.addActionListener(new ControleEvento());
		
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
			if(e.getSource() == ajudaButton) {
				ViewAjuda telaAjuda = new ViewAjuda(objSistema);
				telaAjuda.exibirTela();
			}
			if(e.getSource()== disciplinasButton) {
				ViewDisciplinasLecionadas telaDisciplinas = new ViewDisciplinasLecionadas();
				telaDisciplinas.exibirTela();
			}
			if(e.getSource() == materialButton) {
				ViewInserirMaterial telaMaterial = new ViewInserirMaterial(objSistema);
				telaMaterial.exibirTela();
			}
			if(e.getSource() == listarInfor) {
				ViewInforProfessor telaInfor = new ViewInforProfessor(objSistema);
				telaInfor.exibirTela();
				 List<Professor> exibir;

				exibir = objSistema.getListaProfessor();
				for (int i = 0; i < exibir.size(); i++) {
					Professor p = exibir.get(i);
					System.out.println(p.getNome());
					System.out.println(p.getCpf());
					System.out.println(p.getSenha());
				}
				
			}
		}
	}
}
