package Telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Classes.Professor;
import Classes.SistemaGeral;

public class ViewInforProfessor extends JFrame{
	
	private JLabel exibirInfor;
	private JButton saidaButton;
	

	

	private SistemaGeral objSistema;
	
	public ViewInforProfessor(SistemaGeral objSistema) {
		this.objSistema = objSistema;
		
		this.exibirInfor = new JLabel();
		exibirInfor.setBounds(90, 100 , 600, 150);
		add(exibirInfor);
		exibirInfor.setBackground(Color.LIGHT_GRAY);
		

	}
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		
	}
	private class ControleEvento implements ActionListener{
		private List<Professor> teste;
		@Override
		public void actionPerformed(ActionEvent e) {
		
			
			
			
			
		}
	}
}


