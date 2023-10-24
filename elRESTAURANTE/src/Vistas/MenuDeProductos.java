
package Vistas;

import AccesoData.MesaData;
import AccesoData.MeseroData;
import AccesoData.PedidoData;
import AccesoData.ProductoData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import Entidades.Producto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuDeProductos extends javax.swing.JPanel {
    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modeloDos = new DefaultTableModel();
    private DefaultTableModel modeloTres = new DefaultTableModel();
    public boolean isCellEditable(int fila, int columna) {
        return false;
    }
    private List<Producto> listaUno;
    private List<Producto> listaDos;
    private ArrayList<Producto> listaTres;
    private List<Mesa> listaCuatro;
    private List<Mesero> listaCinco;
    private MeseroData meData;
    private ProductoData prodData;
    private PedidoData pedData;
    private MesaData mesaDat;
  
    public MenuDeProductos() {
        initComponents();
        modelo = new DefaultTableModel();
        modeloDos = new DefaultTableModel();
        modeloTres= new DefaultTableModel();
        prodData = new ProductoData();
        meData = new MeseroData();
        pedData = new PedidoData();
        mesaDat = new MesaData();
        listaCinco = meData.obtenerTodosLosMeseros();
        listaCuatro = mesaDat.obtenerTodasLasMesas();
        listaTres = new ArrayList<>();
        armarCabezera();
        cargarPizzas();
        cargarTacos();
        cargarMeseros();
        cargarMesas();
        cajaUno.setText("Pizzas");
        cajaDos.setText("Tacos");

        
    }
    private void armarCabezera(){
      
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modeloDos.addColumn("Nombre");
        modeloDos.addColumn("Precio");
        modeloTres.addColumn("Nombre");
        modeloTres.addColumn("Precio");
        jTUno.setModel(modelo);
        jTDos.setModel(modeloDos);
        jTTres.setModel(modeloTres);

    }
    private void cargarPedido(){
    modeloTres.setRowCount(0);
                      
             for (Producto m : listaTres) {
                modeloTres.addRow(new Object[]{m.getNombre(), m.getPrecio()});
            }
        setVisible(true);
    
    
    }
    private void cargarPizzas() {
        
        modelo.setRowCount(0);
            List<Producto> listaUno = prodData.listarProdxCategoria("Pizzas");          
             for (Producto m : listaUno) {
                modelo.addRow(new Object[]{m.getNombre(), m.getPrecio()});
            }
        setVisible(true);
    }
    private void cargarTacos() {
       
        modeloDos.setRowCount(0);
            List<Producto> listaDos = prodData.listarProdxCategoria("Tacos");          
             for (Producto m : listaDos) {
                modeloDos.addRow(new Object[]{m.getNombre(), m.getPrecio()});
            }
        setVisible(true);
    }
    private void cargarLomos() {
        
        modelo.setRowCount(0);
            List<Producto> listaUno = prodData.listarProdxCategoria("Lomos");          
             for (Producto m : listaUno) {
                modelo.addRow(new Object[]{m.getNombre(), m.getPrecio()});
            }
        setVisible(true);
    }
    private void cargarHambur() {
        
        modeloDos.setRowCount(0);
            List<Producto> listaDos = prodData.listarProdxCategoria("Hamburguesa");          
             for (Producto m : listaDos) {
                modeloDos.addRow(new Object[]{m.getNombre(), m.getPrecio()});
            }
        setVisible(true);
    }
    private void cargarAlcohol() {
        
        modelo.setRowCount(0);

            List<Producto> listaUno = prodData.listarProdxCategoria("Bebida con");          
             for (Producto m : listaUno) {
                modelo.addRow(new Object[]{m.getNombre(), m.getPrecio()});
            }
        setVisible(true);
    }
    private void cargarSinAlcohol() {
        
        modeloDos.setRowCount(0);
        
            List<Producto> listaDos = prodData.listarProdxCategoria("Bebidas sin");          
             for (Producto m : listaDos) {
                modeloDos.addRow(new Object[]{m.getNombre(), m.getPrecio()});
            }
        setVisible(true);
    }
    private void cargarMesas(){

            for (Mesa mesa : listaCuatro) {
            cBMesas.addItem("Mesa N°: "+mesa.getIdMesa());
            }
       
    }

    private void cargarMeseros(){

            for (Mesero mesero : listaCinco) {
            cBMesero.addItem(mesero.getNombre()+ " "+ mesero.getApellido());
            }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelfondo = new javax.swing.JLabel();
        jLabelContendor = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        jTTres = new javax.swing.JTable();
        jLBebidas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextTOTAL = new javax.swing.JTextField();
        jLCargaPedido = new javax.swing.JLabel();
        jLSuma = new javax.swing.JLabel();
        jLResta1 = new javax.swing.JLabel();
        cBMesas = new javax.swing.JComboBox<>();
        cBMesero = new javax.swing.JComboBox<>();
        jLabelTIcket = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUno = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTDos = new javax.swing.JTable();
        cajaUno = new java.awt.Label();
        cajaDos = new java.awt.Label();

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");

        jLabelContendor.setOpaque(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTTres.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTTres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTTres);

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

        jLSuma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLSuma.setForeground(new java.awt.Color(51, 51, 51));
        jLSuma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSuma.setText("+");
        jLSuma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSumaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSumaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSumaMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 20, 20));

        jLResta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLResta1.setForeground(new java.awt.Color(51, 51, 51));
        jLResta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLResta1.setText("-");
        jLResta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLResta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLResta1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLResta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLResta1MouseExited(evt);
            }
        });
        jPBACKfondo.add(jLResta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 20, 20));

        cBMesas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cBMesas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPBACKfondo.add(cBMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 200, -1));

        cBMesero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cBMesero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cBMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBMeseroActionPerformed(evt);
            }
        });
        jPBACKfondo.add(cBMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 200, -1));

        jLabelTIcket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/receipt-template-with-barcode.jpg"))); // NOI18N
        jPBACKfondo.add(jLabelTIcket, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 220, 420));

        jTUno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTUno);

        jPBACKfondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 240, 330));

        jTDos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTDos);

        jPBACKfondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 240, 330));

        cajaUno.setFont(new java.awt.Font("Century Schoolbook", 3, 36)); // NOI18N
        cajaUno.setText("label1");
        jPBACKfondo.add(cajaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 240, 40));

        cajaDos.setFont(new java.awt.Font("Century Schoolbook", 3, 36)); // NOI18N
        cajaDos.setText("label2");
        jPBACKfondo.add(cajaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 240, 40));

        add(jPBACKfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jLPizzasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPizzasMouseClicked
            
       cargarPizzas();
       cargarTacos();
       cajaUno.setText("Pizzas");
       cajaDos.setText("Tacos");
    }//GEN-LAST:event_jLPizzasMouseClicked

    private void jLPizzasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPizzasMouseEntered
        jLPizzas.setForeground(Color.yellow);
    }//GEN-LAST:event_jLPizzasMouseEntered

    private void jLPizzasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPizzasMouseExited
