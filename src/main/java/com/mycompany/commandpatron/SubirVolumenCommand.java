/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.commandpatron;

/**
 *
 * @author itsme
 */
public class SubirVolumenCommand implements Command {

    private Television tv;

    public SubirVolumenCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void ejecutar() {
        tv.subirVolumen();
    }

}
