
package projetojava;

public class CalculadoraTela extends javax.swing.JFrame {
    
    double numero1;
    double numero2;
    double calculo;
    private String string;
   
    public CalculadoraTela() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        botão1 = new javax.swing.JButton();
        botão2 = new javax.swing.JButton();
        botão3 = new javax.swing.JButton();
        botão4 = new javax.swing.JButton();
        botão5 = new javax.swing.JButton();
        botão6 = new javax.swing.JButton();
        botão7 = new javax.swing.JButton();
        botão8 = new javax.swing.JButton();
        botão9 = new javax.swing.JButton();
        divisão = new javax.swing.JButton();
        multiplicação = new javax.swing.JButton();
        somar = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        botão0 = new javax.swing.JButton();
        virgula = new javax.swing.JButton();
        botãoC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botão1.setText("1");
        botão1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão1ActionPerformed(evt);
            }
        });

        botão2.setText("2");
        botão2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão2ActionPerformed(evt);
            }
        });

        botão3.setText("3");
        botão3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão3ActionPerformed(evt);
            }
        });

        botão4.setText("4");
        botão4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão4ActionPerformed(evt);
            }
        });

        botão5.setText("5");
        botão5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão5ActionPerformed(evt);
            }
        });

        botão6.setText("6");
        botão6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão6ActionPerformed(evt);
            }
        });

        botão7.setText("7");
        botão7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão7ActionPerformed(evt);
            }
        });

        botão8.setText("8");
        botão8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão8ActionPerformed(evt);
            }
        });

        botão9.setText("9");
        botão9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão9ActionPerformed(evt);
            }
        });

        divisão.setText("÷");
        divisão.setToolTipText("");
        divisão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisãoActionPerformed(evt);
            }
        });

        multiplicação.setText("x");
        multiplicação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicaçãoActionPerformed(evt);
            }
        });

        somar.setText("+");
        somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarActionPerformed(evt);
            }
        });

        subtrair.setText("-");
        subtrair.setToolTipText("");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });

        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        botão0.setText("0");
        botão0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão0ActionPerformed(evt);
            }
        });

        virgula.setText(",");
        virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgulaActionPerformed(evt);
            }
        });

        botãoC.setText("C");
        botãoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botãoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botão1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botão4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botão7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botão2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botão5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(botão8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botão0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botão9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botão3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botão6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiplicação, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(somar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(subtrair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(divisão, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                    .addComponent(jTextField1))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botão0, botão2, botão5, botão8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botão3, botão6, botão9, resultado});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {divisão, multiplicação});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botão1, botão4, botão7, virgula});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botão1)
                    .addComponent(botão2)
                    .addComponent(botão3)
                    .addComponent(divisão, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botão4)
                    .addComponent(botão5)
                    .addComponent(botão6)
                    .addComponent(multiplicação, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botão7)
                    .addComponent(botão8)
                    .addComponent(botão9)
                    .addComponent(somar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(virgula)
                        .addComponent(botão0)
                        .addComponent(resultado))
                    .addComponent(subtrair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botãoC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botão1, botão4, botão7, virgula});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botão0, botão2, botão5, botão8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botão3, botão6, botão9, resultado});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {divisão, multiplicação, somar, subtrair});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void virgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgulaActionPerformed
        jTextField1.setText(",");
    }//GEN-LAST:event_virgulaActionPerformed

    private void botão0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão0ActionPerformed
       jTextField1.setText("0");
    }//GEN-LAST:event_botão0ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        jTextField1.setText("=");
    }//GEN-LAST:event_resultadoActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
      jTextField1.setText("-");
    }//GEN-LAST:event_subtrairActionPerformed

    private void somarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarActionPerformed
        jTextField1.setText("+");
    }//GEN-LAST:event_somarActionPerformed

    private void multiplicaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicaçãoActionPerformed
       jTextField1.setText("x");
    }//GEN-LAST:event_multiplicaçãoActionPerformed

    private void divisãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisãoActionPerformed
        jTextField1.setText("÷");
    }//GEN-LAST:event_divisãoActionPerformed

    private void botão6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão6ActionPerformed
        jTextField1.setText("6");
    }//GEN-LAST:event_botão6ActionPerformed

    private void botão5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão5ActionPerformed
        jTextField1.setText("5");
    }//GEN-LAST:event_botão5ActionPerformed

    private void botão4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão4ActionPerformed
        jTextField1.setText("4");
    }//GEN-LAST:event_botão4ActionPerformed

    private void botão1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão1ActionPerformed
      jTextField1.setText("1");   
    }//GEN-LAST:event_botão1ActionPerformed

    private void botão9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão9ActionPerformed
        jTextField1.setText("9");
    }//GEN-LAST:event_botão9ActionPerformed

    private void botão2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão2ActionPerformed
        jTextField1.setText("2");
    }//GEN-LAST:event_botão2ActionPerformed

    private void botão3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão3ActionPerformed
        jTextField1.setText("3");
    }//GEN-LAST:event_botão3ActionPerformed

    private void botão7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão7ActionPerformed
        jTextField1.setText("7");
    }//GEN-LAST:event_botão7ActionPerformed

    private void botão8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão8ActionPerformed
         jTextField1.setText("8");
    }//GEN-LAST:event_botão8ActionPerformed

    private void botãoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoCActionPerformed
       jTextField1.setText("");
    }//GEN-LAST:event_botãoCActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botão0;
    private javax.swing.JButton botão1;
    private javax.swing.JButton botão2;
    private javax.swing.JButton botão3;
    private javax.swing.JButton botão4;
    private javax.swing.JButton botão5;
    private javax.swing.JButton botão6;
    private javax.swing.JButton botão7;
    private javax.swing.JButton botão8;
    private javax.swing.JButton botão9;
    private javax.swing.JButton botãoC;
    private javax.swing.JButton divisão;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton multiplicação;
    private javax.swing.JButton resultado;
    private javax.swing.JButton somar;
    private javax.swing.JButton subtrair;
    private javax.swing.JButton virgula;
    // End of variables declaration//GEN-END:variables
}
