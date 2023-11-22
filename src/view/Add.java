package view;

import dao.DaoStudentUse;
import java.awt.Color;
import model.Contact;
import view.NoBorderComboBoxUI;

public class Add extends javax.swing.JFrame {
    private static Add instance = null;
    int xMouse, yMouse;
    
    
     public void setComboBoxUI() {
        jComboBox1.setUI(new NoBorderComboBoxUI());
    }
    
    public Add() {
        initComponents();
        
    }
    
    
    
    public static Add getInstance() {
        if (instance == null) {
            instance = new Add();
        }
        return instance;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addBtn = new javax.swing.JPanel();
        addBtnTxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        userLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        addressLabel = new javax.swing.JLabel();
        addresTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        numLabel = new javax.swing.JLabel();
        numTextField = new javax.swing.JFormattedTextField();
        idLabel = new javax.swing.JLabel();
        tipeIdComboBox = new javax.swing.JComboBox<>();
        idTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        dateLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JFormattedTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/cerrar-simbolo-de-boton-circular.png"))); // NOI18N
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/flechas-izquierda.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1094, 1094, 1094)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("Agregar contacto");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 160, 20));

        addBtn.setBackground(new java.awt.Color(0, 134, 190));

        addBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        addBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        addBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtnTxt.setText("Agregar");
        addBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout addBtnLayout = new javax.swing.GroupLayout(addBtn);
        addBtn.setLayout(addBtnLayout);
        addBtnLayout.setHorizontalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        addBtnLayout.setVerticalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 130, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, 20));

        userLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel7.setText("TIPO DE CONTACTO");
        bg.add(userLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesor", "Estudiante", "Empleado" }));
        jComboBox1.setBorder(null);
        bg.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 160, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 210, 20));

        addressLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        addressLabel.setText("DIRECCIÓN");
        bg.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        addresTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        addresTxt.setForeground(new java.awt.Color(204, 204, 204));
        addresTxt.setText("Dirección");
        addresTxt.setBorder(null);
        addresTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addresTxtMousePressed(evt);
            }
        });
        addresTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresTxtActionPerformed(evt);
            }
        });
        bg.add(addresTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 170, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 160, 20));

        lastNameLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lastNameLabel.setText("APELLIDOS");
        bg.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lastNameTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lastNameTxt.setForeground(new java.awt.Color(204, 204, 204));
        lastNameTxt.setText("Ingrese el apellido");
        lastNameTxt.setBorder(null);
        lastNameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lastNameTxtMousePressed(evt);
            }
        });
        bg.add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 210, 20));

        numLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        numLabel.setText("NÚMERO TL");
        bg.add(numLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        numTextField.setBorder(null);
        numTextField.setForeground(new java.awt.Color(204, 204, 204));
        numTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        numTextField.setText("Ingrese N°");
        numTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        numTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numTextFieldMousePressed(evt);
            }
        });
        numTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTextFieldActionPerformed(evt);
            }
        });
        bg.add(numTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 170, 30));
        numTextField.getAccessibleContext().setAccessibleName("");

        idLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        idLabel.setText("DOCUMENTO ID");
        bg.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        tipeIdComboBox.setEditable(true);
        tipeIdComboBox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tipeIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C", "T.I", "Pasapórte extrajero", "NIT" }));
        tipeIdComboBox.setBorder(null);
        bg.add(tipeIdComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 30));

        idTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idTxt.setForeground(new java.awt.Color(204, 204, 204));
        idTxt.setText("Ingrese el numero");
        idTxt.setBorder(null);
        idTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idTxtMousePressed(evt);
            }
        });
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        bg.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 210, 20));

        nameLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        nameLabel.setText("NOMBRE");
        bg.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        nameTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(204, 204, 204));
        nameTxt.setText("Ingrese el nombre ");
        nameTxt.setBorder(null);
        nameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameTxtMousePressed(evt);
            }
        });
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        bg.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 210, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 160, 20));

        dateLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        dateLabel.setText("FECHA DE NACIMIENTO");
        bg.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        dateTextField.setBorder(null);
        dateTextField.setForeground(new java.awt.Color(204, 204, 204));
        dateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateTextField.setText("MM/DD/YY");
        dateTextField.setToolTipText("");
        dateTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dateTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateTextFieldMousePressed(evt);
            }
        });
        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });
        bg.add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 210, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 170, 20));

        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Móvil", "Telefono", "Oficina" }));
        jComboBox2.setBorder(null);
        bg.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 160, 30));
        jComboBox2.getAccessibleContext().setAccessibleParent(bg);

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void addBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxtMouseEntered
        addBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_addBtnTxtMouseEntered

    private void addBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxtMouseExited
        addBtn.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_addBtnTxtMouseExited

    private void addBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxtMouseClicked
        DaoStudentUse studentDao = DaoStudentUse.getInstance();
        ListW listwindow =  ListW.getInstance();
        
        
        Contact student = new Contact(nameTxt.getText(),lastNameTxt.getText(),addresTxt.getText(),numTextField.getText(),jComboBox2.getSelectedItem().toString(),idTxt.getText(),dateTextField.getText(),jComboBox1.getSelectedItem().toString());
        studentDao.addStudent(student);
        studentDao.saveStudentsExternally(student);
        listwindow.addLits(nameTxt.getText(),lastNameTxt.getText(),idTxt.getText(),dateTextField.getText(),jComboBox1.getSelectedItem().toString(), numTextField.getText(),jComboBox1.getSelectedItem().toString(),addresTxt.getText(),student.getCodeId());
        listwindow.setVisible(true);
        
        
    }//GEN-LAST:event_addBtnTxtMouseClicked

    private void idTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idTxtMousePressed
        // TODO add your handling code here:
         idTxt.setText("");
         idTxt.setForeground(Color.black);
    }//GEN-LAST:event_idTxtMousePressed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void lastNameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameTxtMousePressed
        // TODO add your handling code here:
        lastNameTxt.setText("");
        lastNameTxt.setForeground(Color.black);
    }//GEN-LAST:event_lastNameTxtMousePressed

    private void numTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTextFieldActionPerformed

    private void nameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTxtMousePressed
        // TODO add your handling code here:
        nameTxt.setText("");
        nameTxt.setForeground(Color.black);
    }//GEN-LAST:event_nameTxtMousePressed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void addresTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresTxtActionPerformed

    private void addresTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addresTxtMousePressed
        // TODO add your handling code here:
        addresTxt.setText("");
        addresTxt.setForeground(Color.black);
    }//GEN-LAST:event_addresTxtMousePressed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void dateTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTextFieldMousePressed
        // TODO add your handling code here:
        dateTextField.setText("");
        dateTextField.setForeground(Color.black);
    }//GEN-LAST:event_dateTextFieldMousePressed

    private void numTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numTextFieldMousePressed
        // TODO add your handling code here:
        numTextField.setText("");
        numTextField.setForeground(Color.black);
    }//GEN-LAST:event_numTextFieldMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Menu menu=   Menu.getInstance();
        menu.setVisible(true);
        Add add = Add.getInstance();
        add.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBtn;
    private javax.swing.JLabel addBtnTxt;
    private javax.swing.JTextField addresTxt;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JFormattedTextField dateTextField;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel numLabel;
    private javax.swing.JFormattedTextField numTextField;
    private javax.swing.JComboBox<String> tipeIdComboBox;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel7;
    // End of variables declaration//GEN-END:variables
}
