
package Entidades;

public class Mesa {
    
    int idMesa;
    int capacidad;
    boolean diponibilidad;
    boolean atendida;



    public Mesa(int capacidad, boolean diponibilidad, boolean atendida) {
        this.capacidad = capacidad;
        this.diponibilidad = diponibilidad;
        this.atendida = atendida;
    }

    public Mesa(int capacidad) {
        this.capacidad = capacidad;
    }

    public Mesa() {
    }

    public Mesa(int idMesa, int capacidad, boolean disponibilidad, boolean atendida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponibilidad() {
        return diponibilidad;
    }

    public void setDisponibilidad(boolean diponibilidad) {
        this.diponibilidad = diponibilidad;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }
    
    
    
    
    
}
