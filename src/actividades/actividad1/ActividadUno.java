package actividades.actividad1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActividadUno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingresa un texto con al menos 30 caracteres:");
            String textoIngresado = br.readLine();

            while (textoIngresado.length() < 30) {
                System.out.println("El texto debe tener al menos 30 caracteres.");
                System.out.println("Faltan " + (30 - textoIngresado.length()) + " caracteres.");
                textoIngresado = br.readLine();
            }

            String formateoTexto = textoIngresado.toUpperCase().replace(" ", "_");

            FileWriter ejercicio1 = new FileWriter("actividad1.txt");
            BufferedWriter buffer = new BufferedWriter(ejercicio1);

            buffer.write(formateoTexto);
            buffer.close();

            System.out.println("Texto guardado en el fichero correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el texto en el fichero.");
        }
    }
}
