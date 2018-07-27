/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.LoginControlador;
import fachada.Fachada;
import sql.SQLConnection;
import sql.SQLUtil;
import view.LoginJFrame;

/**
 *
 * @author Insinuante
 */
public class Projeto_GYM {

    /**
     * @param args the command line arguments
     */
    public static Fachada fachada = Fachada.getInstance();
    
    public static void main(String[] args) {
        Util.atualizarMensalidades();
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
        new LoginControlador(login);
        
    }
    
}
