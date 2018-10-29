/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion_DB.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author raul
 */
public class cmbModalidad {
    Connection con=null;
    Conexion conex_DB = new Conexion();
    private String datoItem1;
    private String codigoItem1;
    
    public cmbModalidad(String dato1,String cod1){
        this.datoItem1=dato1;
        this.codigoItem1=cod1;
    }
    public cmbModalidad(){
        
    }
    
    public String getCodigo() {
        return codigoItem1;
    }
    
     public void LLenarComboModalidad(JComboBox<cmbModalidad> combo) throws SQLException {
        con=conex_DB.conectar();
       
        CallableStatement procConsulta=con.prepareCall("{call sp_Modalidad()}");
        ResultSet rs = procConsulta.executeQuery();
            
           while (rs.next()) {
               
               combo.addItem(new cmbModalidad(rs.getString(1),rs.getString(2)));
               
            }
         
        rs.close();
        conex_DB.desconectar();
        con.close();
    }
 
    public String toString() {
        return datoItem1;
        
    }
}
