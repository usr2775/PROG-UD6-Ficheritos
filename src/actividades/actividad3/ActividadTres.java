package actividades.actividad3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ActividadTres {
    public static void main(String[] args) {

        try (BufferedReader brUno = new BufferedReader(new FileReader("actividad1.txt"));
             BufferedReader brDos = new BufferedReader(new FileReader("actividad2.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("resultado.txt"))) {

            String linea;
            bw.write("Contenido del Fichero Uno:\n");
            while ((linea = brUno.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            bw.write("\nContenido del Fichero Dos:\n");
            while ((linea = brDos.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            bw.write("\nFusión de ficheros completada por Chibuike Miracle Nnoruka\\n\"");
        } catch (IOException e) {
            System.err.format("Error al fusionar los archivos los ficheros", e);
        }
    }
}
