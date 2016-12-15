package message;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Created by Ayettey on 30/11/2016.
 */

@ManagedBean(name = "user",eager = true)
@RequestScoped
public class login implements Serializable {
    final float ID=1f;

    private String userName;
    private String userPassword;


    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public float getID() {
        return ID;
    }


    public String login() {
        if (userName.equals("") && userPassword.equals("")) {
            return "invalid";
        } else
            return "output";
    }

}
