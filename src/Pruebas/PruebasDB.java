package Pruebas;

import herramientas.Tools;
import modelo.Usuario;

/**
 *
 * @author Usaka Rokujou
 */
public class PruebasDB {

    public static void main(String... arg) {

    }

    //<editor-fold defaultstate="collapsed" desc="Pruebas de insercion">
    public void insertarUsuario() {
        Tools.imprimirC("" + DataBase.Insercion.sqlInsertUsuario(new Usuario("Breyner", "Albarracin", "basfv@sfitvbrs", "jaja", "1997/09/09")));
    }

    public void insertarPerfil() {

    }

    public void insertarIma() {

    }

    public void insertarComen() {

    }
    //</editor-fold>
}
