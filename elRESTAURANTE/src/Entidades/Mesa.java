
package Entidades;

public class Mesa {
    
    int idMesa;
    int capacidad;
    boolean disponible;
    boolean atendida;



    public Mesa(int capacidad, boolean disponible, boolean atendida) {
        this.capacidad = capacidad;
        this.disponible = disponible;
        this.atendida = atendida;
    }

    public Mesa(int capacidad) {
        this.capacidad = capacidad;
    }

    public Mesa() {
    }

    public Mesa(int idMesa, int capacidad, boolean disponible, boolean atendida) {
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

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean getAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }
    
    
    
    
    
}
