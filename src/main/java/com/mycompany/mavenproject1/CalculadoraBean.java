
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
    
    public void calcular(int n1, int n2, String op){
        cal.setNumero1(n1);
        cal.setNumero2(n2);
        cal.setOperacion(op);
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
