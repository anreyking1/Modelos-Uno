package ejecutable;

import javax.swing.ImageIcon;

public class MostrarPartes extends javax.swing.JFrame {

    private final int datos;

    public MostrarPartes(int entrada) {
        datos = entrada;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        Cuerpo = new javax.swing.JLabel();
        ArmaAtaque = new javax.swing.JLabel();
        ArmaDefensa = new javax.swing.JLabel();
        regreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MostrarPartes"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        Cuerpo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Cuerpo.setMaximumSize(new java.awt.Dimension(300, 300));
        Cuerpo.setMinimumSize(new java.awt.Dimension(300, 300));
        Cuerpo.setName("imagenCuerpo"); // NOI18N
        Cuerpo.setPreferredSize(new java.awt.Dimension(300, 300));

        ArmaAtaque.setMaximumSize(new java.awt.Dimension(300, 300));
        ArmaAtaque.setMinimumSize(new java.awt.Dimension(300, 300));
        ArmaAtaque.setName("imagenArmasAtaque"); // NOI18N
        ArmaAtaque.setPreferredSize(new java.awt.Dimension(300, 300));

        ArmaDefensa.setMaximumSize(new java.awt.Dimension(300, 300));
        ArmaDefensa.setMinimumSize(new java.awt.Dimension(300, 300));
        ArmaDefensa.setName("imagenArmasDefensa"); // NOI18N
        ArmaDefensa.setPreferredSize(new java.awt.Dimension(300, 300));

        regreso.setText("REGRESAR");
        regreso.setName("regreso"); // NOI18N
        regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ArmaDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(regreso)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ArmaAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArmaDefensa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22)
                .addComponent(ArmaAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regreso)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresoActionPerformed
        Opciones opcion = new Opciones();
        opcion.setVisible(true);
        this.hide();
    }//GEN-LAST:event_regresoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        Personaje personaje = new Personaje(datos);
        personaje.llamarPersonaje();
        
        Cuerpo.setIcon(new ImageIcon(getClass().getResource(personaje.urlCuerpo())));
        ArmaAtaque.setIcon(new ImageIcon(getClass().getResource(personaje.urlArmaAtaque())));
        ArmaDefensa.setIcon(new ImageIcon(getClass().getResource(personaje.urlArmaDefensa())));
        
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArmaAtaque;
    private javax.swing.JLabel ArmaDefensa;
    private javax.swing.JLabel Cuerpo;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton regreso;
    // End of variables declaration//GEN-END:variables
}
