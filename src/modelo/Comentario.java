package modelo;

/**
 *
 * @author Usaka Rokujou
 */
public class Comentario {

    String mensaje;
    int idComentario, codPerfilComen, codImagenComen;

    public Comentario(String mensaje, int idComentario, int codPerfilComen, int codImagenComen) {
        this.mensaje = mensaje;
        this.idComentario = idComentario;
        this.codPerfilComen = codPerfilComen;
        this.codImagenComen = codImagenComen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public int getCodPerfilComen() {
        return codPerfilComen;
    }

    public void setCodPerfilComen(int codPerfilComen) {
        this.codPerfilComen = codPerfilComen;
    }

    public int getCodImagenComen() {
        return codImagenComen;
    }

    public void setCodImagenComen(int codImagenComen) {
        this.codImagenComen = codImagenComen;
    }

}
