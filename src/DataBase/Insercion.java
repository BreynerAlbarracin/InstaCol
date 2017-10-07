package DataBase;

import control.BaseDatos;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import modelo.Perfil;
import modelo.Usuario;

/**
 *
 * @author Usaka Rokujou
 */
public class Insercion {

    //<editor-fold defaultstate="collapsed" desc="Usuario">
    /**
     * Metodo para insertar un usuario a la base de datos La fecha debe tener el
     * formato (AAAA/MM/DD)
     *
     * @param nombre
     * @param apellido
     * @param correo
     * @param clave
     * @param fecha
     * @return estado regresa el estado de la conexión, true si se logro
     * insertar el usuario, falso en caso contrario.
     */
    public static boolean sqlInsertUsuario(Usuario usuario) {

        String sql;

        if (Conexion.crearConexion()) {
            PreparedStatement ps = null;
            try {
                System.out.println(usuario.toString());

                sql = "insert into usuarios "
                        + "(nombre_usuario,"
                        + "apellido_usuario,"
                        + "correo,"
                        + "clave,"
                        + "fecha_nacimiento) "
                        + "values(?,?,?,?,?)";

                Conexion.getConexion().setAutoCommit(false);
                ps = Conexion.getConexion().prepareStatement(sql);

                ps.setString(1, usuario.getNombre());
                ps.setString(2, usuario.getApellido());
                ps.setString(3, usuario.getCorreo());
                ps.setString(4, usuario.getClave());
                ps.setString(5, usuario.getFecha());

                ps.executeUpdate();
                Conexion.getConexion().commit();

                return true;
            } catch (SQLException ex) {
                modelo.Tools.imprimirC(ex.getMessage());
            } finally {
                try {
                    ps.close();
                } catch (SQLException | NullPointerException ex) {
                    modelo.Tools.imprimirC(ex.getMessage());
                }
            }
        }
        return false;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Perfil Con Imagen">
    /**
     * Metodo que permite insertar un perfil INCLUIDA LA IMAGEN
     *
     * @param nombre
     * @param fotoPerfil
     * @param imagen
     * @param codUsuario
     * @return retorna true si la inserción fue correcta, y false si hubo algun
     * error
     */
    public static boolean sqlInsertPerfil(Perfil perfil) {

        String sql;

        if (Conexion.crearConexion()) {
            PreparedStatement ps = null;
            try {

                modelo.Tools.imprimirC(perfil.toString());

                sql = "insert into perfil "
                        + "(nombre_perfil,"
                        + "foto_perfil,"
                        + "cod_usuario) "
                        + "values(?,?,?,?)";

                Conexion.getConexion().setAutoCommit(false);
                ps = Conexion.getConexion().prepareStatement(sql);
                ps.setString(1, perfil.getNombre());
                ps.setBinaryStream(2, new FileInputStream(perfil.getImagen()), (int) perfil.getImagen().length());
                ps.setInt(3, perfil.getCodUsuario());

                ps.executeUpdate();
                Conexion.getConexion().commit();

                return true;
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    ps.close();
                } catch (SQLException | NullPointerException ex) {
                    modelo.Tools.imprimirC(ex.getMessage());
                }
            }
        }
        return false;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Perfil Sin Imagen">
    /**
     * Permite insertar un perfil con una imagen
     *
     * @param nombre
     * @param codUsuario
     * @return
     */
    public static boolean sqlInsertPerfilIMG(Perfil perfil) {

        String sql;

        if (Conexion.crearConexion()) {
            PreparedStatement ps = null;
            try {
                System.out.println(perfil.toString());

                sql = "insert into perfil "
                        + "(nombre_perfil,"
                        + "cod_usuario) "
                        + "values(?,?)";

                Conexion.getConexion().setAutoCommit(false);
                ps = Conexion.getConexion().prepareStatement(sql);
                ps.setString(1, perfil.getNombre());
                ps.setInt(2, perfil.getCodUsuario());

                ps.executeUpdate();
                Conexion.getConexion().commit();

                return true;
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);

            } finally {
                try {
                    ps.close();
                } catch (SQLException | NullPointerException ex) {
                    modelo.Tools.imprimirC(ex.getMessage());
                }
            }
        }
        return false;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="comentario">
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="imagen">
//</editor-fold>
}
