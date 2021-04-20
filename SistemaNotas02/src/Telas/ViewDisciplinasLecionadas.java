package Telas;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewDisciplinasLecionadas extends JFrame{
	private JLabel acessoLabel;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	
	private JPanel exibirPanel;
	
	public ViewDisciplinasLecionadas() {
		
		super("Disciplinas Lecionadas");
		setLayout(null);
		
		this.acessoLabel = new JLabel ("Disciplinas Lecionadas");
		acessoLabel.setBounds(320,20,140,20);
		add(acessoLabel);
		this.nomeLabel = new JLabel ("Nome: ");
		nomeLabel.setBounds(600, 20, 50, 20);
		add(nomeLabel);
		this.cpfLabel = new JLabel ("CPF: ");
		cpfLabel.setBounds(600, 40, 50, 20);
		add(cpfLabel);
		
		this.exibirPanel = new JPanel();
		exibirPanel.setBounds(20, 100, 740, 420);
		add(exibirPanel);
		exibirPanel.setBackground(Color.white);
	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
}
