package date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ayettey on 16/11/2016.
 */

@ManagedBean(name = "dayMonthYear")
@SessionScoped
public class DayMonthYears  {

    public String day;
    public String month;
    public ArrayList<Integer> year;

    public void setYear() {
        year=new ArrayList<>();
        for(int i=0; i<2080;i++){
            year.add(1940+i);
        }
    }

    public ArrayList<Integer> getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.valueOf(year);
    }


    public  static void main(String [] agr){
        DayMonthYears d=new DayMonthYears();
        d.setYear();
        for(int i=1;i<d.year.size();i++)
        System.out.println(d.year.get(i));
    }
}
