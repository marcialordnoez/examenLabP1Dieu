/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcial;

/**
 *
 * @author René Rendón
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        atacar1 = new javax.swing.JButton();
        atacar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        curarse1 = new javax.swing.JButton();
        curarse2 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        GolpeMortal1 = new javax.swing.JButton();
        GolpeMortal2 = new javax.swing.JButton();
        golpecito = new javax.swing.JButton();
        golpecito2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jProgressBar1.setValue(100);

        jProgressBar2.setValue(100);

        atacar1.setText("Atacar");
        atacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atacar1ActionPerformed(evt);
            }
        });

        atacar2.setText("Atacar");
        atacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atacar2ActionPerformed(evt);
            }
        });

        curarse1.setText("curarse");
        curarse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curarse1ActionPerformed(evt);
            }
        });

        curarse2.setText("curarse");
        curarse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curarse2ActionPerformed(evt);
            }
        });

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        GolpeMortal1.setText("GolpeMortal");
        GolpeMortal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GolpeMortal1ActionPerformed(evt);
            }
        });

        GolpeMortal2.setText("GolpeMortal");
        GolpeMortal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GolpeMortal2ActionPerformed(evt);
            }
        });

        golpecito.setText("golpecito");
        golpecito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golpecitoActionPerformed(evt);
            }
        });

        golpecito2.setText("golpecito");
        golpecito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golpecito2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JETSTEREO\\Pictures\\005.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JETSTEREO\\Pictures\\003.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(curarse1)
                                    .addComponent(atacar1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reset)
                                .addGap(124, 124, 124)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(curarse2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(atacar2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(golpecito)
                                    .addComponent(GolpeMortal1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GolpeMortal2)
                                    .addComponent(golpecito2))
                                .addGap(35, 35, 35))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atacar1)
                            .addComponent(atacar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(curarse1)
                            .addComponent(curarse2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reset)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GolpeMortal1)
                    .addComponent(GolpeMortal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golpecito)
                    .addComponent(golpecito2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int turnos = 0;
        int hola = 0;
        int bye = 0;
    public void atacar1(){
        if(turnos == 0){
            
        int vida = jProgressBar2.getValue();
        vida -= 5;
        jProgressBar2.setValue(vida);
        if(jProgressBar2.getValue() == 0){
            jLabel2.setText("jugador 2 Gana");
        }
        
        turnos = 1;
        
        }
    }
    private void atacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atacar1ActionPerformed
        // TODO add your handling code here:
        atacar1();
    }//GEN-LAST:event_atacar1ActionPerformed
   public void atacar2(){
        if(turnos == 1){
            
        int vida = jProgressBar1.getValue();
        vida -= 5;
        jProgressBar1.setValue(vida);
        if(jProgressBar1.getValue() == 0){
            jLabel2.setText("jugador 2 Gana");
        }
        
        turnos = 0;
        
        }
    }
    private void atacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atacar2ActionPerformed
        // TODO add your handling code here:
        atacar2();
    }//GEN-LAST:event_atacar2ActionPerformed
 public void curarse1(){
        if(turnos == 0){
            
        int vida = jProgressBar1.getValue();
        vida += 5;
        jProgressBar1.setValue(vida);
        
        turnos = 1;
        
        }
    }
    private void curarse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curarse1ActionPerformed
        // TODO add your handling code here:
        curarse1();
    }//GEN-LAST:event_curarse1ActionPerformed
 public void curarse2(){
        if(turnos == 1){
            
        int vida = jProgressBar2.getValue();
        vida += 5;
        jProgressBar2.setValue(vida);
        
        turnos = 0;
        
        }
    }
    private void curarse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curarse2ActionPerformed
        // TODO add your handling code here:
        curarse2();
    }//GEN-LAST:event_curarse2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetActionPerformed
     public void Mortal1(){
        if(turnos == 0 && hola == 0){
        
        int vida = jProgressBar2.getValue();
        vida -= 50;
        jProgressBar2.setValue(vida);
        if(jProgressBar2.getValue() == 0){
            jLabel2.setText("jugador 2 Gana");
        }
        
        turnos = 1;
        hola = 1;
        
        }
    }
    private void GolpeMortal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GolpeMortal1ActionPerformed
        // TODO add your handling code here:
        Mortal1();
    }//GEN-LAST:event_GolpeMortal1ActionPerformed
    public void Mortal2(){
       if(turnos == 1 && bye == 0){
        
        int vida = jProgressBar1.getValue();
        vida -= 50;
        jProgressBar1.setValue(vida);
        if(jProgressBar1.getValue() == 0){
            jLabel2.setText("jugador 2 Gana");
        }
        
        turnos = 0;
        bye = 1;
        
        }
    }
    private void GolpeMortal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GolpeMortal2ActionPerformed
        // TODO add your handling code here:
        Mortal2();
    }//GEN-LAST:event_GolpeMortal2ActionPerformed
    public void golpecito(){
        if(turnos == 0){
            
        int vida = jProgressBar2.getValue();
        vida -= 2;
        jProgressBar2.setValue(vida);
        if(jProgressBar2.getValue() == 0){
            jLabel2.setText("jugador 2 Gana");
        }
        
        turnos = 1;
        
        }
    }
    private void golpecitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golpecitoActionPerformed
        // TODO add your handling code here:
        golpecito();
    }//GEN-LAST:event_golpecitoActionPerformed
public void golpecito2(){
        if(turnos == 1){
            
        int vida = jProgressBar1.getValue();
        vida -= 2;
        jProgressBar1.setValue(vida);
        if(jProgressBar1.getValue() == 0){
            jLabel2.setText("jugador 2 Gana");
        }
        
        turnos = 0;
        
        }
    }
    private void golpecito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golpecito2ActionPerformed
        // TODO add your handling code here:
        golpecito2();
    }//GEN-LAST:event_golpecito2ActionPerformed
    public void reset(){
        jProgressBar1.setValue(100);
        jProgressBar2.setValue(100);
        turnos = 0 ;
        bye = 0;
        hola = 0 ;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GolpeMortal1;
    private javax.swing.JButton GolpeMortal2;
    private javax.swing.JButton atacar1;
    private javax.swing.JButton atacar2;
    private javax.swing.JButton curarse1;
    private javax.swing.JButton curarse2;
    private javax.swing.JButton golpecito;
    private javax.swing.JButton golpecito2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
