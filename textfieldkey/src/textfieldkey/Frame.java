
package textfieldkey;

/**
 *
 * @author Miguel
 */
public class Frame extends javax.swing.JFrame {

   
    public Frame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        variable = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variableActionPerformed(evt);
            }
        });
        variable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                variableKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(variable, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(variable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void variableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variableActionPerformed
       
    }//GEN-LAST:event_variableActionPerformed

    private void variableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_variableKeyTyped
 String variable =String.valueOf(evt.getKeyChar());
 if(!(variable.matches("[a-zA-Z0-9_@]"))){
     evt.consume();
     getToolkit().beep();
 }
    }//GEN-LAST:event_variableKeyTyped

  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField variable;
    // End of variables declaration//GEN-END:variables
}
