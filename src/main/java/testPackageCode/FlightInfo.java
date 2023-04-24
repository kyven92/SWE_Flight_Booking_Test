package testPackageCode;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author venky
 */
public class FlightInfo {
    
    private int flightId;
    private String flightNumber;
    private String flightName;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private Integer seats;
    private Integer fare;
    
    
    public FlightInfo (String flightNumber, String origin, String destination, String departureTime, String arrivalTime, int capacity) {
       this.flightNumber = flightNumber;
       this.origin = origin;
       this.destination = destination;
       this.departureTime = departureTime;
       this.arrivalTime = arrivalTime;
   }
    
    
   public void setflightNumber(String flightNumber) {
       this.flightNumber = flightNumber;
   }
   
   public String getflightNumber() {
       return flightNumber;
       
   }
   
   public String getorigin() {
       return origin;
   }
  
   public void setorigin(String origin) {
       this.origin = origin;
   }
   
   public String getDestination() {
       return destination;
   }
  
   public void setDestination(String destination) {
       this.destination = destination;
   }

}
