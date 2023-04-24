/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackageCode;

/**
 *
 * @author venky
 */
public class Payment {
    


    private String paymentId;
    private String ticketId;
    private String status;
    
    public Payment(){
        this.paymentId="";
        this.ticketId="";
        this.status="";
    }
    
    
    public boolean setPaymentId(String paymentId){
        if ("".equals(paymentId)){
            return false;
        }else{
            return true;
        }
        
    }
    
    public String getPaymentId(){
        return this.paymentId;
    }
    
    public boolean setTicketId(String ticketId){
        if ("".equals(ticketId)){
            return false;
        }else{
            return true;
        }
        
    }
    
    public String getTicketId(){
        return this.ticketId;
    }
    
    public boolean setStatus(String status){
        if ("".equals(status)){
            return false;
        }else{
            return true;
        }
        
    }
    
    public String getStatus(){
        return this.status;
    }
    
    
    


}
