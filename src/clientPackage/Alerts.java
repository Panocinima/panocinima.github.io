package clientPackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.util.Vector;

/**
 * Created by Ayettey on 21/11/2016.
 */


public class Alerts {





    protected String messageDialog;
    protected String messageContent="<h:link   onclick =\"alert('Providing')\"/>";


    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }




    public String getMessageDialog() {
        messageDialog=messageContent;
        return  messageDialog;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
