package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JDesktopPane desktop = new JDesktopPane();
		frame.getContentPane().add(desktop, BorderLayout.CENTER);
		
		JMenuBar barraMenu = new JMenuBar();
		frame.setJMenuBar(barraMenu);
		
		JMenu MenuCadastro = new JMenu("Cadastros");
		barraMenu.add(MenuCadastro);
		
		JMenuItem menuAluno = new JMenuItem("Aluno");
		menuAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCRUDAluno tela = new TelaCRUDAluno();
				tela.setVisible(true);
				desktop.add(tela);
				
			}
		});
		MenuCadastro.add(menuAluno);
		
		JMenu menuConsulta = new JMenu("Consultas");
		barraMenu.add(menuConsulta);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		barraMenu.add(menuAjuda);
	}
}
