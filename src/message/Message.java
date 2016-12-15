package message;

/**
 * Created by Ayettey on 09/11/2016.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name ="message",eager = true)
@RequestScoped
public class Message {

  public String messenger;

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }

    public String getMessenger() {
        return messenger;
    }

}
