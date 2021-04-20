
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewProfessor extends JFrame{
	
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JButton materialButton;
	private JButton notasButton;
	private JButton disciplinasButton;
	private JButton ajudaButton;
	private JButton configuracoesButton;
	private JButton saidaButton;
	
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
		materialButton.setBounds(50, 300, 160, 40);
		add(materialButton);
		this.notasButton = new JButton("Inserir Notas");
		notasButton.setBounds(310, 300, 160, 40);
		add(notasButton);
		this.disciplinasButton = new JButton("Disciplinas");
		disciplinasButton.setBounds(570, 300, 160, 40);
		add(disciplinasButton);
		this.ajudaButton = new JButton ("Ajuda");
		ajudaButton.setBounds(500, 500, 70, 20);
		add(ajudaButton);
		this.configuracoesButton = new JButton("Configurações");
		configuracoesButton.setBounds(580, 500, 120, 20);
		add(configuracoesButton);
		this.saidaButton = new JButton("Sair");
		saidaButton.setBounds(710, 500, 60, 20);
		add(saidaButton);
	}
	
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
}
