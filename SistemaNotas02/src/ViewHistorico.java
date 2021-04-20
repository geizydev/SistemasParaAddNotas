

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class ViewHistorico extends JFrame{
	
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton imprimirButton;
	private JButton saidaButton;
	private JButton ajudaButton;
	private JButton configuracoesButton;
	
	private JPanel painelNotas;
	
	private JTable tabelaDados;
	private JScrollPane barraRolagem;
	
	private SistemaGeral objSistema;
		
	public ViewHistorico(SistemaGeral objSistema) {
		super("Histórico");
		
		setLayout(null);
		this.objSistema = objSistema;

		this.acessoLabel = new JLabel("Histórico Escolar");
		acessoLabel.setBounds(350,20,100,20);
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
		this.configuracoesButton = new JButton("Configurações");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
		this.imprimirButton = new JButton("Imprimir Histórico");
		imprimirButton.setBounds(20, 475, 140, 40);
		add(imprimirButton);
		
		this.painelNotas = new JPanel();
		painelNotas.setBounds(20, 50, 780, 400);
		getContentPane().add(painelNotas);
	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	
}
