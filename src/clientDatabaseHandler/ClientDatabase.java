package clientDatabaseHandler;

import clientPackage.Register;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by Ayettey on 11/12/2016.
 */
@ManagedBean (name ="clientDatabase",eager = true)
@RequestScoped
public class ClientDatabase implements Serializable{
    public Register message=new Register();
    public String firstName;
    private String surname;
    private String emailOrMobileNumber;
    private String secretID;
    private String reenterSecretID;
    private String day;
    private String month;
    private String year;
    private String dateOfBirth;
    private String gender;


    private boolean isMale;
    private boolean isFemale;



}
