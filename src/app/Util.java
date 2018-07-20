/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Component;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Elvis
 */
public class Util {
    
    
    public static Date getDate(String d){
        d = d.replaceAll("/", "");
        int ano = (Integer.parseInt(d.substring(4, 8))) - 1900;
        int mes = (Integer.parseInt(d.substring(2, 4))) - 1;
        int dia = (Integer.parseInt(d.substring(0, 2)));
        
        Date data = new Date(ano, mes, dia);
        return data;
    }
    
    public static String getDateString(Date date){
        if(date == null)
            return "esta data está vazia";
        String data = date.toString();
        data = data.replaceAll("-", "");
        String ano = data.substring(0, 4);
        String mes = data.substring(4, 6);
        String dia = data.substring(6, 8);
       
        data = dia+mes+ano;
        return data;
    }
    
    public static Float imc(float peso, float altura){
        return peso/(altura*altura);
    }
    
    public static Float rcq(float cintura, float quadril){
        return cintura/quadril;
    }
    
     public static void bloquearCampos(JPanel p){
         
         for (int i=0; i < p.getComponentCount(); i++) { //For para todos os componentes do Panel 
             System.out.println(p.getComponentCount());
                 Component c = p.getComponent(i);   
                 if (c instanceof JTextField) {  //Verificação da instanacia do componente 
                      JTextField field = (JTextField) c;   
                      System.out.println("app.Util.bloquearCampos()");
                      field.setEditable(false);  
                  }else if(c instanceof JFormattedTextField) {   
                      JFormattedTextField field = (JFormattedTextField) c;   
                      field.setEditable(false);  
                  }else if(c instanceof JComboBox){
                      JComboBox combo = (JComboBox) c;   
                      combo.setEnabled(false);
                  }else if(c instanceof JScrollPane) {
                      for (int j=0; j < ((JScrollPane) c).getComponentCount(); j++) {
                          Component a = p.getComponent(i);
                          if (a instanceof JTextArea) {  //Verificação da instanacia do componente
                              JTextArea field = (JTextArea) a;
                              field.setEditable(false);
                          }
                      }
                      
                  }
                 
         } 
    }
    
}
