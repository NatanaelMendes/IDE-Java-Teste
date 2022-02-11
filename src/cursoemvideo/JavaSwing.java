package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaSwing extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwing frame = new JavaSwing();
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
	public JavaSwing() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblMsg = new JLabel("Aparecer a Mensagem");
		lblMsg.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		JButton btnClick = new JButton("Aperte Aqui");
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText("Olá, Mundo!");
			}
		});

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(144).addComponent(btnClick))
								.addGroup(groupLayout.createSequentialGroup().addGap(50).addComponent(lblMsg)))
						.addContainerGap(85, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup().addContainerGap(80, Short.MAX_VALUE).addComponent(lblMsg).addGap(70)
						.addComponent(btnClick).addGap(43)));
		getContentPane().setLayout(groupLayout);

	}

}