jLPizzas.setForeground(Color.black);
    }//GEN-LAST:event_jLPizzasMouseExited

    private void jLLomosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLomosMouseClicked
        cargarLomos();
        cargarHambur();  
        cajaUno.setText("Lomos");
        cajaDos.setText("Hamburguesas");
      
    }//GEN-LAST:event_jLLomosMouseClicked

    private void jLLomosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLomosMouseEntered
        jLLomos.setForeground(Color.yellow);
    }//GEN-LAST:event_jLLomosMouseEntered

    private void jLLomosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLomosMouseExited
       jLLomos.setForeground(Color.black);
    }//GEN-LAST:event_jLLomosMouseExited

    private void jLBebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBebidasMouseClicked
    cargarAlcohol();  
    cargarSinAlcohol();
    cajaUno.setText("Con Alcohol");
    cajaDos.setText("Sin Alcohol");    
        
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

    private void jLSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSumaMouseClicked
      int filaSeleccionada = jTUno.getSelectedRow();
      Producto nuevoProd;
                if (filaSeleccionada != -1) { 
                    String valorPrimeraColumna = (String) jTUno.getValueAt(filaSeleccionada, 0);
                    nuevoProd= prodData.buscarProductoNombre(valorPrimeraColumna);
                    
                   listaTres.add(nuevoProd);
                   JOptionPane.showMessageDialog(this, nuevoProd.getIdProducto());
                   
                } else {
                    filaSeleccionada = jTDos.getSelectedRow();
                if (filaSeleccionada != -1) { 
                    String valorPrimeraColumna = (String) jTDos.getValueAt(filaSeleccionada, 0);
                    
                    nuevoProd= prodData.buscarProductoNombre(valorPrimeraColumna);
                    JOptionPane.showMessageDialog(this, nuevoProd.getIdProducto());
                    listaTres.add(nuevoProd);
                } else {
                    JOptionPane.showMessageDialog(this, "no seleccionaste ningun producto");
                }
                } 
        cargarPedido();
    }//GEN-LAST:event_jLSumaMouseClicked

    private void jLSumaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSumaMouseEntered
      jLSuma.setForeground(Color.green);
    }//GEN-LAST:event_jLSumaMouseEntered

    private void jLSumaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSumaMouseExited
        jLSuma.setForeground(Color.black);
    }//GEN-LAST:event_jLSumaMouseExited

    private void jLResta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLResta1MouseClicked
    
        int filaSeleccionada = jTTres.getSelectedRow();
    if (filaSeleccionada != -1) {
        listaTres.remove(filaSeleccionada);
       cargarPedido();
        jTTres.revalidate();
    } else {
        JOptionPane.showMessageDialog(this, "No seleccionaste ningún producto a eliminar.");
    } 
    cajaUno.setText("Pizzas");
    cajaDos.setText("Tacos");
    }//GEN-LAST:event_jLResta1MouseClicked

    private void jLResta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLResta1MouseEntered
     jLResta1.setForeground(Color.green);
    }//GEN-LAST:event_jLResta1MouseEntered

    private void jLResta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLResta1MouseExited
        jLResta1.setForeground(Color.black);
    }//GEN-LAST:event_jLResta1MouseExited

    private void jLCargaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaPedidoMouseClicked
       //aqui coso para cargar pedidos xD
    }//GEN-LAST:event_jLCargaPedidoMouseClicked

    private void jLCargaPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaPedidoMouseEntered
         jLCargaPedido.setForeground(Color.green);
    }//GEN-LAST:event_jLCargaPedidoMouseEntered

    private void jLCargaPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaPedidoMouseExited
      jLCargaPedido.setForeground(Color.black);
    }//GEN-LAST:event_jLCargaPedidoMouseExited

    private void cBMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBMeseroActionPerformed

    private void jTDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDosMouseClicked
        jTUno.clearSelection();
        jTTres.clearSelection();
    }//GEN-LAST:event_jTDosMouseClicked

    private void jTUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUnoMouseClicked
        jTDos.clearSelection();
        jTTres.clearSelection();
        
    }//GEN-LAST:event_jTUnoMouseClicked

    private void jTTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTresMouseClicked
        jTDos.clearSelection();
        jTUno.clearSelection();
    }//GEN-LAST:event_jTTresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cBMesas;
    private javax.swing.JComboBox<String> cBMesero;
    private java.awt.Label cajaDos;
    private java.awt.Label cajaUno;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLBebidas;
    private javax.swing.JLabel jLCargaPedido;
    private javax.swing.JLabel jLLomos;
    private javax.swing.JLabel jLPizzas;
    private javax.swing.JLabel jLResta1;
    private javax.swing.JLabel jLSuma;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTDos;
    private javax.swing.JTable jTTres;
    private javax.swing.JTable jTUno;
    private javax.swing.JTextField jTextTOTAL;
    // End of variables declaration//GEN-END:variables
}
