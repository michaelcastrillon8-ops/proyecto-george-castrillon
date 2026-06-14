/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Cita {

    private String fecha;
    private String motivo;

    public Cita(String fecha, String motivo) {
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public String mostrar() {
        return fecha + " - " + motivo;
    }
}
