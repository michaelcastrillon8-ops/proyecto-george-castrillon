/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author micha
 */
import java.util.ArrayList;

public class Cliente extends Persona {

    private int id;
    private ArrayList<Mascota> mascotas;

    public Cliente(int id, String nombre, String telefono){
        super(nombre, telefono);
        this.id = id;
        mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    public int getId(){
    return id;
}

    public ArrayList<Mascota> getMascotas(){
        return mascotas;
    }
}

