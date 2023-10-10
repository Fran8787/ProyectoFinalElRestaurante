/*
int idProducto;
    String nombre;
    String categoria;
    int cantidad;
    int Precio;
    int disponible;
 */
package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;

public class MenuDeProductos extends javax.swing.JPanel {

  
    public MenuDeProductos() {
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

        jLabelContendor = new javax.swing.JPanel();
        jPBACKfondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLPizzas = new javax.swing.JLabel();
        jLLomos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePREorder = new javax.swing.JTable();
        jLBebidas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextTOTAL = new javax.swing.JTextField();
        jLCargaPedido = new javax.swing.JLabel();
        jLSuma1 = new javax.swing.JLabel();
        jLREsta1 = new javax.swing.JLabel();
        jComboBMESAS = new javax.swing.JComboBox<>();
        jComboBoxMESEROS = new javax.swing.JComboBox<>();
        jLBorratabla = new javax.swing.JLabel();
        jLabelTIcket = new javax.swing.JLabel();
        jLabelfondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelContendor.setOpaque(false);
        add(jLabelContendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 610, 410));

        jPBACKfondo.setBackground(new java.awt.Color(204, 204, 204));
        jPBACKfondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPBACKfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/lemon_122986 (1).png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(55, 55));
        jPBACKfondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/beer_drink_icon_146801.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(55, 55));
        jPBACKfondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 70, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/burger_food_icon_146845.png"))); // NOI18N
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(55, 55));
        jPBACKfondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 50));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/32387taco_98856.png"))); // NOI18N
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(55, 55));
        jPBACKfondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, 60));

        jLPizzas.setBackground(new java.awt.Color(204, 204, 204));
        jLPizzas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLPizzas.setForeground(new java.awt.Color(51, 51, 51));
        jLPizzas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPizzas.setText("Pizzas & Tacos");
        jLPizzas.setToolTipText("");
        jLPizzas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLPizzas.setOpaque(true);
        jLPizzas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPizzasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLPizzasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLPizzasMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLPizzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 70));

        jLLomos.setBackground(new java.awt.Color(204, 204, 204));
        jLLomos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLLomos.setForeground(new java.awt.Color(51, 51, 51));
        jLLomos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLLomos.setText("Lomos & Hamburgesas");
        jLLomos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLLomos.setOpaque(true);
        jLLomos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLomosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLLomosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLLomosMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLLomos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 70));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/32382hamburger_98925.png"))); // NOI18N
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(55, 55));
        jPBACKfondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 60));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/recipepizzaicon_109877 (1).png"))); // NOI18N
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new java.awt.Dimension(55, 55));
        jPBACKfondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 60));

        jTablePREorder.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTablePREorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTablePREorder);

        jPBACKfondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 200, 180));

        jLBebidas.setBackground(new java.awt.Color(204, 204, 204));
        jLBebidas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBebidas.setForeground(new java.awt.Color(51, 51, 51));
        jLBebidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBebidas.setText("Bebidas");
        jLBebidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBebidas.setOpaque(true);
        jLBebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBebidasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBebidasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBebidasMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, 70));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total");
        jPBACKfondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 50, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pre-Orden");
        jPBACKfondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 130, 20));

        jTextTOTAL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextTOTAL.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextTOTAL.setBorder(null);
        jTextTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTOTALActionPerformed(evt);
            }
        });
        jPBACKfondo.add(jTextTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, 90, -1));

        jLCargaPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCargaPedido.setForeground(new java.awt.Color(51, 51, 51));
        jLCargaPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCargaPedido.setText("Cargar Pedido");
        jLCargaPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLCargaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCargaPedidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCargaPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCargaPedidoMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLCargaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 110, 20));

        jLSuma1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLSuma1.setForeground(new java.awt.Color(51, 51, 51));
        jLSuma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSuma1.setText("+");
        jLSuma1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLSuma1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSuma1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSuma1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSuma1MouseExited(evt);
            }
        });
        jPBACKfondo.add(jLSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 20, 20));

        jLREsta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLREsta1.setForeground(new java.awt.Color(51, 51, 51));
        jLREsta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLREsta1.setText("-");
        jLREsta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLREsta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLREsta1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLREsta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLREsta1MouseExited(evt);
            }
        });
        jPBACKfondo.add(jLREsta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 20, 20));

        jComboBMESAS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBMESAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa n°1", "Mesa n°2", "Mesa n°3", "Mesa n°4", "Mesa n°5", "Mesa n°6", "Mesa n°7", "Mesa n°8", "Mesa n°9", "Mesa n°10", "Mesa n°11", "Mesa n°12", "Mesa n°13", "Mesa n°14", "Mesa n°15", "Mesa n°16", "Mesa n°17", "Mesa n°18", "Mesa n°19", "Mesa n°20", " " }));
        jComboBMESAS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPBACKfondo.add(jComboBMESAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 200, -1));

        jComboBoxMESEROS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBoxMESEROS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lucas Aielo", "Alejandro Gaite", "Nahuel Gavino", "Francisco Andrian", " " }));
        jComboBoxMESEROS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPBACKfondo.add(jComboBoxMESEROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 200, -1));

        jLBorratabla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLBorratabla.setForeground(new java.awt.Color(51, 51, 51));
        jLBorratabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBorratabla.setText("x");
        jLBorratabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBorratabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBorratablaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBorratablaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBorratablaMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLBorratabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 20, 20));

        jLabelTIcket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/receipt-template-with-barcode.jpg"))); // NOI18N
        jPBACKfondo.add(jLabelTIcket, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 220, 420));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        jPBACKfondo.add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1000, 430));

        add(jPBACKfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jLPizzasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPizzasMouseClicked
            
       PizzaYtacos p1= new PizzaYtacos();
        p1.setSize(607, 407);
        p1.setLocation(0,0);
        
       jLabelContendor.removeAll();
        jLabelContendor.add(p1, BorderLayout.CENTER);
        jLabelContendor.revalidate();
        jLabelContendor.repaint();
    }//GEN-LAST:event_jLPizzasMouseClicked

    private void jLPizzasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPizzasMouseEntered
        jLPizzas.setForeground(Color.yellow);
    }//GEN-LAST:event_jLPizzasMouseEntered

    private void jLPizzasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPizzasMouseExited
