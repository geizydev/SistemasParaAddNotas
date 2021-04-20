package Telas;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ViewConfiguracoes extends JFrame {
private JLabel acessoLabel;
	
	private JButton voltarButton;
	private JButton sairButton;
	private JButton ajudaButton;
	
	public ViewConfiguracoes() {
		
		super ("Configurações");
		setLayout(null);
		
		this.acessoLabel = new JLabel("Configurações");
		acessoLabel.setBounds(350,20,100,20);
		add(acessoLabel);
		
		this.sairButton = new JButton ("Sair");
		
		this.voltarButton = new JButton ("Voltar");
		
		//this.
	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
}
