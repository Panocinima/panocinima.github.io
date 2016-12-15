package message;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.Facelet;
import java.awt.event.ActionEvent;

/**
 * Created by Ayettey on 28/11/2016.
 */

@ManagedBean(name = "warn",eager = true)
@RequestScoped
public class Warnings {

    public void warning(ActionEvent e){
     messenger("warn");
    }

    public void messenger(String message){
        FacesMessage message1=new FacesMessage(FacesMessage.SEVERITY_ERROR,message,null);
        FacesContext.getCurrentInstance().addMessage(null,message1);
    }

}
