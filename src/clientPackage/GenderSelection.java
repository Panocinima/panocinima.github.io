package clientPackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Ayettey on 12/12/2016.
 */

@ManagedBean (name = "gender" ,eager = true)
@RequestScoped
public class GenderSelection {

    public String gender[]=new String[2];

    public String male= gender[0]="Male";
    public String getMale() {

        return male;
    }

    public String female= gender[0]="Male";
    public String getFemale() {
       return female;

    }

    public void setGender(String[] gender) {
        gender = gender;
    }
}