jLPizzas.setForeground(Color.black);
    }//GEN-LAST:event_jLPizzasMouseExited

    private void jLLomosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLomosMouseClicked
          
       LomosYHamb p1= new LomosYHamb();
        p1.setSize(607, 407);
        p1.setLocation(0,0);
        
       jLabelContendor.removeAll();
        jLabelContendor.add(p1, BorderLayout.CENTER);
        jLabelContendor.revalidate();
        jLabelContendor.repaint();
    }//GEN-LAST:event_jLLomosMouseClicked

    private void jLLomosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLomosMouseEntered
        jLLomos.setForeground(Color.yellow);
    }//GEN-LAST:event_jLLomosMouseEntered

    private void jLLomosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLomosMouseExited
       jLLomos.setForeground(Color.black);
    }//GEN-LAST:event_jLLomosMouseExited

    private void jLBebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBebidasMouseClicked
      Bebidas p1= new Bebidas();
        p1.setSize(607, 407);
        p1.setLocation(0,0);
        
       jLabelContendor.removeAll();
        jLabelContendor.add(p1, BorderLayout.CENTER);
        jLabelContendor.revalidate();
        jLabelContendor.repaint();
    }//GEN-LAST:event_jLBebidasMouseClicked

    private void jLBebidasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBebidasMouseEntered
     jLBebidas.setForeground(Color.yellow);
    }//GEN-LAST:event_jLBebidasMouseEntered

    private void jLBebidasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBebidasMouseExited
jLBebidas.setForeground(Color.black);
    }//GEN-LAST:event_jLBebidasMouseExited

    private void jTextTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTOTALActionPerformed

    private void jLSuma1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSuma1MouseClicked


    }//GEN-LAST:event_jLSuma1MouseClicked

    private void jLSuma1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSuma1MouseEntered
      jLSuma1.setForeground(Color.green);
    }//GEN-LAST:event_jLSuma1MouseEntered

    private void jLSuma1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSuma1MouseExited
        jLSuma1.setForeground(Color.black);
    }//GEN-LAST:event_jLSuma1MouseExited

    private void jLREsta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREsta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLREsta1MouseClicked

    private void jLREsta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREsta1MouseEntered
     jLREsta1.setForeground(Color.green);
    }//GEN-LAST:event_jLREsta1MouseEntered

    private void jLREsta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREsta1MouseExited
        jLREsta1.setForeground(Color.black);
    }//GEN-LAST:event_jLREsta1MouseExited

    private void jLBorratablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorratablaMouseClicked
      
    }//GEN-LAST:event_jLBorratablaMouseClicked

    private void jLBorratablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorratablaMouseEntered
       jLBorratabla.setForeground(Color.green);
    }//GEN-LAST:event_jLBorratablaMouseEntered

    private void jLBorratablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorratablaMouseExited
       jLBorratabla.setForeground(Color.black);
    }//GEN-LAST:event_jLBorratablaMouseExited

    private void jLCargaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaPedidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCargaPedidoMouseClicked

    private void jLCargaPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaPedidoMouseEntered
         jLCargaPedido.setForeground(Color.green);
    }//GEN-LAST:event_jLCargaPedidoMouseEntered

    private void jLCargaPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaPedidoMouseExited
      jLCargaPedido.setForeground(Color.black);
    }//GEN-LAST:event_jLCargaPedidoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBMESAS;
    private javax.swing.JComboBox<String> jComboBoxMESEROS;
    private javax.swing.JLabel jLBebidas;
    private javax.swing.JLabel jLBorratabla;
    private javax.swing.JLabel jLCargaPedido;
    private javax.swing.JLabel jLLomos;
    private javax.swing.JLabel jLPizzas;
    private javax.swing.JLabel jLREsta1;
    private javax.swing.JLabel jLSuma1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jLabelContendor;
    private javax.swing.JLabel jLabelTIcket;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPBACKfondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePREorder;
    private javax.swing.JTextField jTextTOTAL;
    // End of variables declaration//GEN-END:variables
}
