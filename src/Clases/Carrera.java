/*
Clase mantenimiento de carreras
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
public class Carrera {
    
    public Carrera(){
    
    }
    Connection con=null;
    Conexion conex_DB = new Conexion();
    
    public void sql_IngresarActualizarCarrera(String descr,String tiempo,int anio, int modalidad, int codEnt, int codigoCa) throws SQLException{
        con=conex_DB.conectar();
        CallableStatement procAlmacenado=con.prepareCall("{ call sp_IngresarActualizarCarrera(?,?,?,?,?,?)} ");
   
        procAlmacenado.setString(1,descr);
        procAlmacenado.setString(2,tiempo);
        procAlmacenado.setInt(3,anio);
        procAlmacenado.setInt(4,modalidad);
        procAlmacenado.setInt(5, codEnt);
        procAlmacenado.setInt(6, codigoCa);
        procAlmacenado.execute();
        conex_DB.desconectar();
        con.close();
    }
     public void sql_EliminarCarrera(int codigo) throws SQLException{
        con=conex_DB.conectar();
        CallableStatement procEliminar=con.prepareCall("{ call sp_EliminarCarrera(?)} ");
   
        procEliminar.setInt(1,codigo);
        procEliminar.execute();
        conex_DB.desconectar();
        con.close();
    }
    public void ConsultaCarrera(JTable tabla) throws SQLException {
        con=conex_DB.conectar();
        String [] Encabezados = {"Codigo","Descripcion","Duracion","Año Creacion"};
        DefaultTableModel modelo = new DefaultTableModel(null,Encabezados);
        tabla.setModel(modelo);   
        CallableStatement procConsulta=con.prepareCall("{ call sp_ConsultaCarrera()}");
        ResultSet rs = procConsulta.executeQuery();
            while (rs.next()){
                Object[] fila = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
        rs.close();
        conex_DB.desconectar();
        con.close();
    }
}
