/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


public class Ascensor {
    private int numeroPisos;
    private int numeroSotanos;
    private int pisoActual;
    
    public Ascensor(int numeroPisos, int numeroSotanos) {
        this.numeroPisos = numeroPisos;
        this.numeroSotanos = numeroSotanos;
        this.pisoActual = 1;
    }
    
    public int siguientePiso(){
        if(pisoActual<numeroPisos){
            if(pisoActual==-1){
                pisoActual=1;
            }else{
                pisoActual++;
            }
           return pisoActual;
        }
        return pisoActual;
    }
    
    public int pisoAnterior(){
        if(pisoActual>numeroSotanos*-1){
            if(pisoActual==1){
                pisoActual=-1;
            }else{
                pisoActual--;
            }
           return pisoActual;
        }
        return pisoActual;
    }
    
    public int cantidadPisos(){
        return numeroPisos+numeroSotanos;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroSotanos() {
        return numeroSotanos;
    }

    public void setNumeroSotanos(int numeroSotanos) {
        this.numeroSotanos = numeroSotanos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }
 
}
