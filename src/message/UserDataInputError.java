package message;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 * Created by Ayettey on 30/11/2016.
 */

@ManagedBean(name = "error",eager = true)
@RequestScoped
@SessionScoped
public class UserDataInputError {

    @ManagedProperty(value ="#{Agax}")


    AjaxCallBacks userInput;
    String watchUserInput;

    public void setUserInput(AjaxCallBacks userInput) {
        this.userInput = userInput;
    }

    public void setWatchUserInput(String watchUserInput) {
        this.watchUserInput = watchUserInput;
    }

    public AjaxCallBacks getUserInput() {
        return userInput;
    }

    public String getWatchUserInput() {
        return watchUserInput;
    }

    public String userError(){
        watchUserInput=userInput.getName();
        if(watchUserInput.equals("")){

            return "output";
        }else{

           return watchUserInput;
        }



    }

    @Override
    public String toString() {
        return super.toString();
    }
}
