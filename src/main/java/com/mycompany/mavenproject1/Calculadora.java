
package com.mycompany.mavenproject1;

import java.util.ArrayList;


public class Calculadora {
    private int numero1;
    private int numero2;  
    private double resultado;
    private String operacion;
    private ArrayList<Integer> numeros;
    private ArrayList<String> operaciones;
    
    public Calculadora(){
        numero1=0;
        numero2=0;
        resultado=0;
        operacion="";       
        numeros = new ArrayList<Integer>();
        operaciones = new ArrayList<String>();
    }
    
    public int obtenerNumero(int index){
        return numeros.get(index);
    }
    
    public String obtenerOperacion(int index){
        return operaciones.get(index);
    }
     
    public void agregarNumero(int num){
        numeros.add(num);
    }
    
    public void agregarOperacion(String op){
        operaciones.add(op);
    }
    
    public void vaciarListas(){
        numeros.clear();
        operaciones.clear();
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public ArrayList getNumeros(){
        return numeros;
    }
    
    public ArrayList getOperaciones(){
        return operaciones;
    }
    
     
}
