/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import Business.UserAccount.UserAccount;


public class DeliveryMan {
    private String deliveryManName;
    private UserAccount userAccount;

    private Customer custDetails;
    
    public DeliveryMan(){
        userAccount = new UserAccount();
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
      public Customer getCustDetails() {
        return custDetails;
    }

    public void setCustDetails(Customer custDetails) {
        this.custDetails = custDetails;
    }
    
    @Override
    public String toString(){
        return deliveryManName;
    }
}
