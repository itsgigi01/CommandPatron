/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.commandpatron;

/**
 *
 * @author itsme
 */
public class CommandPatron {

    public static void main(String[] args) {
        
        Television tv = new Television(); 
        
        Command encender = new EncenderCommand(tv); 
        Command apaga = new EncenderCommand(tv); 
        Command bajarVolumen = new BajarVolumenCommand(tv); 
        Command subirVolumen = new SubirVolumenCommand(tv); 
        Command cambio = new CambiarCanalCommand(tv);
        
        
        // print 
        encender.ejecutar();
        apaga.ejecutar();
        bajarVolumen.ejecutar();
        subirVolumen.ejecutar();
        cambio.ejecutar();
        
    }
}
