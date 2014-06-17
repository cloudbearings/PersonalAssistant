/*
 * MainMenu.java
 *
 * Created on __DATE__, __TIME__
 */

package com.nutcake.pa.gui;

/**
 *
 * @author  __USER__
 */
public class MainMenu extends javax.swing.JFrame {

	/** Creates new form MainMenu */
	public MainMenu() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();
		jMenu5 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("ºÚÌå", 0, 24));
		jLabel1.setText("\u4e2a\u4eba\u4fe1\u606f\u52a9\u7406\u5de5\u5177");

		jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));
		jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenuBar1.setPreferredSize(new java.awt.Dimension(321, 50));

		jMenu1.setBackground(new java.awt.Color(255, 255, 255));
		jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu1.setText("\u53e3\u4ee4\u7ef4\u62a4");
		jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenu1MouseClicked(evt);
			}
		});
		
		jMenuBar1.add(jMenu1);

		jMenu2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu2.setText("\u65e5\u5e38\u8bb0\u4e8b");
		jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenu2MouseClicked(evt);
			}
		});
		jMenuBar1.add(jMenu2);

		jMenu3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu3.setText("\u901a\u8baf\u7c3f");
		jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenu3MouseClicked(evt);
			}
		});
		jMenuBar1.add(jMenu3);

		jMenu4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu4.setText("\u4e2a\u4eba\u65e5\u5e38\u6536\u652f");
		jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenu4MouseClicked(evt);
			}
		});
		jMenuBar1.add(jMenu4);

		jMenu5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jMenu5.setText("\u9000\u51fa\u7cfb\u7edf");
		jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenu5MouseClicked(evt);
			}
		});
		jMenuBar1.add(jMenu5);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addContainerGap(67, Short.MAX_VALUE)
						.addComponent(jLabel1).addGap(62, 62, 62)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(93, 93, 93)
						.addComponent(jLabel1)
						.addContainerGap(128, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		System.exit(0);
	}

	private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new Money().setVisible(true);
	}

	private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new AddrBook().setVisible(true);
	}

	private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new Note().setVisible(true);
	}

	private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new PasswordChange().setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainMenu().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenuBar jMenuBar1;
	// End of variables declaration//GEN-END:variables

}