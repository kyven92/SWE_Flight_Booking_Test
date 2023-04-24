/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackageCode;

/**
 *
 * @author venky
 */
public class Seats {
    
   private int capacity;
   private int numPassengers;
    
    
     public Seats(int capacity) {
       this.capacity = capacity;
       this.numPassengers = 0;
   }




   public int getNumPassengers() {
       return numPassengers;
   }


   public boolean isFull() {
       return numPassengers == capacity;
   }


   public void bookSeat() {
       if (!isFull()) {
           numPassengers++;
       }
   }


   public int getCapacity() {
       return capacity;
   }
  
   public void setCapacity(int capacity) {
       this.capacity = capacity;
   }
  
   public void setnumPassengers(int numPassengers) {
       this.numPassengers = numPassengers;
   }

    
}