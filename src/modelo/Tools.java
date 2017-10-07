package modelo;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Usaka Rokujou
 */
public class Tools {

    public static void imprimirJ(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void imprimirC(String mensaje) {
        System.out.println(mensaje);
    }

    public static void ordenamiento() {

    }

    public static void busqueda() {

    }

    private static void ordenamientoAsc() {

    }

    private static void ordenamientoDesc() {

    }

    private static void busquedaRec() {

    }

    public byte[] convertirImagenAByte(String ImageName) {

        try {
            File archivo = new File(ImageName);
            BufferedImage bufferedImage = ImageIO.read(archivo);

            WritableRaster raster = bufferedImage.getRaster();
            DataBufferByte data = (DataBufferByte) raster.getDataBuffer();

            return (data.getData());
        } catch (IOException ex) {
            imprimirC(ex.getMessage());
        }
    }
}
