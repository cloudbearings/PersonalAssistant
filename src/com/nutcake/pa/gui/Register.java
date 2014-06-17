/*
 * Register.java
 *
 * Created on __DATE__, __TIME__
 */

package com.nutcake.pa.gui;

/**
 *
 * @author  __USER__
 */
public class Register extends javax.swing.JFrame {

	/** Creates new form Register */
	public Register() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

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

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("\u4e2a\u4eba\u4fe1\u606f\u7cfb\u7edf\u6ce8\u518c");

		jLabel2.setText("\u7528 \u6237 \u540d");

		jTextField1.setText("jTextField1");

		jLabel3.setText("\u5bc6   \u7801");

		jTextField2.setText("jTextField2");

		jLabel4.setText("\u786e\u8ba4\u5bc6\u7801");

		jTextField3.setText("jTextField3");

		jButton1.setText("\u786e\u8ba4");

		jButton2.setText("\u8fd4\u56de");

		jLabel5.setText("jLabel5");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(69, 69,
																		69)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel2))
																.addGap(7, 7, 7)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jTextField1,
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jTextField3,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						152,
																						Short.MAX_VALUE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(167,
																		167,
																		167)
																.addComponent(
																		jLabel1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(133,
																		133,
																		133)
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jButton2))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jLabel5,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		207,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(69, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(42, 42, 42)
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel4))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(8, 8, 8)
																.addComponent(
																		jTextField3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(16, 16, 16)
								.addComponent(jLabel5)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addContainerGap(58, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Register().setVisible(true);
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
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}