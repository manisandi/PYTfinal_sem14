/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ventanas;

/**
 *
 * @author yendri
 */
public class MDImenuprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Menuprincipal
     */
    public MDImenuprincipal() {
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

        jMenu1 = new javax.swing.JMenu();
        PANELinicio = new javax.swing.JDesktopPane();
        jpcontrolador = new javax.swing.JPanel();
        btnplatos = new javax.swing.JButton();
        btnmesas = new javax.swing.JButton();
        btnpedidos = new javax.swing.JButton();
        btnconfiguracion = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        btnusuarios = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        jpventanas = new javax.swing.JTabbedPane();
        jpinicio = new javax.swing.JTabbedPane();
        jpmesas = new javax.swing.JPanel();
        jpregistro = new javax.swing.JPanel();
        jpnosotros = new javax.swing.JPanel();
        jpdatos = new javax.swing.JPanel();
        jpdatos1 = new javax.swing.JPanel();
        lblnombreempresa = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblredes = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lblmensaje = new javax.swing.JLabel();
        lblmensaje1 = new javax.swing.JLabel();
        lblmensaje2 = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        lblnombre2 = new javax.swing.JLabel();
        lbldireccio1 = new javax.swing.JLabel();
        lbldireccion2 = new javax.swing.JLabel();
        lblfb = new javax.swing.JLabel();
        lblinstagram = new javax.swing.JLabel();
        lbldatos = new javax.swing.JLabel();
        jpdatos2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jpsalir = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnplatos.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        btnplatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/servicio.png"))); // NOI18N
        btnplatos.setText("Platos");
        btnplatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplatosActionPerformed(evt);
            }
        });

        btnmesas.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        btnmesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comedor.png"))); // NOI18N
        btnmesas.setText("Mesas");
        btnmesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmesasActionPerformed(evt);
            }
        });

        btnpedidos.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        btnpedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pedido-en-linea.png"))); // NOI18N
        btnpedidos.setText("Pedidos");
        btnpedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpedidosActionPerformed(evt);
            }
        });

        btnconfiguracion.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        btnconfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/engranaje.png"))); // NOI18N
        btnconfiguracion.setText("Configuracion");

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/descarga (1).png"))); // NOI18N
        lbllogo.setText("LOGO");

        btnusuarios.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        btnusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/empleados.png"))); // NOI18N
        btnusuarios.setText("Usuarios");

        javax.swing.GroupLayout jpcontroladorLayout = new javax.swing.GroupLayout(jpcontrolador);
        jpcontrolador.setLayout(jpcontroladorLayout);
        jpcontroladorLayout.setHorizontalGroup(
            jpcontroladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcontroladorLayout.createSequentialGroup()
                .addGroup(jpcontroladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpcontroladorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnconfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpcontroladorLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jpcontroladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnusuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(btnpedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmesas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnplatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbllogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpcontroladorLayout.setVerticalGroup(
            jpcontroladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcontroladorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnplatos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmesas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnconfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        PANELinicio.add(jpcontrolador);
        jpcontrolador.setBounds(0, 0, 250, 700);

        lblnombre.setBackground(new java.awt.Color(0, 204, 204));
        lblnombre.setFont(new java.awt.Font("Goudy Old Style", 0, 48)); // NOI18N
        lblnombre.setText("La Tortilleria CR");
        PANELinicio.add(lblnombre);
        lblnombre.setBounds(540, 10, 440, 50);

        jpventanas.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N

        jpinicio.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        jpventanas.addTab("Pagina Principal", jpinicio);

        javax.swing.GroupLayout jpmesasLayout = new javax.swing.GroupLayout(jpmesas);
        jpmesas.setLayout(jpmesasLayout);
        jpmesasLayout.setHorizontalGroup(
            jpmesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jpmesasLayout.setVerticalGroup(
            jpmesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );

        jpventanas.addTab("Mesas del Salon", jpmesas);

        javax.swing.GroupLayout jpregistroLayout = new javax.swing.GroupLayout(jpregistro);
        jpregistro.setLayout(jpregistroLayout);
        jpregistroLayout.setHorizontalGroup(
            jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jpregistroLayout.setVerticalGroup(
            jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );

        jpventanas.addTab("Registro de Pedidos", jpregistro);

        lblnombreempresa.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lblnombreempresa.setText("Nombre de Nuestra Empresa:");

        lbltelefono.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lbltelefono.setText("Telefono:");

        lblredes.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lblredes.setText("Redes Sociales:");

        lbldireccion.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lbldireccion.setText("Direccion:");

        lblmensaje.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lblmensaje.setText("Mensaje a Nuestros Clientes:");

        lblmensaje1.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        lblmensaje1.setText("\"La calidad en un producto, o servicio no es lo ");

        lblmensaje2.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        lblmensaje2.setText("que tu le pones.....sino lo que el cliente obtiene\"");

        lblnumero.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        lblnumero.setText("2230-3768");

        lblnombre2.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        lblnombre2.setText("La Tortilleria CR");

        lbldireccio1.setFont(new java.awt.Font("Goudy Old Style", 0, 20)); // NOI18N
        lbldireccio1.setText("WWPJ+6FW 1447-1002, C. 23 1447-1002, ");

        lbldireccion2.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        lbldireccion2.setText("Aranjuez, San José, 10101");

        lblfb.setFont(new java.awt.Font("Goudy Old Style", 0, 20)); // NOI18N
        lblfb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/facebook.png"))); // NOI18N
        lblfb.setText("Facebook");

        lblinstagram.setFont(new java.awt.Font("Goudy Old Style", 0, 20)); // NOI18N
        lblinstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/instagram.png"))); // NOI18N
        lblinstagram.setText("Instagram");

        javax.swing.GroupLayout jpdatos1Layout = new javax.swing.GroupLayout(jpdatos1);
        jpdatos1.setLayout(jpdatos1Layout);
        jpdatos1Layout.setHorizontalGroup(
            jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdatos1Layout.createSequentialGroup()
                .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpdatos1Layout.createSequentialGroup()
                        .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpdatos1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(lblmensaje))
                            .addGroup(jpdatos1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(lblmensaje2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpdatos1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpdatos1Layout.createSequentialGroup()
                                .addComponent(lblmensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpdatos1Layout.createSequentialGroup()
                                .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbldireccio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbldireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblnombre2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblnombreempresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lbldireccion2))
                                .addGap(28, 28, 28)
                                .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblredes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbltelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jpdatos1Layout.createSequentialGroup()
                                        .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblnumero)
                                            .addComponent(lblfb)
                                            .addComponent(lblinstagram))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jpdatos1Layout.setVerticalGroup(
            jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdatos1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreempresa)
                    .addComponent(lbltelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnumero)
                    .addComponent(lblnombre2))
                .addGap(27, 27, 27)
                .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblredes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccio1)
                    .addComponent(lblfb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpdatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccion2)
                    .addComponent(lblinstagram))
                .addGap(54, 54, 54)
                .addComponent(lblmensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblmensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmensaje2)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        lbldatos.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        lbldatos.setText("DATOS DE LA EMPRESA");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/SEO-otimizacao-de-sites-300x252.jpg"))); // NOI18N

        javax.swing.GroupLayout jpdatos2Layout = new javax.swing.GroupLayout(jpdatos2);
        jpdatos2.setLayout(jpdatos2Layout);
        jpdatos2Layout.setHorizontalGroup(
            jpdatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE)
        );
        jpdatos2Layout.setVerticalGroup(
            jpdatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdatos2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpdatosLayout = new javax.swing.GroupLayout(jpdatos);
        jpdatos.setLayout(jpdatosLayout);
        jpdatosLayout.setHorizontalGroup(
            jpdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpdatosLayout.createSequentialGroup()
                        .addComponent(jpdatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jpdatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpdatosLayout.createSequentialGroup()
                        .addComponent(lbldatos, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
        );
        jpdatosLayout.setVerticalGroup(
            jpdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbldatos)
                .addGroup(jpdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpdatosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jpdatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpdatosLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jpdatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnosotrosLayout = new javax.swing.GroupLayout(jpnosotros);
        jpnosotros.setLayout(jpnosotrosLayout);
        jpnosotrosLayout.setHorizontalGroup(
            jpnosotrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnosotrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpdatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnosotrosLayout.setVerticalGroup(
            jpnosotrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnosotrosLayout.createSequentialGroup()
                .addComponent(jpdatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpventanas.addTab("Sobre Nosotros", jpnosotros);
        jpventanas.addTab("Salir ", jpsalir);

        PANELinicio.add(jpventanas);
        jpventanas.setBounds(260, 90, 900, 600);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        PANELinicio.add(jPanel5);
        jPanel5.setBounds(260, 120, 890, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PANELinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PANELinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmesasActionPerformed

    private void btnplatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplatosActionPerformed

    private void btnpedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpedidosActionPerformed

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
            java.util.logging.Logger.getLogger(MDImenuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDImenuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDImenuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDImenuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDImenuprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PANELinicio;
    private javax.swing.JButton btnconfiguracion;
    private javax.swing.JButton btnmesas;
    private javax.swing.JButton btnpedidos;
    private javax.swing.JButton btnplatos;
    private javax.swing.JButton btnusuarios;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jpcontrolador;
    private javax.swing.JPanel jpdatos;
    private javax.swing.JPanel jpdatos1;
    private javax.swing.JPanel jpdatos2;
    private javax.swing.JTabbedPane jpinicio;
    private javax.swing.JPanel jpmesas;
    private javax.swing.JPanel jpnosotros;
    private javax.swing.JPanel jpregistro;
    private javax.swing.JTabbedPane jpsalir;
    private javax.swing.JTabbedPane jpventanas;
    private javax.swing.JLabel lbldatos;
    private javax.swing.JLabel lbldireccio1;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldireccion2;
    private javax.swing.JLabel lblfb;
    private javax.swing.JLabel lblinstagram;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmensaje1;
    private javax.swing.JLabel lblmensaje2;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombreempresa;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblredes;
    private javax.swing.JLabel lbltelefono;
    // End of variables declaration//GEN-END:variables

}
