/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Date;

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
    
}
