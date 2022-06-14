package telas;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaParceiros extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaParceiros frame = new TelaParceiros(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaParceiros(Usuario user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon botaoParceiro = new ImageIcon("src/imagens/botao forneiro.png");
		
		ImageIcon telaLC = new ImageIcon("src/imagens/background.png");
		
		
		JLabel lblNewLabel_1 = new JLabel("Deseja retornar embalagens de");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 160, 284, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("qual estabelecimento?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 178, 284, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAcesso ta = new TelaAcesso(user);
				ta.setVisible(true);
				ta.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(62, 200, 180, 64);
		contentPane.add(btnNewButton);
		botaoParceiro.setImage(botaoParceiro.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), 1));
		btnNewButton.setIcon(botaoParceiro);
		
		JLabel lblNewLabel = new JLabel("Ol\u00E1, " + user.getNome());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 147, 284, 14);
		contentPane.add(lblNewLabel);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 304, 441);
		contentPane.add(fundo);
		telaLC.setImage(telaLC.getImage().getScaledInstance(fundo.getWidth(), fundo.getHeight(), 1));
		fundo.setIcon(telaLC);
	}
}
