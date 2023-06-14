/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import GestionBBDD.Conexion2;
import tiposProductos.Productos;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Main_botones extends javax.swing.JFrame {

    public static Main_botones boton3 = new Main_botones();
    public static Ventana_cafe cafe3 = new Ventana_cafe();
    public static Ventana_comida comida3 = new Ventana_comida();
    public static Ventana_infusion infusion3 = new Ventana_infusion();
    public static Ventana_otra_bebida otrasbebe3 = new Ventana_otra_bebida();

    static Conexion2 conexionPrueba = new Conexion2();
    public static ArrayList<Productos> productosAux = new ArrayList<Productos>();

    /**
     * Creates new form Main_botones_cafe
     */
    public Main_botones() {
        initComponents();

// cafe
        ImageIcon img_cafe = new ImageIcon("src\\cafeteria_imagenes_botones\\240x100\\cafe.png");
        Image im_cafe = img_cafe.getImage().getScaledInstance(jb_cafes.getWidth(), jb_cafes.getHeight(), Image.SCALE_SMOOTH);
        jb_cafes.setIcon(new ImageIcon(im_cafe));
// infusiones
        ImageIcon img_infu = new ImageIcon("src\\cafeteria_imagenes_botones\\240x100\\infusiones.png");
        Image im_infu = img_infu.getImage().getScaledInstance(jb_infusiones.getWidth(), jb_infusiones.getHeight(), Image.SCALE_SMOOTH);
        jb_infusiones.setIcon(new ImageIcon(im_infu));
// otras bebidas
        ImageIcon img_otros = new ImageIcon("src\\cafeteria_imagenes_botones\\240x100\\otras.png");
        Image im_otro = img_otros.getImage().getScaledInstance(jb_otras_bebidas.getWidth(), jb_otras_bebidas.getHeight(), Image.SCALE_SMOOTH);
        jb_otras_bebidas.setIcon(new ImageIcon(im_otro));
// comida
        ImageIcon img_comida = new ImageIcon("src\\cafeteria_imagenes_botones\\240x100\\comida.png");
        Image im_comida = img_comida.getImage().getScaledInstance(jb_comidas.getWidth(), jb_comidas.getHeight(), Image.SCALE_SMOOTH);
        jb_comidas.setIcon(new ImageIcon(im_comida));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jtp_pestanias = new javax.swing.JTabbedPane();
        jp_caja_main = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_listado_tickets = new javax.swing.JList<>();
        jb_ticket_nuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jb_cobrar_ticket = new javax.swing.JButton();
        jb_modificar_ticket = new javax.swing.JButton();
        jb_hacer_caja = new javax.swing.JButton();
        jb_borrar_ticket = new javax.swing.JButton();
        jb_borrar_producto = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_lista_productos_ticket_seleccionado = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jp_productos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jp_botoenes_principales = new javax.swing.JPanel();
        jb_infusiones = new javax.swing.JButton();
        jb_otras_bebidas = new javax.swing.JButton();
        jb_comidas = new javax.swing.JButton();
        jb_cafes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_informacion_alergenos = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_info_ticket = new javax.swing.JTextArea();
        jtf_id_ticket_uso = new javax.swing.JTextField();
        jb_guardar_ticket = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtp_pestanias.setBackground(new java.awt.Color(115, 84, 72));
        jtp_pestanias.setEnabled(false);
        jtp_pestanias.setPreferredSize(new java.awt.Dimension(880, 600));

        jp_caja_main.setBackground(new java.awt.Color(217, 141, 98));

        jl_listado_tickets.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ticket 1", "Ticket 2", "Ticket 3", "Ticket 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jl_listado_tickets);

        jb_ticket_nuevo.setBackground(new java.awt.Color(54, 115, 115));
        jb_ticket_nuevo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_ticket_nuevo.setForeground(new java.awt.Color(242, 214, 189));
        jb_ticket_nuevo.setText("TICKET  NUEVO");
        jb_ticket_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ticket_nuevoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("LISTADO TICKETS:");

        jb_cobrar_ticket.setBackground(new java.awt.Color(115, 184, 191));
        jb_cobrar_ticket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_cobrar_ticket.setText("COBRAR TICKET");
        jb_cobrar_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cobrar_ticketActionPerformed(evt);
            }
        });

        jb_modificar_ticket.setBackground(new java.awt.Color(115, 184, 191));
        jb_modificar_ticket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_modificar_ticket.setText("MODIFICAR TICKET");
        jb_modificar_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_ticketActionPerformed(evt);
            }
        });

        jb_hacer_caja.setBackground(new java.awt.Color(54, 115, 115));
        jb_hacer_caja.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_hacer_caja.setForeground(new java.awt.Color(242, 214, 189));
        jb_hacer_caja.setText("HACER CAJA");
        jb_hacer_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_hacer_cajaActionPerformed(evt);
            }
        });

        jb_borrar_ticket.setBackground(new java.awt.Color(115, 184, 191));
        jb_borrar_ticket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_borrar_ticket.setText("BORRAR TICKET");
        jb_borrar_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrar_ticketActionPerformed(evt);
            }
        });

        jb_borrar_producto.setBackground(new java.awt.Color(115, 184, 191));
        jb_borrar_producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_borrar_producto.setText("BORRAR PRODUCTO");
        jb_borrar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrar_productoActionPerformed(evt);
            }
        });

        jl_lista_productos_ticket_seleccionado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jl_lista_productos_ticket_seleccionado);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("TICKET SELECCIONADO:");

        javax.swing.GroupLayout jp_caja_mainLayout = new javax.swing.GroupLayout(jp_caja_main);
        jp_caja_main.setLayout(jp_caja_mainLayout);
        jp_caja_mainLayout.setHorizontalGroup(
            jp_caja_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_caja_mainLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jp_caja_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_cobrar_ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_borrar_ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_caja_mainLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jb_ticket_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jb_modificar_ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(94, 94, 94)
                .addGroup(jp_caja_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane6)
                    .addComponent(jb_borrar_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jb_hacer_caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        jp_caja_mainLayout.setVerticalGroup(
            jp_caja_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_caja_mainLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jp_caja_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jp_caja_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_caja_mainLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_borrar_producto))
                    .addGroup(jp_caja_mainLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_ticket_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_modificar_ticket)))
                .addGap(18, 18, 18)
                .addGroup(jp_caja_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_caja_mainLayout.createSequentialGroup()
                        .addComponent(jb_borrar_ticket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_cobrar_ticket))
                    .addComponent(jb_hacer_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jtp_pestanias.addTab("CAJA", jp_caja_main);

        jp_productos.setBackground(new java.awt.Color(217, 141, 98));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("TIKECT:");

        jp_botoenes_principales.setBackground(new java.awt.Color(242, 214, 189));
        jp_botoenes_principales.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(255, 204, 204)));

        jb_infusiones.setBackground(new java.awt.Color(54, 115, 115));
        jb_infusiones.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jb_infusiones.setHideActionText(true);
        jb_infusiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_infusionesActionPerformed(evt);
            }
        });

        jb_otras_bebidas.setBackground(new java.awt.Color(54, 115, 115));
        jb_otras_bebidas.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jb_otras_bebidas.setHideActionText(true);
        jb_otras_bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_otras_bebidasActionPerformed(evt);
            }
        });

        jb_comidas.setBackground(new java.awt.Color(54, 115, 115));
        jb_comidas.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jb_comidas.setHideActionText(true);
        jb_comidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_comidasActionPerformed(evt);
            }
        });

        jb_cafes.setBackground(new java.awt.Color(54, 115, 115));
        jb_cafes.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jb_cafes.setHideActionText(true);
        jb_cafes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cafesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_botoenes_principalesLayout = new javax.swing.GroupLayout(jp_botoenes_principales);
        jp_botoenes_principales.setLayout(jp_botoenes_principalesLayout);
        jp_botoenes_principalesLayout.setHorizontalGroup(
            jp_botoenes_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_botoenes_principalesLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jp_botoenes_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jb_infusiones, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jb_otras_bebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jb_comidas, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jb_cafes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jp_botoenes_principalesLayout.setVerticalGroup(
            jp_botoenes_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_botoenes_principalesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jb_cafes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_infusiones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_otras_bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_comidas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));

        jta_informacion_alergenos.setEditable(false);
        jta_informacion_alergenos.setColumns(20);
        jta_informacion_alergenos.setRows(5);
        jScrollPane1.setViewportView(jta_informacion_alergenos);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("INFORMACIÓN DE AÉRGENOS:");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));

        jta_info_ticket.setEditable(false);
        jta_info_ticket.setColumns(20);
        jta_info_ticket.setRows(5);
        jScrollPane2.setViewportView(jta_info_ticket);

        jtf_id_ticket_uso.setEditable(false);
        jtf_id_ticket_uso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_id_ticket_uso.setText("id_del ticket en uso");

        jb_guardar_ticket.setBackground(new java.awt.Color(115, 184, 191));
        jb_guardar_ticket.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_guardar_ticket.setText("GUARDAR TICKET");
        jb_guardar_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardar_ticketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_productosLayout = new javax.swing.GroupLayout(jp_productos);
        jp_productos.setLayout(jp_productosLayout);
        jp_productosLayout.setHorizontalGroup(
            jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jp_botoenes_principales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_productosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jtf_id_ticket_uso, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane2)
                        .addComponent(jb_guardar_ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                .addGap(89, 89, 89))
        );
        jp_productosLayout.setVerticalGroup(
            jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_productosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_botoenes_principales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_productosLayout.createSequentialGroup()
                        .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_id_ticket_uso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_guardar_ticket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jtp_pestanias.addTab("PRODUCTOS", jp_productos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_pestanias, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_pestanias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardar_ticketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_guardar_ticketActionPerformed
        // guarda la información del ticket con el que se esta trabajando
        jtp_pestanias.setSelectedComponent(jp_caja_main);

    }// GEN-LAST:event_jb_guardar_ticketActionPerformed

    private void jb_cafesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_cafesActionPerformed
        // ir a frame cafesys

        // valido
        cafe3.setVisible(true);
        boton3.setVisible(false);
    }// GEN-LAST:event_jb_cafesActionPerformed

    private void jb_comidasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_comidasActionPerformed
        // ir a frame comidas
        comida3.setVisible(true);

    }// GEN-LAST:event_jb_comidasActionPerformed

    private void jb_otras_bebidasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_otras_bebidasActionPerformed
        // ir a frame otras bebidas
        otrasbebe3.setVisible(true);
    }// GEN-LAST:event_jb_otras_bebidasActionPerformed

    private void jb_infusionesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_infusionesActionPerformed
        // ir a frame infusiones

        infusion3.setVisible(true);
    }// GEN-LAST:event_jb_infusionesActionPerformed

    private void jb_borrar_productoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_borrar_productoActionPerformed
        // borra el prodcuto seleccionado en jl_lista_productos_ticket_seleccionado
    }// GEN-LAST:event_jb_borrar_productoActionPerformed

    private void jb_borrar_ticketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_borrar_ticketActionPerformed
        // borra el ticket seleccionado
    }// GEN-LAST:event_jb_borrar_ticketActionPerformed

    private void jb_hacer_cajaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_hacer_cajaActionPerformed
        // abre un joptionpane con:
        /*
         * caja total: -- suma la caja chica + total metalico+ total tarjeta
         * caja chica: -- muestra la caja chica
         * total metalico: -- muestra el total metalico
         * total tarjeta: -- muestra el total tarjeta
         * beneficios: -- muestra caja total- caja chica
         */
    }// GEN-LAST:event_jb_hacer_cajaActionPerformed

    private void jb_modificar_ticketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_modificar_ticketActionPerformed
        // modifica el ticket seleccionado y salta a la ventana de productos
        // OJO- en productos el jta_info_ticket debe mostrar el contenido del ticket
        // seleccionado
        jtp_pestanias.setSelectedComponent(jp_productos);
    }// GEN-LAST:event_jb_modificar_ticketActionPerformed

    private void jb_cobrar_ticketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_cobrar_ticketActionPerformed
        // cobra el ticket seleccionado
        // si se ha seleccionado pago con tarjeta no saca el joptionpanel
        // si no esta seleccionado abre un joption panel que pide la cantidad y hace la
        // suegerencia de devolución
    }// GEN-LAST:event_jb_cobrar_ticketActionPerformed

    private void jb_ticket_nuevoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_ticket_nuevoActionPerformed
        // crea un ticket nuevo y salta a la ventana de productos
        /*
         * intento de poner el fondo VERSION 0.0
         * Imagen fondo1 = new Imagen();
         * jp_productos.add(fondo1);
         * jp_productos.repaint();
         */
        jtp_pestanias.setSelectedComponent(jp_productos); // .seteSelectedComponente lanza a la ventana que llama
    }// GEN-LAST:event_jb_ticket_nuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            conexionPrueba.conectar();
            Conexion2.recogerDatosProductos();

            // ConexionMySQL.conexionBaseDatos();
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_botones.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_botones.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_botones.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_botones.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_botones().setVisible(true);
                /*
                 * cosas para ver si funciona el cambio de pantalla OJO
                 * Cafes cafe = new Cafes();
                 * cafe.updateUI();
                 * cafe.setVisible(true);
                 */

            }
        });

        // Metodo para recoger todos los datos de la base de datos de la tabla productos
        // y los guarde en un arraylist
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jb_borrar_producto;
    private javax.swing.JButton jb_borrar_ticket;
    private javax.swing.JButton jb_cafes;
    private javax.swing.JButton jb_cobrar_ticket;
    private javax.swing.JButton jb_comidas;
    private javax.swing.JButton jb_guardar_ticket;
    private javax.swing.JButton jb_hacer_caja;
    private javax.swing.JButton jb_infusiones;
    private javax.swing.JButton jb_modificar_ticket;
    private javax.swing.JButton jb_otras_bebidas;
    private javax.swing.JButton jb_ticket_nuevo;
    private javax.swing.JList<String> jl_lista_productos_ticket_seleccionado;
    private javax.swing.JList<String> jl_listado_tickets;
    private javax.swing.JPanel jp_botoenes_principales;
    private javax.swing.JPanel jp_caja_main;
    private javax.swing.JPanel jp_productos;
    private javax.swing.JTextArea jta_info_ticket;
    private javax.swing.JTextArea jta_informacion_alergenos;
    private javax.swing.JTextField jtf_id_ticket_uso;
    private javax.swing.JTabbedPane jtp_pestanias;
    // End of variables declaration//GEN-END:variables

    /*
     * intento poder imagen VERSION 0.1
     * https://www.youtube.com/watch?v=CfKlAHInank
     * 
     * class fondo_productos extends JPanel{
     * private Imagen fondo_produ;
     * 
     * @Override
     * public void paint (Graphics g){
     * fondo_produ = new ImageIcon(getClass);
     * 
     * }
     * }
     */
}
