
package tiendaumg.kevin.oliva.pkg9960.pkg19.pkg2073;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class conexionBD {
    public String url = "jdbc:postgresql://207.244.255.8:5432/estudiantes";
    public String usuario = "usuario_prueba";
    public String password = "1234";
    Connection conexion = null;
    
    //conectar la bd 
    public conexionBD(){
        try{
        Class.forName("org.postgresql.Driver");
        conexion = DriverManager.getConnection(url, usuario, password);
        JOptionPane.showMessageDialog(null, "Base de datos conectada");
        
    }catch(Exception e){
      JOptionPane.showMessageDialog(null, "ERROR DE CONEXION: " + e.getMessage()); 
    }
    }
    
    //resultset para mandar las consultas sql
    public ResultSet consulta(String sql){
        ResultSet res = null;
        try {
            PreparedStatement sentencia=conexion.prepareStatement(sql);
            res = sentencia.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion "+ e);
        }
        return res;
            
    }
    //obtener el listado de los productos que hay en la base de datos
    public DefaultComboBoxModel obtener_lista(){
        DefaultComboBoxModel listado = new DefaultComboBoxModel();
        listado.addElement("Seleccione un producto");
        ResultSet res = this.consulta("SELECT * FROM productos ORDER BY cod_prod");
       //SELECT * FROM productos ORDER BY cod_prod
        try {
            while(res.next()){
                listado.addElement(res.getString("nom_prod"));
            }
            res.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return listado;
    }
}
