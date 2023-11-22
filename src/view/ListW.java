/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tokyo
 */
public class ListW extends javax.swing.JFrame {
        DefaultTableModel dtm = new DefaultTableModel();
        private static ListW instance = null;
        int xMouse, yMouse;
    /**
     * Creates new form ListWindow
     */
    public ListW() {
        initComponents();
        String[] title = new String []{"Nombre y Apellidos","ID documento","Fecha de Nacimiento","Tipo de Contacto","Número de Teléfono","Tipo de Teléfono","Dirección","Numero ID"};
        dtm.setColumnIdentifiers(title);
        jTable1.setModel(dtm);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
        Class<?> columnClass = jTable1.getColumnClass(i);
        jTable1.setDefaultEditor(columnClass, null);
}
                
        }
    public void delete(int fila){ 
        dtm.removeRow(fila);
    
    }
    public void addLits(String name,String lastname,String idcod,String date,String typeC,String phoneN,String typeP,String addres,int ID){
        dtm.addRow(new Object[]{name + " " +lastname,idcod,date,typeC,phoneN,typeP,addres,ID});        
    }
    
    public static ListW getInstance() {
        if (instance == null) {
            instance = new ListW();
        }
        return instance;
    }
     
    public DefaultTableModel getTableModel() {
        return dtm;
    } 
    
    public void deleteById(int id) {
        for (int i = 0; i < dtm.getRowCount(); i++) {
            if ((int) dtm.getValueAt(i, dtm.getColumnCount() - 1) == id) {
                dtm.removeRow(i);
                break; // Salir del bucle una vez que se encuentra y elimina la fila
            }
        }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        studentBtn = new javax.swing.JPanel();
        studentBtnTxt = new javax.swing.JLabel();
        allBtn = new javax.swing.JPanel();
        allBtnTxt = new javax.swing.JLabel();
        teacherBtn = new javax.swing.JPanel();
        teacherBtnTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        title.setText("Listar Contacto");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        studentBtn.setBackground(new java.awt.Color(0, 134, 190));

        studentBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        studentBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        studentBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentBtnTxt.setText("Estudiantes");
        studentBtnTxt.setToolTipText("");
        studentBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        studentBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout studentBtnLayout = new javax.swing.GroupLayout(studentBtn);
        studentBtn.setLayout(studentBtnLayout);
        studentBtnLayout.setHorizontalGroup(
            studentBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(studentBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(studentBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        studentBtnLayout.setVerticalGroup(
            studentBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(studentBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(studentBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(studentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 130, 40));

        allBtn.setBackground(new java.awt.Color(0, 134, 190));

        allBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        allBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        allBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allBtnTxt.setText("Todos");
        allBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        allBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                allBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                allBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout allBtnLayout = new javax.swing.GroupLayout(allBtn);
        allBtn.setLayout(allBtnLayout);
        allBtnLayout.setHorizontalGroup(
            allBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(allBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(allBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(allBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        allBtnLayout.setVerticalGroup(
            allBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(allBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(allBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(allBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(allBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 130, 40));

        teacherBtn.setBackground(new java.awt.Color(0, 134, 190));

        teacherBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        teacherBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        teacherBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacherBtnTxt.setText("Profesor");
        teacherBtnTxt.setToolTipText("");
        teacherBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        teacherBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout teacherBtnLayout = new javax.swing.GroupLayout(teacherBtn);
        teacherBtn.setLayout(teacherBtnLayout);
        teacherBtnLayout.setHorizontalGroup(
            teacherBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(teacherBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(teacherBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(teacherBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        teacherBtnLayout.setVerticalGroup(
            teacherBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(teacherBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(teacherBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(teacherBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(teacherBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 130, 40));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 1110, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void teacherBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherBtnTxtMouseClicked
        
    }//GEN-LAST:event_teacherBtnTxtMouseClicked

    private void teacherBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherBtnTxtMouseEntered
        teacherBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_teacherBtnTxtMouseEntered

    private void teacherBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherBtnTxtMouseExited
        teacherBtn.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_teacherBtnTxtMouseExited

    private void studentBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentBtnTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentBtnTxtMouseClicked

    private void studentBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_studentBtnTxtMouseEntered

    private void studentBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_studentBtnTxtMouseExited

    private void allBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allBtnTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_allBtnTxtMouseClicked

    private void allBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_allBtnTxtMouseEntered

    private void allBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_allBtnTxtMouseExited

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allBtn;
    private javax.swing.JLabel allBtnTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel studentBtn;
    private javax.swing.JLabel studentBtnTxt;
    private javax.swing.JPanel teacherBtn;
    private javax.swing.JLabel teacherBtnTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
