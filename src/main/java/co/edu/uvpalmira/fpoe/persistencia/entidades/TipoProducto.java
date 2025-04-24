package co.edu.uvpalmira.fpoe.persistencia.entidades;

/**
 *
 * @author ramir
 */
public class TipoProducto {
   
    private String descripcion;
    private float porcentajeIva;
    
    public TipoProducto(){
    }

    public TipoProducto(String descripcion, float porcentajeIva) {
        this.descripcion = descripcion;
        this.porcentajeIva = porcentajeIva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPorcentajeIva() {
        return porcentajeIva;
    }
    
}
