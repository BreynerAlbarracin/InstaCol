package modelo;

import java.io.File;

/**
 *
 * @author Usaka Rokujou
 */
public class Perfil {

    String nombrePerfil;
    int idPerfil, codUsuario;
    Imagen fotoPerfil;

    public Perfil(String nombrePerfil, int idPerfil, int codUsuario, Imagen fotoPerfil) {
        this.nombrePerfil = nombrePerfil;
        this.idPerfil = idPerfil;
        this.codUsuario = codUsuario;
        this.fotoPerfil = fotoPerfil;
    }

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
