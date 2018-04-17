
package ejecutable;

public class Opciones extends javax.swing.JFrame {

    public Opciones() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eleccion = new javax.swing.JLabel();
        btnHumano = new javax.swing.JButton();
        btnElfo = new javax.swing.JButton();
        btnMago = new javax.swing.JButton();
        btnTrol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setName("Opciones"); // NOI18N
        setResizable(false);

        eleccion.setText("¡elije el personaje para mostrar sus componentes!");
        eleccion.setName("lblIndicacion"); // NOI18N

        btnHumano.setText("HUMANO");
        btnHumano.setMaximumSize(null);
        btnHumano.setMinimumSize(null);
        btnHumano.setName("btnHumano"); // NOI18N
        btnHumano.setPreferredSize(null);
        btnHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHumanoActionPerformed(evt);
            }
        });

        btnElfo.setText("ELFO");
        btnElfo.setMaximumSize(null);
        btnElfo.setMinimumSize(null);
        btnElfo.setName("btnElfo"); // NOI18N
        btnElfo.setPreferredSize(null);
        btnElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElfoActionPerformed(evt);
            }
        });

        btnMago.setText("MAGO");
        btnMago.setMaximumSize(null);
        btnMago.setMinimumSize(null);
        btnMago.setName("btnMago"); // NOI18N
        btnMago.setPreferredSize(null);
        btnMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagoActionPerformed(evt);
            }
        });

        btnTrol.setText("TROL");
        btnTrol.setMaximumSize(null);
        btnTrol.setMinimumSize(null);
        btnTrol.setName("btnTrol"); // NOI18N
        btnTrol.setPreferredSize(null);
        btnTrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHumano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnMago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eleccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHumano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHumanoActionPerformed
        pasarInformacion(1);
    }//GEN-LAST:event_btnHumanoActionPerformed

    private void btnElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElfoActionPerformed
        pasarInformacion(2);      
    }//GEN-LAST:event_btnElfoActionPerformed

    private void btnMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagoActionPerformed
        pasarInformacion(3);
    }//GEN-LAST:event_btnMagoActionPerformed

    private void btnTrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrolActionPerformed
        pasarInformacion(4);       
    }//GEN-LAST:event_btnTrolActionPerformed

    private void pasarInformacion (int personaje) {
        MostrarPartes partes = new MostrarPartes(personaje);
        partes.setVisible(true);
        this.hide();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElfo;
    private javax.swing.JButton btnHumano;
    private javax.swing.JButton btnMago;
    private javax.swing.JButton btnTrol;
    private javax.swing.JLabel eleccion;
    // End of variables declaration//GEN-END:variables
}
