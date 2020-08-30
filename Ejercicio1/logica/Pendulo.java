/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


public class Pendulo {

    private double longitud;
    private double aceleracion;

    public Pendulo(double longitud, double aceleracion) {
        this.longitud = longitud;
        this.aceleracion = aceleracion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    public double periodo(){
        double periodo;
        periodo = 2*Math.PI*Math.sqrt(aceleracion/longitud);
        return periodo;
    }
    
    public double frecuencia(){
        return 1/periodo();
    }

}
