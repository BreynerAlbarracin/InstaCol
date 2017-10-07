package modelo;

import herramientas.Objeto;
import java.awt.Image;
import java.io.File;

/**
 *
 * @author rodrigoescobarlopez
 */
public class Imagen extends herramientas.Objeto {

    private Image imagen;
    private int id, meGusta, codImagenPerfil;
    private String ruta;
    private File archivo;

    /**
     * Contrusctor de la clase
     *
     * @param imagen
     * @param id
     * @param megusta
     * @param codImagenPerfil
     */
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

    /**
     * Metodo que realiza un clonado de la imagen actual
     *
     * @return clon del objeto actual
     */
    @Override
    public Objeto clon() {
        return new Imagen(imagen, id, meGusta, codImagenPerfil);
    }

    /**
     * Metodo que permite comprar dos imagenes por su ID
     *
     * @param obj
     * @return returna 0 si son iguales, 1 si obj es menor o -1 si obj es mayor
     */
    @Override
    public int igual(Objeto obj) {
        Imagen i = (Imagen) obj;

        if (id > i.getId()) {
            return 1;
        } else if (id < i.getId()) {
            return -1;
        }
        return 0;
    }
}
