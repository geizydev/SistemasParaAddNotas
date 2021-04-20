import java.awt.event.ActionListener; // adiciona eventos ao buttons e ações
import java.awt.event.ActionEvent; // adiciona eventos;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class TelaLogin extends JFrame implements Serializable {

	private JLabel cpfJLabel;
	private JLabel senhaJLabel;

	private JTextField cpfJTextField;
	private JTextField senhaJTextField;

	private JButton entrarJButton;
	private JButton limpar;

	private SistemaGeral objSistema;

	public TelaLogin(SistemaGeral objSistema) {
		super("SEJA BEM VINDO(A)");
		setLayout(null);
		
		this.objSistema = objSistema;

		this.cpfJLabel = new JLabel("LOGIN");
		this.cpfJLabel.setBounds(200, 100, 100, 40);
		add(cpfJLabel);

		this.cpfJTextField = new JTextField();
		this.cpfJTextField.setBounds(250, 110, 300, 20);
		add(cpfJTextField);

		this.senhaJLabel = new JLabel("SENHA ");
		this.senhaJLabel.setBounds(200, 150, 100, 40);
		add(senhaJLabel);

		this.senhaJTextField = new JTextField();
		this.senhaJTextField.setBounds(250, 160, 300, 20);
		add(senhaJTextField);

		this.entrarJButton = new JButton("Entrar");
		entrarJButton.setBounds(210, 360, 100, 40);
		add(this.entrarJButton);

		this.limpar = new JButton("Limpar");
		limpar.setBounds(440, 360, 100, 40);
		add(this.limpar);
		
		ControleEvent controle = new ControleEvent();
		entrarJButton.addActionListener(controle);
//		limpar.addActionListener(controle);

	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
	}

	private class ControleEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// e é variavel e Soucer é a posição
			if (e.getSource() == entrarJButton) {
				String inforCPF = cpfJTextField.getText();
				String inforModelo = senhaJTextField.getText();
			}
			if (e.getSource() == limpar) {
				cpfJTextField.setText("");
				senhaJTextField.setText("");
			}

			if (e.getSource() == entrarJButton) {

				if (cpfJTextField.getText().length() > 0 && senhaJTextField.getText().length() > 0) {

					for (int i = 0; i < objSistema.getListaProfessor().size(); i++) {
						if (cpfJTextField.getText().equals(objSistema.getListaProfessor().get(i).getNome())
								&& senhaJTextField.getText().equals(objSistema.getListaProfessor().get(i).getSenha())) {
							
							ViewProfessor obProfessor = new ViewProfessor(objSistema);
							obProfessor.exibirTela();

						}else {
							JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
						}
					}
//					String informacaoCpf = cpfJTextField.getText();
//					String informacaoSenha = senhaJTextField.getText();
//					criar o objeto login, quando o back, estiver pronto

				}
			}

			if (e.getSource() == limpar) {
				cpfJTextField.setText("");
				senhaJTextField.setText("");

			}

		}
	}// fim do metodo
}// fim da classe ControleEvent
