
package com.mycompany.mavenproject1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CalculadoraBean {
    
    public Calculadora cal = new Calculadora();
    
    public Calculadora getCal() {
        return cal;
    }

    public void setCal(Calculadora cal) {
        this.cal = cal;
    }
    
    public void agregarNumero(int num1){
        if(cal.getNumero1()==0){
            cal.setNumero1(num1);
        }
        else
            cal.setNumero2(num1);   
    }
    public void agregarOperacion(int op){
        if(op==0)
        cal.setOperacion("+");
        else if(op==1)
        cal.setOperacion("-");
        else if(op==2)
        cal.setOperacion("*");
        else if(op==3)
        cal.setOperacion("/");
    }
    
    public double obtenerResultado(){
        return cal.getResultado();
    }
    
    public void calcular(){
     switch ( cal.getOperacion() ) {
      case "+":
          cal.setResultado(cal.getNumero1()+cal.getNumero2());
           break;
      case "-":
          cal.setResultado(cal.getNumero1()-cal.getNumero2());
           break;
      case "*":
          cal.setResultado(cal.getNumero1()*cal.getNumero2());
           break;
      case "/":
          cal.setResultado(cal.getNumero1()/cal.getNumero2());
           break;
      default:
           System.out.println("error" );
           break;
      }
     
    }
   
}
