/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;


public class Restaurant {
    private String restaurentName;
    private String restaurentManager;
    private Long phoneNumber;
    private String address;
    private ArrayList<String> menulist;
    
    private UserAccount userAccount;
    
    public Restaurant(){
        userAccount = new UserAccount();
    }

    public String getRestaurentName() {
        return restaurentName;
    }

    public void setRestaurentName(String restaurentName) {
        this.restaurentName = restaurentName;
    }

    public String getRestaurentManager() {
        return restaurentManager;
    }

    public void setRestaurentManager(String restaurentManager) {
        this.restaurentManager = restaurentManager;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public ArrayList<String> getMenulist() {
        return menulist;
    }

    public void setMenulist(ArrayList<String> menulist) {
        this.menulist = menulist;
    }
    
    
    @Override
    public String toString(){
        return restaurentName;
    }
}
