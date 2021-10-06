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

    public Computadora() {
    
    }
    
    
    private int idComputadora;
    private String nombre;
    Monitor monitor[];
    Teclado teclado[];
    Raton Raton[];

    public Computadora(Monitor monitor,Teclado teclado,Raton Raton){

        this.monitor = monitor;
        this.teclado = teclado;
        this.Raton = Raton;

    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor[] getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor[] monitor) {
        this.monitor = monitor;
    }

    public Teclado[] getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado[] teclado) {
        this.teclado = teclado;
    }

    public Raton[] getRaton() {
        return Raton;
    }

    public void setRaton(Raton[] Raton) {
        this.Raton = Raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", monitor=" + monitor + ", teclado=" + teclado + ", Raton=" + Raton + '}';
    }

}
