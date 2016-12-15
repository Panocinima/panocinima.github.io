package clientPackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

/**
 * Created by Ayettey on 30/11/2016.
 */
@ManagedBean(name = "errors",eager = true)
@RequestScoped
public class RegistrationErrors {

    @ManagedProperty(value ="#{register}")
    Register getUserInputMessage;

    private String errors;
    private boolean isFemale;
    private boolean isMale;

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public String getErrors() {
        return errors;
    }

    public String MainErrors() {
        ArrayList<String>getInformation=new ArrayList<>();


        getInformation.add(getUserInputMessage.getFirstName());
        getInformation.add(getUserInputMessage.getSurname());
        getInformation.add(getUserInputMessage.getEmailOrMobileNumber());
        getInformation.add(getUserInputMessage.getSecretID());
        getInformation.add(getUserInputMessage.getReenterSecretID());
        getInformation.add(getUserInputMessage.getDay());
        getInformation.add(getUserInputMessage.getMonth());
        getInformation.add(getUserInputMessage.getYear());

        isFemale=getUserInputMessage.getIsFemale();
        isMale=getUserInputMessage.getIsMale();

        for(int i=0;i<getInformation.size();i++){
            if(getInformation.get(i).equals("")){
                return "invalid";
            }else
                return "output";
        }

        if (isFemale==false){
            return "invalid";
        }else return "output";




    }

}
