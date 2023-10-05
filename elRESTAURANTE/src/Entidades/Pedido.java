
package Entidades;

import java.sql.Date;


public class Pedido {
    
    int idPedido;
    int idMesa;
    int idMesero;
    int idProducto;
    Date fecha;
    boolean estado;

    public Pedido(int idMesa, int idMesero, int idProducto, Date fecha, boolean estado) {
        this.idMesa = idMesa;
        this.idMesero = idMesero;
        this.idProducto = idProducto;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Pedido() {
    }

    public Pedido(int idMesa, int idMesero) {
        this.idMesa = idMesa;
        this.idMesero = idMesero;
    }

    public Pedido(int idPedido, int idMesa, int idMesero, int idProducto, java.util.Date fecha, boolean estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
           
    
    
    
}
