/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;
import sistemaPetShop.*;


/**
 *
 * @author andre
 */
public class MenuAdmin extends javax.swing.JFrame {
    
    private TelaLogin telalogin;
    private Loja loja;
    private Administrador adm;

    /**
     * Creates new form Menu
     */
    public MenuAdmin() {
        initComponents();
    }
    
    public MenuAdmin(TelaLogin telalogin1,Loja loja, Administrador adm){
        this();
        this.telalogin = telalogin1;
        this.adm = adm;
        this.loja = loja;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ir_visu_fun = new javax.swing.JButton();
        ir_financas = new javax.swing.JButton();
        ir_comprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ir_visu_clien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ir_gerar_rela = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ir_cadas_func = new javax.swing.JButton();
        ir_cadast_clien = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ir_vender_serv = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ir_vender_prod = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        ir_visu_fun.setText("Ir");
        ir_visu_fun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_visu_funActionPerformed(evt);
            }
        });

        ir_financas.setText("Ir");
        ir_financas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_financasActionPerformed(evt);
            }
        });

        ir_comprar.setText("Ir");
        ir_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_comprarActionPerformed(evt);
            }
        });

        jLabel1.setText("Visualizar funcionarios cadastrados");

        jLabel2.setText("Visualizar clientes cadastrados");

        ir_visu_clien.setText("Ir");
        ir_visu_clien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_visu_clienActionPerformed(evt);
            }
        });

        jLabel3.setText("Finanças");

        jLabel5.setText("Comprar produtos");

        jLabel6.setText("Gerar Relatorios");

        ir_gerar_rela.setText("Ir");
        ir_gerar_rela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_gerar_relaActionPerformed(evt);
            }
        });

        jLabel7.setText("Cadastrar Funcionario");

        jLabel8.setText("Cadastrar Cliente");

        ir_cadas_func.setText("Ir");
        ir_cadas_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_cadas_funcActionPerformed(evt);
            }
        });

        ir_cadast_clien.setText("Ir");
        ir_cadast_clien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_cadast_clienActionPerformed(evt);
            }
        });

        jLabel9.setText("Vender serviço");

        ir_vender_serv.setText("Ir");
        ir_vender_serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_vender_servActionPerformed(evt);
            }
        });

        jLabel10.setText("Vender produto");

        ir_vender_prod.setText("Ir");
        ir_vender_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_vender_prodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ir_cadas_func)
                            .addComponent(ir_cadast_clien)
                            .addComponent(ir_visu_clien)
                            .addComponent(ir_visu_fun)
                            .addComponent(ir_financas)
                            .addComponent(ir_comprar)
                            .addComponent(ir_vender_serv)
                            .addComponent(ir_vender_prod)
                            .addComponent(ir_gerar_rela))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ir_cadast_clien))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ir_cadas_func))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ir_visu_clien))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ir_visu_fun)))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ir_financas)
                    .addComponent(jLabel3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ir_comprar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ir_vender_serv))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ir_vender_prod))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ir_gerar_rela))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // AÇOES QUANDO FECHAR A TELA
         this.telalogin.setEnabled(true);
         this.telalogin.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void ir_vender_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_vender_prodActionPerformed
        // TODO add your handling code here:
        new VenderProduto(this, loja).setVisible(true);
    }//GEN-LAST:event_ir_vender_prodActionPerformed

    private void ir_vender_servActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_vender_servActionPerformed
        // TODO add your handling code here:
        new VenderServico(this, loja).setVisible(true);
    }//GEN-LAST:event_ir_vender_servActionPerformed

    private void ir_cadast_clienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_cadast_clienActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        this.setVisible(false);
        new CadastrarCliente(this, loja, adm).setVisible(true);
    }//GEN-LAST:event_ir_cadast_clienActionPerformed

    private void ir_cadas_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_cadas_funcActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        this.setVisible(false);
        new CadastrarFuncionario(this, loja, this.adm).setVisible(true);
    }//GEN-LAST:event_ir_cadas_funcActionPerformed

    private void ir_visu_clienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_visu_clienActionPerformed
        // TODO add your handling code here:
        new VisualizarClientes(this, loja).setVisible(true);
    }//GEN-LAST:event_ir_visu_clienActionPerformed

    private void ir_visu_funActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_visu_funActionPerformed
        // TODO add your handling code here:
        new VisualizarFuncionarios(this, loja).setVisible(true);
    }//GEN-LAST:event_ir_visu_funActionPerformed

    private void ir_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_comprarActionPerformed
        // TODO add your handling code here:
        new ComprarProdutos(this, loja).setVisible(true);
    }//GEN-LAST:event_ir_comprarActionPerformed

    private void ir_financasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_financasActionPerformed
        // TODO add your handling code here:
        new Financas(this, loja).setVisible(true);
    }//GEN-LAST:event_ir_financasActionPerformed

    private void ir_gerar_relaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_gerar_relaActionPerformed
        // TODO add your handling code here:
        new GerarRelatorios(this, loja).setVisible(true);
    }//GEN-LAST:event_ir_gerar_relaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ir_cadas_func;
    private javax.swing.JButton ir_cadast_clien;
    private javax.swing.JButton ir_comprar;
    private javax.swing.JButton ir_financas;
    private javax.swing.JButton ir_gerar_rela;
    private javax.swing.JButton ir_vender_prod;
    private javax.swing.JButton ir_vender_serv;
    private javax.swing.JButton ir_visu_clien;
    private javax.swing.JButton ir_visu_fun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
