/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainForm;

import view.Menu;

/**
 *
 * @author tokyo
 */
public class Form {
    public static void main(String[] args) {
//        Model model = new Model();
//        Controller gameController = Controller.getInstance(model);
        Menu menu=Menu.getInstance();
        menu.setVisible(true);          
        System.out.println("Menú principal mostrado");
    }
    
    
    
    
}
