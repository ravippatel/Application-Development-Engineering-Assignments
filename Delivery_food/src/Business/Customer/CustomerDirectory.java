/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(String name, String address, long phoneNumber, UserAccount userAccount){
        Customer c = new Customer();
        c.setCustName(name);
        c.setCustAddress(address);
        c.setCustPhoneNumber(phoneNumber);
        c.setUserAccount(userAccount);
        customerList.add(c);  
        return c;
    }
    
     public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
    }
    
    
}
