package message;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
/**
 * Created by Ayettey on 09/11/2016.
 */

@ManagedBean(name = "helloWorld",eager = true)
@RequestScoped
public class HelloWorld {
    @ManagedProperty(value = "#{message}")
   public Message messageBean;
    public String message;


    public String getMessage() {
        messageBean.setMessenger("Hello World");
        if(messageBean!=null){
            message=messageBean.getMessenger();
        }
        return message;
    }

    public void setMessageBean(Message messageBean) {
        this.messageBean = messageBean;
    }
    public static void main(String[]ags){
        HelloWorld call=new HelloWorld();
       System.out.println(call.getMessage());
    }
}

