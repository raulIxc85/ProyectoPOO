/*
    Clase para mantenimiento de entidades
 */
package Clases;

import Conexion_DB.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raul
 */
public class Entidad {
     
    public Entidad(){
                
    }
    
    Connection con=null;
    Conexion conex_DB = new Conexion();
    
    public void sql_IngresarActualizarEntidad(String descr,int anio, int cod) throws SQLException{
        con=conex_DB.conectar();
        CallableStatement procAlmacenado=con.prepareCall("{ call sp_IngresarActualizarEntidad(?,?,?)} ");
   
        procAlmacenado.setString(1,descr);
        procAlmacenado.setInt(2,anio);
        procAlmacenado.setInt(3,cod);
        procAlmacenado.execute();
        conex_DB.desconectar();
        con.close();
    }
    public void sql_EliminarEntidad(int codigo) throws SQLException{
        con=conex_DB.conectar();
        CallableStatement procEliminar=con.prepareCall("{ call sp_EliminarEntidad(?)} ");
   
        procEliminar.setInt(1,codigo);
        procEliminar.execute();
        conex_DB.desconectar();
        con.close();
    }
    public void ConsultaEntidad(JTable tabla) throws SQLException {
        con=conex_DB.conectar();
        String [] Encabezados = {"Codigo","Descripcion","Año Inicio"};
        DefaultTableModel modelo = new DefaultTableModel(null,Encabezados);
        tabla.setModel(modelo);   
        CallableStatement procConsulta=con.prepareCall("{ call sp_ConsultaEntidad()}");
        ResultSet rs = procConsulta.executeQuery();
            while (rs.next()){
                Object[] fila = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
        rs.close();
        conex_DB.desconectar();
        con.close();
    }
   
}
