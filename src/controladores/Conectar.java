/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PERROS Y GATOS
 */
public class Conectar {
Conecction conect = null;
public Conecction conexion()
{
    try{
        //cargamos driver mysql
        Class.forName("org.gjt.mm.mysql.Driver");
        conect = (Conecction) DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
        JOptionPane.showMessageDialog(null, "Conexión correcta", "Alert", JOptionPane.ERROR_MESSAGE);

    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error"+e);
        JOptionPane.showMessageDialog(null, "Error Conexión", "Alert", JOptionPane.ERROR_MESSAGE);
    }
    return conect;
    }

    private static class Conecction {

        public Conecction() {
        }
    }
}
