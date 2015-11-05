
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CalculadoraBean {
    
    private Calculadora cal = new Calculadora();
    //private ArrayList<Integer> temp=new ArrayList();
    
    public void agregarNumero(int num){
        cal.getNumeros().add(num);
    }
    
    public void agregarOperacion(int op){
        if(op==0)
        cal.agregarOperacion("+");
        else if(op==1)
        cal.agregarOperacion("-");
        else if(op==2)
        cal.agregarOperacion("*");
        else if(op==3)
        cal.agregarOperacion("/");
    }
    
    public double obtenerResultado(){
        return cal.getResultado();
    }
    
    public void limpiarCalculadora(){
        cal.vaciarListas();
    }
    
    public void calcular(){
        double resTemp=cal.obtenerNumero(0);
        for(int cont=0;cont<cal.getOperaciones().size();cont++){
            switch (cal.obtenerOperacion(cont)) {
            case "+":
               resTemp=resTemp+cal.obtenerNumero(cont+1);
               cal.setResultado(resTemp);
               break;
            case "-":
               resTemp-=resTemp-cal.obtenerNumero(cont+1);
               cal.setResultado(resTemp);
               break;
            case "*":
               resTemp=resTemp * cal.obtenerNumero(cont+1);
               cal.setResultado(resTemp);
               break;
            case "/":
               resTemp=resTemp / cal.obtenerNumero(cont+1);
               cal.setResultado(resTemp);
               break;
            default:
              System.out.println("error");
              break;
            }
        }
     
    }
        
    public Calculadora getCal() {
        return cal;
    }

    public void setCal(Calculadora cal) {
        this.cal = cal;
    }
   
}
