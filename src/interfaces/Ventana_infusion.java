/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

// OJO!! HAY UN BOTTON GROUP QUE SE LLAMAN IGUAL EN CAFES Y EN INFUSIONES QUE ES EL TIPO DE LECHE
/**
 *
 * @author admin
 */
public class Ventana_infusion extends javax.swing.JFrame {

    /**
     * Creates new form Infusiones_3
     */
    public Ventana_infusion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_tipo_leche = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jb_te_verde = new javax.swing.JButton();
        jb_frutos_rojos = new javax.swing.JButton();
        jb_te_azul = new javax.swing.JButton();
        jb_te_rojo = new javax.swing.JButton();
        jb_te_negro = new javax.swing.JButton();
        jb_montapoleo = new javax.swing.JButton();
        jb_rooibos = new javax.swing.JButton();
        jb_manzanilla = new javax.swing.JButton();
        jb_chai = new javax.swing.JButton();
        jb_matcha = new javax.swing.JButton();
        jb_pink = new javax.swing.JButton();
        jb_tila = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jrb_avena = new javax.swing.JRadioButton();
        jrb_soja = new javax.swing.JRadioButton();
        jrb_sin_lactosa = new javax.swing.JRadioButton();
        jrb_desna = new javax.swing.JRadioButton();
        jrb_agua = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_info_add_ticket_infusiones = new javax.swing.JTextArea();
        jb_aniadir_ticket_infusiones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(880, 600));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));

        jb_te_verde.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_te_verde.setText("Té verde");
        jb_te_verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_te_verdeActionPerformed(evt);
            }
        });

        jb_frutos_rojos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_frutos_rojos.setText("Frutos rojos");
        jb_frutos_rojos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_frutos_rojosActionPerformed(evt);
            }
        });

        jb_te_azul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_te_azul.setText("Té azul");
        jb_te_azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_te_azulActionPerformed(evt);
            }
        });

        jb_te_rojo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_te_rojo.setText("Té rojo");
        jb_te_rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_te_rojoActionPerformed(evt);
            }
        });

        jb_te_negro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_te_negro.setText("Té negro");
        jb_te_negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_te_negroActionPerformed(evt);
            }
        });

        jb_montapoleo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_montapoleo.setText("Mentapoleo");
        jb_montapoleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_montapoleoActionPerformed(evt);
            }
        });

        jb_rooibos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_rooibos.setText("Rooibos");
        jb_rooibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_rooibosActionPerformed(evt);
            }
        });

        jb_manzanilla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_manzanilla.setText("Manzanilla");
        jb_manzanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_manzanillaActionPerformed(evt);
            }
        });

        jb_chai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_chai.setText("Chai Vainilla");
        jb_chai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_chaiActionPerformed(evt);
            }
        });

        jb_matcha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_matcha.setText("Matcha");
        jb_matcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_matchaActionPerformed(evt);
            }
        });

        jb_pink.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_pink.setText("Pink Latte");
        jb_pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pinkActionPerformed(evt);
            }
        });

        jb_tila.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_tila.setText("Tila");
        jb_tila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jb_manzanilla, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_montapoleo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_pink, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jb_te_negro, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_te_azul, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_chai, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jb_te_rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_te_verde, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_tila, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jb_frutos_rojos, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_rooibos, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_matcha, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb_te_rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jb_te_verde, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb_tila, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb_te_negro, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_te_azul, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_chai, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb_frutos_rojos, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_rooibos, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_matcha, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb_manzanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_montapoleo, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_pink, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)));

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));

        jrb_avena.setBackground(new java.awt.Color(102, 255, 102));
        bg_tipo_leche.add(jrb_avena);
        jrb_avena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrb_avena.setText("Avena");
        jrb_avena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_avenaActionPerformed(evt);
            }
        });

        jrb_soja.setBackground(new java.awt.Color(102, 255, 102));
        bg_tipo_leche.add(jrb_soja);
        jrb_soja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrb_soja.setText("Soja");
        jrb_soja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_sojaActionPerformed(evt);
            }
        });

        jrb_sin_lactosa.setBackground(new java.awt.Color(102, 255, 102));
        bg_tipo_leche.add(jrb_sin_lactosa);
        jrb_sin_lactosa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrb_sin_lactosa.setText("Sin Lactosa");
        jrb_sin_lactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_sin_lactosaActionPerformed(evt);
            }
        });

        jrb_desna.setBackground(new java.awt.Color(102, 255, 102));
        bg_tipo_leche.add(jrb_desna);
        jrb_desna.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrb_desna.setText("Desnatada");
        jrb_desna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_desnaActionPerformed(evt);
            }
        });

        jrb_agua.setBackground(new java.awt.Color(102, 255, 102));
        bg_tipo_leche.add(jrb_agua);
        jrb_agua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrb_agua.setSelected(true);
        jrb_agua.setText("En Agua");
        jrb_agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_aguaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jrb_agua)
                                .addGap(86, 86, 86)
                                .addComponent(jrb_soja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrb_avena)
                                .addContainerGap())
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(79, Short.MAX_VALUE)
                                .addComponent(jrb_desna)
                                .addGap(63, 63, 63)
                                .addComponent(jrb_sin_lactosa)
                                .addGap(64, 64, 64)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jrb_agua)
                                        .addComponent(jrb_avena)
                                        .addComponent(jrb_soja))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jrb_sin_lactosa)
                                        .addComponent(jrb_desna))
                                .addGap(84, 84, 84)));

        jta_info_add_ticket_infusiones.setColumns(20);
        jta_info_add_ticket_infusiones.setRows(5);
        jta_info_add_ticket_infusiones.setEnabled(false);
        jScrollPane1.setViewportView(jta_info_add_ticket_infusiones);

        jb_aniadir_ticket_infusiones.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_aniadir_ticket_infusiones.setText("AÑADIR AL TICKET");
        jb_aniadir_ticket_infusiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aniadir_ticket_infusionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 248,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_aniadir_ticket_infusiones,
                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(105, 105, 105)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jb_aniadir_ticket_infusiones,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 79,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_te_verdeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_te_verdeActionPerformed
        // té verde al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_te_verdeActionPerformed

    private void jb_frutos_rojosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_frutos_rojosActionPerformed
        // té de frutos rojos al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_frutos_rojosActionPerformed

    private void jb_te_azulActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_te_azulActionPerformed
        // té azul al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu:
    }// GEN-LAST:event_jb_te_azulActionPerformed

    private void jb_te_rojoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_te_rojoActionPerformed
        // té rojo al jta_info_add_ticket_infusiones
        // hacaces colsutla
        // de vuelde uin id
        // con id y el bg_leches->ticket.add(infusion.(id, bg);
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_te_rojoActionPerformed

    private void jb_te_negroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_te_negroActionPerformed
        // té negro al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_te_negroActionPerformed

    private void jb_montapoleoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_montapoleoActionPerformed
        // mentapoleo al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_montapoleoActionPerformed

    private void jb_rooibosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_rooibosActionPerformed
        // té de rooibos al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_rooibosActionPerformed

    private void jb_manzanillaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_manzanillaActionPerformed
        // manzanilla al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_manzanillaActionPerformed

    private void jb_chaiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_chaiActionPerformed
        // té chai vainilla al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_chaiActionPerformed

    private void jb_matchaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_matchaActionPerformed
        // té matcha al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_matchaActionPerformed

    private void jb_pinkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_pinkActionPerformed
        // pink latte al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_pinkActionPerformed

    private void jb_tilaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_tilaActionPerformed
        // tila al jta_info_add_ticket_infusiones
        // OJO- debe tomar el valor del jbg_tipos_leche_infu
    }// GEN-LAST:event_jb_tilaActionPerformed

    private void jrb_avenaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jrb_avenaActionPerformed
        // TODO add your handling code here:
        jrb_avena.setActionCommand(" Avena");
    }// GEN-LAST:event_jrb_avenaActionPerformed

    private void jrb_sojaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jrb_sojaActionPerformed
        // TODO add your handling code here:
        jrb_soja.setActionCommand(" Soja");
    }// GEN-LAST:event_jrb_sojaActionPerformed

    private void jrb_sin_lactosaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jrb_sin_lactosaActionPerformed
        // TODO add your handling code here:
        jrb_sin_lactosa.setActionCommand(" Sin Lactosa");
    }// GEN-LAST:event_jrb_sin_lactosaActionPerformed

    private void jrb_desnaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jrb_desnaActionPerformed
        // TODO add your handling code here:
        jrb_desna.setActionCommand(" Desnatada");
    }// GEN-LAST:event_jrb_desnaActionPerformed

    private void jrb_aguaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jrb_aguaActionPerformed
        // TODO add your handling code here:
        jrb_agua.setActionCommand("");
    }// GEN-LAST:event_jrb_aguaActionPerformed

    private void jb_aniadir_ticket_infusionesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_aniadir_ticket_infusionesActionPerformed
        // añadir al ticket seleccionado la informacion recogida en el
        // jta_info_add_ticket
        Main_botones.infusion3.dispose();
    }// GEN-LAST:event_jb_aniadir_ticket_infusionesActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_infusion.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_infusion.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_infusion.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_infusion.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_infusion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_tipo_leche;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_aniadir_ticket_infusiones;
    private javax.swing.JButton jb_chai;
    private javax.swing.JButton jb_frutos_rojos;
    private javax.swing.JButton jb_manzanilla;
    private javax.swing.JButton jb_matcha;
    private javax.swing.JButton jb_montapoleo;
    private javax.swing.JButton jb_pink;
    private javax.swing.JButton jb_rooibos;
    private javax.swing.JButton jb_te_azul;
    private javax.swing.JButton jb_te_negro;
    private javax.swing.JButton jb_te_rojo;
    private javax.swing.JButton jb_te_verde;
    private javax.swing.JButton jb_tila;
    private javax.swing.JRadioButton jrb_agua;
    private javax.swing.JRadioButton jrb_avena;
    private javax.swing.JRadioButton jrb_desna;
    private javax.swing.JRadioButton jrb_sin_lactosa;
    private javax.swing.JRadioButton jrb_soja;
    private javax.swing.JTextArea jta_info_add_ticket_infusiones;
    // End of variables declaration//GEN-END:variables
}
