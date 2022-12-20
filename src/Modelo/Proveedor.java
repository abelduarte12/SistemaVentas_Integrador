
package Modelo;

public class Proveedor extends Persona{
  
    private int ruc;
    private int telefono;
    private String direccion;
    private String razon;
    
    public Proveedor(){
    }

    public Proveedor(int ruc, int telefono, String direccion, String razon) {
        
        this.ruc = ruc;
        this.telefono = telefono;
        this.direccion = direccion;
        this.razon = razon;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    
    
    
    
}
