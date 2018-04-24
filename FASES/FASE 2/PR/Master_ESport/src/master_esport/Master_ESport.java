/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master_esport;

import Views.AltaJugador;
import Views.Consultas;

/**
 *
 * @author Pistach
 */
public class Master_ESport {

    /**
     * @param args the command line arguments
     */
    private static Consultas vM;
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Consultas().setVisible(true);
    }
    
    
    public static void reabrirVentanaInicio() {
        abrirConsultas(vM);
    }

}
