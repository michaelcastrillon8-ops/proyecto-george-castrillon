/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author micha
 */
public class ArchivoManager {

    public static void guardar(String archivo, String texto) {

        try {

            FileWriter fw = new FileWriter(archivo, true);

            fw.write(texto + "\n");

            fw.close();

        } catch (IOException e) {

            System.out.println("Error al guardar archivo");

        }

    }

}