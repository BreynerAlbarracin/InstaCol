package modelo;

/**
 *
 * @author Usaka Rokujou
 */
public class Perfil extends herramientas.Objeto{

    String nombrePerfil;
    int idPerfil, codUsuario;
    Imagen fotoPerfil;

    /**
     * Contructor que permite crear un perfil con una imagen asignada
     *
     * @param nombrePerfil
     * @param idPerfil
     * @param codUsuario
     * @param fotoPerfil
     */
    public Perfil(String nombrePerfil, int idPerfil, int codUsuario, Imagen fotoPerfil) {
        this.nombrePerfil = nombrePerfil;
        this.idPerfil = idPerfil;
        this.codUsuario = codUsuario;
        this.fotoPerfil = fotoPerfil;
    }

    /**
     * Contructor que permite agregar un perfil sin imagen asignada
     *
     * @param nombrePerfil
     * @param idPerfil
     * @param codUsuario
     */
    public Perfil(String nombrePerfil, int idPerfil, int codUsuario) {
        this.nombrePerfil = nombrePerfil;
        this.idPerfil = idPerfil;
        this.codUsuario = codUsuario;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
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

    public Imagen getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(Imagen fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

}
