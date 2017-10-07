package modelo;

import herramientas.Objeto;

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

    /**
     * Metodo que realiza un clonado del perfil actual con foto
     *
     * @return clon del objeto actual
     */
    @Override
    public Objeto clon() {
        return new Perfil(nombrePerfil, idPerfil, codUsuario, fotoPerfil);
    }

    /**
     * Metodo que permite comprar dos perfiles por su id
     *
     * @param obj
     * @return returna 0 si son iguales, 1 si obj es menor o -1 si obj es mayor
     */
    @Override
    public int igual(Objeto obj) {
        Perfil p = (Perfil) obj;

        if (idPerfil > p.getIdPerfil()) {
            return 1;
        } else if (idPerfil < p.getIdPerfil()) {
            return -1;
        }
        return 0;
    }
}
