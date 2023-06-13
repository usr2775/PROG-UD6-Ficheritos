package actividades.actividad2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ActividadDos {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("actividad2.txt");
            FileReader fileReader = new FileReader("actividad2.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String texto = "Hola Mundo";
            bufferedWriter.write(texto);
            bufferedWriter.close();


            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    char c = linea.charAt(i);
                    System.out.print(c + "_" + (int)c + ",");
                }
                System.out.println();
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error al leer fichero");
        }
    }
}
