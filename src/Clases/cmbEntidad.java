/*
Clase para llenar combobox Entidades en el formulario Carreras
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
public class cmbEntidad {
   
    Connection con=null;
    Conexion conex_DB = new Conexion();
    private String datoItem;
    private String codigoItem;
    
    public cmbEntidad(String datoI,String codI){
        this.datoItem=datoI;
        this.codigoItem=codI;
    }
    
    public cmbEntidad (){
        
    }
    
    public String getCodigo() {
        return codigoItem;
    }
    
     public void LLenarComboEntidad(JComboBox<cmbEntidad> combo) throws SQLException {
        con=conex_DB.conectar();
       
        CallableStatement procConsulta=con.prepareCall("{ call sp_Entidad()}");
        ResultSet rs = procConsulta.executeQuery();
            
           while (rs.next()) {
               
               combo.addItem(new cmbEntidad(rs.getString(1),rs.getString(2)));
               
            }
         
        rs.close();
        conex_DB.desconectar();
        con.close();
    }
 
    public String toString() {
        return datoItem;
        
    }
    
}
