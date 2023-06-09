/**
 * @author Guia Cruz Fabian Neftaly
 * @author Rico Bernal Fatima Sofia
 * @author Sanchez Gutierrez Haide
**/

package com.nintech.veterinaria;

public class Loro extends Mascota {
    private String[] colores;
    private boolean vuela;
    private boolean canta;
    private double constoConsulta = 300;

    public Loro(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, int prioridad, String[] colores, boolean vuela, boolean canta) {
        super(clave, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad);
        this.colores = colores;
        this.vuela = vuela;
        this.canta = canta;
    }

    public String getColores() {
        String colores = "";
        for (int i = 0; i < this.colores.length; i++) {
            colores += this.colores[i] + "-";
        }
        return colores;
    }

    public boolean isVuela() {
        return vuela;
    }

    public boolean isCanta() {
        return canta;
    }

    public double getCostoConsulta() {
        return constoConsulta;
    }

    public void setCostoConsulta(Double constoConsulta) {
        this.constoConsulta = constoConsulta;
    }
}
