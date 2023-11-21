/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package view;
/**
 *
 * @author tokyo
 */
import java.awt.Color;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.border.Border;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.plaf.ComboBoxUI;

public class NoBorderComboBoxUI extends BasicComboBoxUI {

    protected void installDefaults() {
        super.installDefaults();
        comboBox.setBorder(null);
    }

    public void paint(Graphics g, JComponent c) {
        g.setColor(Color.WHITE); // Establece el color de fondo blanco
        g.fillRect(0, 0, c.getWidth(), c.getHeight()); // Dibuja el fondo blanco
        super.paint(g, c);
    }

    public static ComboBoxUI createUI(JComponent c) {
        return new NoBorderComboBoxUI();
    }
}
