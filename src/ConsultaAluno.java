
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naahs
 */
public class ConsultaAluno extends javax.swing.JFrame {
private static Disponivel livro = new Disponivel(); 
    /**
     * Creates new form ConsultaAluno
     */
    public ConsultaAluno() {
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

        jLabel9 = new javax.swing.JLabel();
        consultaNome = new javax.swing.JTextField();
        consultaVolume = new javax.swing.JTextField();
        consultaDisciplina = new javax.swing.JTextField();
        consultaId = new javax.swing.JTextField();
        consultaEdi = new javax.swing.JTextField();
        consultaPlati = new javax.swing.JTextField();
        consultaCorredor = new javax.swing.JTextField();
        consultaQuanti = new javax.swing.JTextField();
        jBconsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("ID LIVRO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        consultaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaNomeActionPerformed(evt);
            }
        });
        getContentPane().add(consultaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 80, 20));
        getContentPane().add(consultaVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, -1));
        getContentPane().add(consultaDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));
        getContentPane().add(consultaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 200, -1));
        getContentPane().add(consultaEdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 200, -1));
        getContentPane().add(consultaPlati, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 200, -1));
        getContentPane().add(consultaCorredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, -1));
        getContentPane().add(consultaQuanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, -1));

        jBconsultar.setText("CONSULTAR");
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jBconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 20));

        jLabel2.setText("Nome do Livro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel3.setText("Quantidade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel4.setText("Editora:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel5.setText("Volume:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel6.setText("Disciplina:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel7.setText("corredor : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 488, 10));

        jLabel8.setText("Platileira: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaNomeActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed

        livro = Professor.bdlivro.consLivro(consultaNome.getText());

        if(livro!=null){

            consultaNome.setText(livro.getNomeLivro());
            consultaVolume.setText(Integer.toString(livro.getVolume()));
            consultaId.setText(Integer.toString(livro.getIdLivro()));
            consultaQuanti.setText(Integer.toString(livro.getQuantidade()));
            consultaCorredor.setText(Integer.toString(livro.getCorredor()));
            consultaDisciplina.setText(livro.getDisciplina());
            consultaEdi.setText(livro.getEditora());
            consultaPlati.setText(livro.getPlateleira());
        } else {
            JOptionPane.showMessageDialog(null, "não existe esse registro");
            consultaNome.setText("");
            consultaVolume.setText("");
            consultaId.setText("");
            consultaQuanti.setText("");
            consultaCorredor.setText("");
            consultaDisciplina.setText("");
            consultaEdi.setText("");
            consultaPlati.setText("");
        }

    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        dispose();
        Principall.getPrincioal().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField consultaCorredor;
    private javax.swing.JTextField consultaDisciplina;
    private javax.swing.JTextField consultaEdi;
    private javax.swing.JTextField consultaId;
    private javax.swing.JTextField consultaNome;
    private javax.swing.JTextField consultaPlati;
    private javax.swing.JTextField consultaQuanti;
    private javax.swing.JTextField consultaVolume;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
