/*
 * PasswordChange.java
 *
 * Created on __DATE__, __TIME__
 */

package gui;

import entity.User;

import java.sql.SQLException;

import bll.UserBLL;

/**
 *
 * @author  __USER__
 */
public class PasswordChange extends javax.swing.JFrame {

	/** Creates new form PasswordChange */
	public PasswordChange() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("\u53e3\u4ee4\u7ef4\u62a4");

		jLabel2.setText("\u767b\u9646\u540d");

		jLabel3.setText("\u65e7\u5bc6\u7801");

		jLabel4.setText("\u65b0\u5bc6\u7801");

		jButton1.setText("\u786e\u8ba4");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u8fd4\u56de");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel5.setText("\u786e\u8ba4\u5bc6\u7801");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout.createSequentialGroup()
										.addGap(85, 85, 85)
										.addComponent(jLabel1)
										.addContainerGap(117, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				149,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				149,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(22,
																				22,
																				22)
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				40,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2)
																		.addGap(26,
																				26,
																				26)))
										.addGap(48, 48, 48))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																190,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				137,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				149,
																				Short.MAX_VALUE)))
										.addGap(48, 48, 48)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addGap(22, 22, 22)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(12, 12, 12)
										.addComponent(jLabel6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addContainerGap(14, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addGap(54, 54, 54)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(13, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new MainMenu().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (evt.getSource() == jButton1) {
			String name = jTextField1.getText();
			String pwd = jTextField2.getText();
			String pwd1 = jTextField3.getText();
			String pwd2 = jTextField4.getText();
			User c = new User(1,name, pwd);
			int id=c.getId();
			try {
				if (UserBLL.check(c)) {
					if (pwd1.equals(pwd2)){
						User u = new User(id,name,pwd1);
						UserBLL.update(u);
						jLabel6.setText("口令修改成功");
					} else
						jLabel6.setText("两次密码不一致，请重新输入！");
				} else
					jLabel6.setText("用户名或密码错误，请重新输入！");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PasswordChange().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}