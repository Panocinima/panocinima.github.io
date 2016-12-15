package clientPackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.*;

/**
 * Created by Ayettey on 24/11/2016.
 */

@ManagedBean(name = "login" ,eager = true)
@RequestScoped
public class Login {



    private String emailAndPhone;
    private String secretPassword;

    public void setEmailAndPhone(String emailAndPhone) {
        this.emailAndPhone = emailAndPhone;
    }

    public void setSecretPassword(String secretPassword) {
        this.secretPassword = secretPassword;
    }



    public String getEmailAndPhone() {
        return emailAndPhone;
    }

    public String getSecretPassword() {
        return secretPassword;
    }


    public String login(){


        int count=0;

        try {

            Connection connection=null;
            PreparedStatement statement=null;

         if(!emailAndPhone.equals("")){


                Class.forName("com.mysql.jdbc.Driver");

                System.out.println("Connecting.....");
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/panocinimaclientdatabase", "root", "0000");
                String sql="SELECT*FROM clientaccountDatabase";
                statement=connection.prepareStatement(sql);


                ResultSet result=statement.executeQuery();
                while (result.next()){

                    final String phoneAndEmail=getEmailAndPhone();
                    final String ID=getSecretPassword();

                    if(phoneAndEmail.equals(result.getString("EmailAndPhone")) && ID.equals(result.getString("SecretPassword"))){
                       return "clientAccount";
                    }else return "invalid";




                }
                System.out.println("USer  :"+secretPassword);
                System.out.println("success.....");
         }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


     return "";
    }


    public static void main(String [] arg){
        new Login();

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
