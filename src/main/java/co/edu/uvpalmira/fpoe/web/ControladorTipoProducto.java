package co.edu.uvpalmira.fpoe.web;

import co.edu.uvpalmira.fpoe.persistencia.entidades.TipoProducto;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import jakarta.inject.Named;
/**
 *
 * @author ramir
 */
@Named (value = "controladorTP")
@SessionScoped
public class ControladorTipoProducto implements Serializable {
    
    private TipoProducto tipoProducto = new TipoProducto("prueba",10);

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }
      
    public void cancelar(){
        this.tipoProducto = new TipoProducto();
        FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage("Formulario Borrado")
        );
    }
}
