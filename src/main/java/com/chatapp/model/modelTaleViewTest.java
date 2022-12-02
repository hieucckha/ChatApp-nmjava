package com.chatapp.model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class modelTaleViewTest {
    private SimpleStringProperty _UserName;
    private  SimpleStringProperty _name;

    private  SimpleStringProperty _address;

    private SimpleStringProperty _dob;
    private SimpleStringProperty _email;
    private SimpleStringProperty _sex;





    public modelTaleViewTest(String userName, String name, String address,String dob,String sex,String email)  {
        this._UserName=new SimpleStringProperty(userName);
        this._name=new SimpleStringProperty(name);
        this._address=new SimpleStringProperty(address);
        this._dob=new SimpleStringProperty(dob);
        this._sex=new SimpleStringProperty(sex);
        this._email=new SimpleStringProperty(email);



    }


    public String getName() {
        return _name.get();
    }

    public void setName(String name) {
        this._name = new SimpleStringProperty(name);
    }

    public String getAddress() {
        return _address.get();
    }


    public void setAddress(String _address) {
        this._address=new SimpleStringProperty(_address);
    }

    public String getUserName() {
        return _UserName.get();
    }

    public void setUserName(String userName) {
        this._UserName =new SimpleStringProperty( userName);
    }




    public String getDob() {
        return _dob.get();
    }

    public void setDob(String dob) {
        this._dob = new SimpleStringProperty(dob);
    }

    public String getSex() {
        return _sex.get();
    }

    public void setSex(String sex) {
        this._sex =new SimpleStringProperty(sex);
    }

    public String getEmail() {
        return _email.get();
    }

    public void setEmail(String email) {
        this._email = new SimpleStringProperty(email);
    }

}
