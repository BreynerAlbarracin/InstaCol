package modelo;

import java.awt.Image;
import java.io.File;

/**
 *
 * @author rodrigoescobarlopez
 */
public class Imagen {

    private Image imagen;
    private int id, meGusta, codImagenPerfil;
    private String ruta;
    private File archivo;

    public Imagen(Image imagen, int id, int megusta, int codImagenPerfil) {
        this.imagen = imagen;
        this.id = id;
        this.meGusta = megusta;
        this.codImagenPerfil = codImagenPerfil;
    }

    public Imagen(int id, int meGusta, int codImagenPerfil, String ruta) {
        this.id = id;
        this.meGusta = meGusta;
        this.codImagenPerfil = codImagenPerfil;
        this.ruta = ruta;
        archivo = new File(ruta);
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getCodImagenPerfil() {
        return codImagenPerfil;
    }

    public void setCodImagenPerfil(int codImagenPerfil) {
        this.codImagenPerfil = codImagenPerfil;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "imagen{" + "imagen=" + imagen + ", id=" + id + ", megusta=" + meGusta + ", codimagen_Perfil=" + codImagenPerfil + '}';
    }
}
