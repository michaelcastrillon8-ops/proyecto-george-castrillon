/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author micha
 */
public class Historial {

    private String fecha;
    private String descripcion;

    public Historial(String fecha,String descripcion){
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String mostrar(){
        return fecha+" - "+descripcion;
    }
}


