
package Entidades;


public class Mesero {
    private int idMesero;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    private boolean estado;

   

    public Mesero() {
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mesero(String nombre, String apellido, String usuario, String contraseña, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
    }

      
}