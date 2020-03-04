package br.com.meubuscadordecep.view;

import br.com.meubuscadordecep.dominio.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDeCep;
import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nomeDaAplicacao = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        labelCEP = new javax.swing.JLabel();
        botao = new javax.swing.JButton();
        labelLogradouro = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        labelLocalidade = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resultadoLogradouro = new javax.swing.JLabel();
        respostaBairro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        respostaLocalidade = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();
        imputCEP = new javax.swing.JFormattedTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeDaAplicacao.setText("Meu Buscador de CEP");

        separador.setBackground(new java.awt.Color(255, 255, 255));

        labelCEP.setText("Digite seu CEP");

        botao.setText("Buscar CEP");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });

        labelLogradouro.setText("Logradouro:");

        labelBairro.setText("Bairro:");

        labelLocalidade.setText("Localidade:");

        try {
            imputCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(labelCEP)
                        .addGap(4, 4, 4)
                        .addComponent(imputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respostaBairro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelLogradouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultadoLogradouro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelLocalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respostaLocalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(erro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(nomeDaAplicacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(botao)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeDaAplicacao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCEP)
                    .addComponent(imputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botao)
                .addGap(13, 13, 13)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogradouro)
                    .addComponent(resultadoLogradouro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBairro)
                    .addComponent(respostaBairro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLocalidade)
                    .addComponent(jLabel3)
                    .addComponent(respostaLocalidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(erro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed
        inicializarVariaveis();
        try {
            buscarEndereco(imputCEP.getText());
        } catch (Exception ex) {
            erro.setText(ex.getMessage());
            erro.setForeground(Color.RED);
        }
    }//GEN-LAST:event_botaoActionPerformed

    public void inicializarVariaveis(){
        erro.setText("");
        resultadoLogradouro.setText("");
        respostaBairro.setText("");
        respostaLocalidade.setText("");
    }
    
    public void buscarEndereco(String cep) throws Exception {
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
        resultadoLogradouro.setText(endereco.getLogradouro());
        respostaBairro.setText(endereco.getBairro());
        respostaLocalidade.setText(endereco.getLocalidade());
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao;
    private javax.swing.JLabel erro;
    private javax.swing.JFormattedTextField imputCEP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelLocalidade;
    private javax.swing.JLabel labelLogradouro;
    private javax.swing.JLabel nomeDaAplicacao;
    private javax.swing.JLabel respostaBairro;
    private javax.swing.JLabel respostaLocalidade;
    private javax.swing.JLabel resultadoLogradouro;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
