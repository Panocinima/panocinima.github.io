package message;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Ayettey on 26/11/2016.
 */
@ManagedBean(name = "case1" , eager =true)
@RequestScoped
public class case2 {
    String me;
    String tell="Love";

    public String getMe() {
        return me;
    }

    public String getTell() {
        return tell;
    }
}
