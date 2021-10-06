/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author Alumno Mañana
 */
public class Computadora {

    private final int idComputadora;
    String nombre;
    Monitor monitor[];
    Teclado teclado[];
    Raton raton[];

    public Computadora(String Nombre, Monitor, Teclado, Raton){

        this.nombre = Nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;

    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

}
