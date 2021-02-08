/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Dell
 */
public class License {
    private String licensenumber,dateissued,dateexpiration,bloodtype, picture;

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

    public String getDateissued() {
        return dateissued;
    }

    public void setDateissued(String dateissued) {
        this.dateissued = dateissued;
    }

    public String getDateexpiration() {
        return dateexpiration;
    }

    public void setDateexpiration(String dateexpiration) {
        this.dateexpiration = dateexpiration;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
