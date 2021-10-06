package com.ceep.domain;


public class Orden {
    private final int idOrden;
    Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras;
    
    
    public Orden(){
        Orden.contadorOrdenes = 0;
        computadoras = new Computadora[Orden.maxComputadoras];
        this.idOrden = ++Orden.contadorOrdenes;
    }

    
    public void agregarComputadora (Computadora computadora){
    
        if (Orden.contadorComputadoras < Orden.maxComputadoras){
            computadoras[Orden.contadorComputadoras++] = computadora;
        }
    }
    
    
}
