package telas;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Usuario;
import repositorios.RepositorioUsuario;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaDescarte extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RepositorioUsuario ru = new RepositorioUsuario();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDescarte frame = new TelaDescarte(null);
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
	public TelaDescarte(Usuario user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Parab\u00E9ns por ajudar a");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 137, 284, 14);
		contentPane.add(lblNewLabel);
		
		ru.pontuacao(user.getEmail());
		user.setPontos(user.getPontos()+1);
		
		ImageIcon telaLC = new ImageIcon("src/imagens/background.png");
		
		ImageIcon botaoVoltar = new ImageIcon("src/imagens/botao voltar.png");
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaParceiros tp = new TelaParceiros(user);
				tp.setVisible(true);
				tp.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 26, 23);
		contentPane.add(btnNewButton);
		botaoVoltar.setImage(botaoVoltar.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), 1));
		btnNewButton.setIcon(botaoVoltar);
		
		JLabel lblMudarOMundo = new JLabel("mudar o mundo!");
		lblMudarOMundo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMudarOMundo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMudarOMundo.setBounds(10, 153, 284, 14);
		contentPane.add(lblMudarOMundo);
		
		JLabel lblEsperamosTeVer = new JLabel("Esperamos te ver mais");
		lblEsperamosTeVer.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsperamosTeVer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEsperamosTeVer.setBounds(10, 170, 284, 14);
		contentPane.add(lblEsperamosTeVer);
		
		JLabel lblVezes = new JLabel("vezes!");
		lblVezes.setHorizontalAlignment(SwingConstants.CENTER);
		lblVezes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVezes.setBounds(10, 183, 284, 14);
		contentPane.add(lblVezes);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 304, 441);
		contentPane.add(fundo);
		telaLC.setImage(telaLC.getImage().getScaledInstance(fundo.getWidth(), fundo.getHeight(), 1));
		fundo.setIcon(telaLC);
	}

}
