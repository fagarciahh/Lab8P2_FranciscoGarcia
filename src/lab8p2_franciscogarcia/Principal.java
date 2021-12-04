package lab8p2_franciscogarcia;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        
        initComponents();
        adminPartida ap = new adminPartida(".//partidas.cbm");
        ap.cargarArchivo();
        lista = ap.getPartidas();
        System.out.println(lista);
        actualizarCombo();
        
    }
    
    private void actualizarCombo(){
        
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cmb_partidas.getModel();
        modelo.removeAllElements();
        for (Partida partida : lista) {
            modelo.addElement(partida);
        }
        cmb_estrellas.setModel(modelo);
        cmb_jugadores.setModel(modelo);
        cmb_partidas.setModel(modelo);
        adminPartida ap = new adminPartida(".//partidas.cbm");
        ap.setPartidas(lista);
        ap.escribirArchivo();       
    }
    
    private boolean verificarNombre(){
        
        for (Partida partida : lista) {
            if(tf_nombrePartida.equals(partida.getNombre())){
                return true;
            }
        }
        return false;
    }
    
    private boolean verificarEstrella(){
        
        int x = cmb_estrellas.getSelectedIndex();
        Partida p = lista.get(x);
        for (Estrella e : p.getEstrellas()) {
            if(e.getNombre().equals(tf_nombreEstrella)){
                return true;
            }
        }
        return false;
        
    }
    
    private boolean verificarJugador(){
        
        int x = cmb_estrellas.getSelectedIndex();
        Partida p = lista.get(x);
        for (Jugador e : p.getJugadores()) {
            if(e.getNombre().equals(tf_nombreEstrella)){
                return true;
            }
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_juego = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_jugador = new javax.swing.JLabel();
        lb_distancia = new javax.swing.JLabel();
        lb_partida = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lb_estrella = new javax.swing.JLabel();
        lb_dr = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bt_comenzar = new javax.swing.JButton();
        bt_pausar = new javax.swing.JButton();
        cmb_jugador = new javax.swing.JComboBox<>();
        bt_agregar = new javax.swing.JButton();
        cmb_estrella = new javax.swing.JComboBox<>();
        barra = new javax.swing.JProgressBar();
        bt_seguir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmb_partidas = new javax.swing.JComboBox<>();
        bt_iniciar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_nombrePartida = new javax.swing.JTextField();
        bt_crearPartida = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        tf_distancia = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_estrellas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tf_nombreEstrella = new javax.swing.JTextField();
        bt_crearEstrella = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombreJugador = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_velocidad = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        cmb_jugadores = new javax.swing.JComboBox<>();
        bt_crearJugador = new javax.swing.JButton();

        jLabel11.setText("Partida:");

        jLabel12.setText("Jugador:");

        jLabel13.setText("Distancia:");

        lb_jugador.setText("___");

        lb_distancia.setText("___");

        lb_partida.setText("___");

        jLabel17.setText("Estrella:");

        jLabel18.setText("Distancia Recorrida:");

        lb_estrella.setText("___");

        lb_dr.setText("__");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Velocidad", "Estrella", "Distancia", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        bt_comenzar.setText("Comenzar");
        bt_comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_comenzarMouseClicked(evt);
            }
        });

        bt_pausar.setText("Pausar");
        bt_pausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pausarMouseClicked(evt);
            }
        });

        bt_agregar.setText("Agregar");
        bt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarMouseClicked(evt);
            }
        });

        bt_seguir.setText("Seguir");
        bt_seguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_seguirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_juegoLayout = new javax.swing.GroupLayout(jd_juego.getContentPane());
        jd_juego.getContentPane().setLayout(jd_juegoLayout);
        jd_juegoLayout.setHorizontalGroup(
            jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_juegoLayout.createSequentialGroup()
                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_juegoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_juegoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(lb_partida))
                            .addGroup(jd_juegoLayout.createSequentialGroup()
                                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_juegoLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(lb_jugador))
                                    .addGroup(jd_juegoLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(lb_distancia)))
                                .addGap(141, 141, 141)
                                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_juegoLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(lb_dr))
                                    .addGroup(jd_juegoLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(lb_estrella))))
                            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_juegoLayout.createSequentialGroup()
                        .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_juegoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bt_comenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_juegoLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(cmb_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(bt_pausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_seguir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
            .addGroup(jd_juegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jd_juegoLayout.setVerticalGroup(
            jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_juegoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lb_partida))
                .addGap(18, 18, 18)
                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lb_jugador)
                    .addComponent(jLabel17)
                    .addComponent(lb_estrella))
                .addGap(18, 18, 18)
                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lb_distancia)
                    .addComponent(jLabel18)
                    .addComponent(lb_dr))
                .addGap(18, 18, 18)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_comenzar)
                    .addComponent(bt_pausar)
                    .addComponent(bt_seguir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmb_jugador))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU PRINCIPAL");

        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        jLabel2.setText("Partida:");

        bt_iniciar.setText("Iniciar");
        bt_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_iniciarActionPerformed(evt);
            }
        });

        bt_eliminar.setText("Eliminar Partida");
        bt_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarMouseClicked(evt);
            }
        });

        bt_editar.setText("Editar Partida");

        jLabel3.setText("Nombre de partida:");

        bt_crearPartida.setText("Crear Partida");
        bt_crearPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearPartidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(bt_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(bt_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_partidas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombrePartida)
                    .addComponent(bt_crearPartida, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_partidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombrePartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_iniciar)
                    .addComponent(bt_crearPartida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_editar)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tab.addTab("Partidas", jPanel1);

        jLabel4.setText("Descripcion");

        ta_descripcion.setColumns(20);
        ta_descripcion.setRows(5);
        jScrollPane1.setViewportView(ta_descripcion);

        jLabel5.setText("Distancia");

        tf_distancia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel6.setText("Partida");

        jLabel7.setText("Nombre");

        bt_crearEstrella.setText("Crear Estrella");
        bt_crearEstrella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearEstrellaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1)
                    .addComponent(tf_distancia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(cmb_estrellas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(tf_nombreEstrella)
                    .addComponent(bt_crearEstrella, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmb_estrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nombreEstrella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_crearEstrella, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tab.addTab("Crear Estrellas", jPanel2);

        jLabel8.setText("Nombre:");

        jLabel9.setText("Velocidad:");

        tf_velocidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel10.setText("Partida");

        bt_crearJugador.setText("Crear Jugador");
        bt_crearJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearJugadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(tf_nombreJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(tf_velocidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(cmb_jugadores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_crearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bt_crearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        tab.addTab("Crear Jugadores", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarMouseClicked
        
        if(cmb_partidas.getSelectedItem() != null){
            lista.remove(cmb_partidas.getSelectedIndex());
            actualizarCombo();
        }else{
            JOptionPane.showMessageDialog(this, "No hay nada que borrar");
        }
        
        
    }//GEN-LAST:event_bt_eliminarMouseClicked

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged
        if (tab.getSelectedIndex() == 1) {
            adminPartida ap = new adminPartida("./partidas.cbm");
            ap.cargarArchivo();
            DefaultComboBoxModel modelo
                    = new DefaultComboBoxModel(
                            lista.toArray());
            cmb_partidas.setModel(modelo);  
            cmb_estrellas.setModel(modelo);
            cmb_jugadores.setModel(modelo);
        }
    }//GEN-LAST:event_tabStateChanged

    private void bt_crearPartidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearPartidaMouseClicked
        
        if (verificarNombre()) {
            JOptionPane.showMessageDialog(this, "Ya existe una partida con ese nombre");
            tf_nombrePartida.setText("");
        }else{
            
            Partida p = new Partida(tf_nombrePartida.getText(), new Date());
            lista.add(p);
            actualizarCombo();
            JOptionPane.showMessageDialog(this, "Partida creada exitosamente");
            tf_nombrePartida.setText("");
            
        }
        
    }//GEN-LAST:event_bt_crearPartidaMouseClicked

    private void bt_crearEstrellaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearEstrellaMouseClicked
        
        if(verificarEstrella()){
            JOptionPane.showMessageDialog(this, "Ya existe una Estrella con ese nombre");
            tf_nombreEstrella.setText("");
        }else{
            Partida temp
                    = (Partida) cmb_estrellas.getSelectedItem();
            if (temp != null) {
                String d = ta_descripcion.getText();
                String n = tf_nombreEstrella.getText();
                int r = Integer.parseInt(tf_distancia.getText());

                temp.getEstrellas().add(new Estrella(r, d, n));

                JOptionPane.showMessageDialog(this, "Se creo su estrella exitosamente");

                ta_descripcion.setText("");
                tf_nombreEstrella.setText("");
                tf_distancia.setText("");
                actualizarCombo();
            }
        }
        
        
    }//GEN-LAST:event_bt_crearEstrellaMouseClicked

    private void bt_crearJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearJugadorMouseClicked
        
        
        if(verificarJugador()){
            
            JOptionPane.showMessageDialog(this, "Ya existe un Jugador con ese nombre");
            tf_nombreJugador.setText("");
            
        }else{
            Partida temp
                    = (Partida) cmb_estrellas.getSelectedItem();
            if (temp != null) {
                String n = tf_nombreJugador.getText();
                int v = Integer.parseInt(tf_velocidad.getText());

                temp.getJugadores().add(new Jugador(v, n));

                JOptionPane.showMessageDialog(this, "Se creo su jugador exitosamente");

                tf_nombreJugador.setText("");
                tf_velocidad.setText("");
                actualizarCombo();
                
            }
        }
        
    }//GEN-LAST:event_bt_crearJugadorMouseClicked

    private void bt_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_iniciarActionPerformed
        
        int n = cmb_partidas.getSelectedIndex();
        ArrayList<Jugador> jugadores = lista.get(n).getJugadores();
        ArrayList<Estrella> estrellas = lista.get(n).getEstrellas();
        
        DefaultComboBoxModel m1 = (DefaultComboBoxModel)cmb_jugadores.getModel();
        DefaultComboBoxModel m2 = (DefaultComboBoxModel)cmb_estrellas.getModel();
        
        System.out.println(lista.get(n));
        
        for (Estrella e : estrellas) {
            m2.addElement(e);
            System.out.println(e);
        }
        for (Jugador j : jugadores) {
            m1.addElement(j);
            System.out.println(j);
        }
                
        lb_partida.setText(lista.get(n).toString());
        
        jd_juego.pack();
        jd_juego.setLocationRelativeTo(this);
        jd_juego.setModal(true);
        jd_juego.setVisible(true);   
        
        cmb_jugadores.setModel(m1);
        cmb_estrellas.setModel(m2);
        
        
        
        
    }//GEN-LAST:event_bt_iniciarActionPerformed

    private void bt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarMouseClicked

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        int j = cmb_jugador.getSelectedIndex();
        int e = cmb_estrellas.getSelectedIndex();
        int n = cmb_partidas.getSelectedIndex();
        
        Jugador player = lista.get(n).getJugadores().get(j);
        Estrella estrella = lista.get(n).getEstrellas().get(e);
        
        
        
        Object[] row ={
            player.getNombre(),
            player.getVelocidad(),
            estrella.getNombre(),
            estrella.getDistancia(),
            "Espera"
        };
        
        modelo.addColumn(row);
        tabla.setModel(modelo);       

    }//GEN-LAST:event_bt_agregarMouseClicked

    private void bt_comenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_comenzarMouseClicked
        
        
        
    }//GEN-LAST:event_bt_comenzarMouseClicked

    private void bt_pausarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pausarMouseClicked


        
    }//GEN-LAST:event_bt_pausarMouseClicked

    private void bt_seguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_seguirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_seguirMouseClicked

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
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_comenzar;
    private javax.swing.JButton bt_crearEstrella;
    private javax.swing.JButton bt_crearJugador;
    private javax.swing.JButton bt_crearPartida;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_iniciar;
    private javax.swing.JButton bt_pausar;
    private javax.swing.JButton bt_seguir;
    private javax.swing.JComboBox<String> cmb_estrella;
    private javax.swing.JComboBox<String> cmb_estrellas;
    private javax.swing.JComboBox<String> cmb_jugador;
    private javax.swing.JComboBox<String> cmb_jugadores;
    private javax.swing.JComboBox<String> cmb_partidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_juego;
    private javax.swing.JLabel lb_distancia;
    private javax.swing.JLabel lb_dr;
    private javax.swing.JLabel lb_estrella;
    private javax.swing.JLabel lb_jugador;
    private javax.swing.JLabel lb_partida;
    private javax.swing.JTextArea ta_descripcion;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tabla;
    private javax.swing.JFormattedTextField tf_distancia;
    private javax.swing.JTextField tf_nombreEstrella;
    private javax.swing.JTextField tf_nombreJugador;
    private javax.swing.JTextField tf_nombrePartida;
    private javax.swing.JFormattedTextField tf_velocidad;
    // End of variables declaration//GEN-END:variables

ArrayList<Partida> lista = new ArrayList();
}
