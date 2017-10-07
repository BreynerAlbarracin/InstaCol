package DataBase;

import control.BaseDatos;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;

/**
 *
 * @author Usaka Rokujou
 */
public class Insercion {

    //<editor-fold defaultstate="collapsed" desc="Usuario">
    /**
     * Metodo para insertar un usuario a la base de datos
     *
     * @param nombre
     * @param apellido
     * @param correo
     * @param clave
     * @param fecha
     * @param idusuario
     * @return estado regresa el estado de la conexión, true si se logro
     * insertar el usuario, falso en caso contrario.
     */
    public static boolean sqlInsertUsuario(String nombre, String apellido, String correo, String clave, String fecha, int idusuario) {

        String sql;

        if (Conexion.crearConexion()) {
            PreparedStatement ps = null;
            try {
                System.out.println(nombre + "\n" + apellido + "\n" + correo + "\n" + clave + "\n" + fecha + "\n" + idusuario + "\n");

                sql = "insert into usuarios "
                        + "(nombre_usuario,"
                        + "apellido_usuario,"
                        + "correo,"
                        + "clave,"
                        + "fecha_nacimiento) "
                        + "values(?,?,?,?,?)";

                Conexion.getConexion().setAutoCommit(false);
                ps = Conexion.getConexion().prepareStatement(sql);
                ps.setString(1, nombre);
                ps.setString(2, apellido);
                ps.setString(3, correo);
                ps.setString(4, clave);
                ps.setString(5, fecha);

                ps.executeUpdate();
                Conexion.getConexion().commit();

                return true;
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);

            } finally {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Perfil">
    public static boolean sqlInsertPerfil(String nombre, Image fotoPerfil, FileInputStream fis, File imagen, int codUsuario) {

        String sql;

        if (Conexion.crearConexion()) {
            PreparedStatement ps = null;
            try {
                System.out.println(nombre + "\n" + codUsuario + "\n");

                sql = "insert into perfil "
                        + "(nombre_perfil,"
                        + "foto_perfil,"
                        + "cod_usuario) "
                        + "values(?,?,?,?)";

                Conexion.getConexion().setAutoCommit(false);
                ps = Conexion.getConexion().prepareStatement(sql);
                ps.setString(1, nombre);
                ps.setBinaryStream(2, fis, (int) imagen.length());
                ps.setInt(3, codUsuario);

                ps.executeUpdate();
                Conexion.getConexion().commit();

                return true;
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);

            } finally {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

//</editor-fold>
}
