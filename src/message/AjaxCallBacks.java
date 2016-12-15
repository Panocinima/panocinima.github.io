package message;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Ayettey on 28/11/2016.
 */
@ManagedBean(name = "Agax",eager = true)
@RequestScoped
public class AjaxCallBacks {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getWelcomeMessage(){
        return "Welcome Back " +name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
