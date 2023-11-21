package view;

import dao.DaoStudentUse;
import java.awt.Color;
import model.Student;

public class Menu extends javax.swing.JFrame {
    ListWindow listwindow =  ListWindow.getInstance();
    DaoStudentUse studentDao = DaoStudentUse.getInstance();
    int xMouse, yMouse;
    
    public Menu() {
        initComponents();    
        for (int i = 1; i <= 4; i++) {
        Student studentById = studentDao.getStudent(i);
        if (studentById != null) {      
        String name = studentById.getName();
        listwindow.addLits(name, studentById.getLastName(), studentById.getDocumentId(), studentById.getDate(),
                name, studentById.getPhoneNumber(), studentById.getTypePhone(), studentById.getAddres());
        } else {
        System.out.println("No se encontró ningún estudiante con ID: " + i);
        }   
      }
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        updateBtn = new javax.swing.JPanel();
        updateBtnTxt1 = new javax.swing.JLabel();
        listBtn = new javax.swing.JPanel();
        listBtnTxt = new javax.swing.JLabel();
        addBtn1 = new javax.swing.JPanel();
        addBtnTxt2 = new javax.swing.JLabel();
        deleteBtn1 = new javax.swing.JPanel();
        deleteBtnTxt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/logo.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 290, 140));

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("SECRETARIA UNIVALLE");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 250, 290, 20));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/city.png"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 0, -1, 500));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("Bienvenidos al directorio");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

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
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 794, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/favicon.png"))); // NOI18N
        favicon.setText("UNIVALLE");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        updateBtn.setBackground(new java.awt.Color(0, 134, 190));

        updateBtnTxt1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        updateBtnTxt1.setForeground(new java.awt.Color(255, 255, 255));
        updateBtnTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateBtnTxt1.setText("Actualizar");
        updateBtnTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        updateBtnTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(updateBtnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(updateBtnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 130, 40));

        listBtn.setBackground(new java.awt.Color(0, 134, 190));

        listBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        listBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        listBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listBtnTxt.setText("Listar");
        listBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout listBtnLayout = new javax.swing.GroupLayout(listBtn);
        listBtn.setLayout(listBtnLayout);
        listBtnLayout.setHorizontalGroup(
            listBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(listBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        listBtnLayout.setVerticalGroup(
            listBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(listBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(listBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 130, 40));

        addBtn1.setBackground(new java.awt.Color(0, 134, 190));

        addBtnTxt2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        addBtnTxt2.setForeground(new java.awt.Color(255, 255, 255));
        addBtnTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtnTxt2.setText("Agregar");
        addBtnTxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addBtnTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnTxt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnTxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnTxt2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout addBtn1Layout = new javax.swing.GroupLayout(addBtn1);
        addBtn1.setLayout(addBtn1Layout);
        addBtn1Layout.setHorizontalGroup(
            addBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(addBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addBtn1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addBtnTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        addBtn1Layout.setVerticalGroup(
            addBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(addBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addBtn1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addBtnTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(addBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 130, 40));

        deleteBtn1.setBackground(new java.awt.Color(0, 134, 190));

        deleteBtnTxt1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        deleteBtnTxt1.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtnTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteBtnTxt1.setText("Eliminar");
        deleteBtnTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteBtnTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout deleteBtn1Layout = new javax.swing.GroupLayout(deleteBtn1);
        deleteBtn1.setLayout(deleteBtn1Layout);
        deleteBtn1Layout.setHorizontalGroup(
            deleteBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(deleteBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteBtn1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteBtnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        deleteBtn1Layout.setVerticalGroup(
            deleteBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(deleteBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteBtn1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteBtnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(deleteBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void listBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBtnTxtMouseEntered
       listBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_listBtnTxtMouseEntered

    private void listBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBtnTxtMouseExited
        listBtn.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_listBtnTxtMouseExited

    private void listBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBtnTxtMouseClicked
        ListWindow listwindow =  ListWindow.getInstance();
        listwindow.setVisible(true);
    }//GEN-LAST:event_listBtnTxtMouseClicked

    private void updateBtnTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnTxt1MouseClicked

    private void updateBtnTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxt1MouseEntered
        // TODO add your handling code here:
        updateBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_updateBtnTxt1MouseEntered

    private void updateBtnTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxt1MouseExited
        // TODO add your handling code here:
        updateBtn.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_updateBtnTxt1MouseExited

    private void addBtnTxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxt2MouseClicked
        // TODO add your handling code here:
        Addwindows addwindow = Addwindows.getInstance();
        addwindow.setVisible(true);
         
        
    }//GEN-LAST:event_addBtnTxt2MouseClicked

    private void addBtnTxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxt2MouseEntered
        // TODO add your handling code here:
        addBtn1.setBackground(new Color(0, 156, 223));
         
    }//GEN-LAST:event_addBtnTxt2MouseEntered

    private void addBtnTxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxt2MouseExited
        // TODO add your handling code here:
         addBtn1.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_addBtnTxt2MouseExited

    private void deleteBtnTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxt1MouseClicked
        // TODO add your handling code here:
        DeleteWindow delete = DeleteWindow.getInstance();
        delete.setVisible(true);
    }//GEN-LAST:event_deleteBtnTxt1MouseClicked

    private void deleteBtnTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxt1MouseEntered
        // TODO add your handling code here:
        deleteBtn1.setBackground(new Color(0, 156, 223));
       
    }//GEN-LAST:event_deleteBtnTxt1MouseEntered

    private void deleteBtnTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxt1MouseExited
        // TODO add your handling code here:
        deleteBtn1.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_deleteBtnTxt1MouseExited

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBtn1;
    private javax.swing.JLabel addBtnTxt2;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel deleteBtn1;
    private javax.swing.JLabel deleteBtnTxt1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JPanel listBtn;
    private javax.swing.JLabel listBtnTxt;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoname;
    private javax.swing.JLabel title;
    private javax.swing.JPanel updateBtn;
    private javax.swing.JLabel updateBtnTxt1;
    // End of variables declaration//GEN-END:variables
}
