/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pytfinal;

import vistas.MDImenuprincipal;
import vistas.frmlogin;

/**
 *
 * @author yendri
 */
public class PYTfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // abrir la ventana del login
        frmlogin login=new frmlogin();
        //lo  muestro
        login.setVisible(true);
        
        MDImenuprincipal loMDImenuprincipal=new MDImenuprincipal();
        loMDImenuprincipal.setVisible(true);
        
                }
    
    
   
}
