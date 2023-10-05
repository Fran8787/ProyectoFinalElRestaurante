
package Entidades;

import java.sql.Date;


public class Cobro {
    int idCobro;
    int idPedido;
    int idMesero;
    int idMesa;
    Date fecha;

    public Cobro(int idPedido, int idMesero, int idMesa, Date fecha, int total) {
        this.idPedido = idPedido;
        this.idMesero = idMesero;
        this.idMesa = idMesa;
        this.fecha = fecha;
        this.total = total;
    }
    int total;

    public Cobro() {
    }

    public Cobro(int idCobro, int idPedido, int idMesero, int idMesa, java.util.Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cobro(int idPedido, int idMesero, int total) {
        this.idPedido = idPedido;
        this.idMesero = idMesero;
        this.total = total;
    }

    public int getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(int idCobro) {
        this.idCobro = idCobro;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    
    
    
    
    
    
    
}
