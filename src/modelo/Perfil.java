package modelo;

/**
 *
 * @author Usaka Rokujou
 */
public class Perfil {

    String nombrePerfil;
    Imagen fotoPerfil;
    int idPerfil, codUsuario;

    public Perfil(String nombre, Imagen foto_perfil, int idPerfil, int codUsuario) {
        this.nombrePerfil = nombre;
        this.fotoPerfil = foto_perfil;
        this.idPerfil = idPerfil;
        this.codUsuario = codUsuario;
    }

    public String getNombre() {
        return nombrePerfil;
    }

    public void setNombre(String nombre) {
        this.nombrePerfil = nombre;
    }

    public Imagen getFoto_perfil() {
        return fotoPerfil;
    }

    public void setFoto_perfil(Imagen foto_perfil) {
        this.fotoPerfil = foto_perfil;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

}
