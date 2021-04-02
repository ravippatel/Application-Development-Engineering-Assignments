/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;


public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(String name, UserAccount userAccount){
        DeliveryMan d = new DeliveryMan();
        d.setDeliveryManName(name);
        d.setUserAccount(userAccount);
        deliveryManList.add(d);  
        return d;
    }
    
    public void deleteDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManList.remove(deliveryMan);
    }
}
