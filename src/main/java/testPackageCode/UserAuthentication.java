package testPackageCode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author venky
 */
public class UserAuthentication {
    
   private String userID;
   private String userName;
   private String userPassword;
   private String userEmail;
   private String userPhone;
   private String userAddress;
   private String secretKey = "secretKey"; //for encryption and decryption for data protection
    

   public UserAuthentication(String userID, String userName, String userEmail, String userPhone, String userAddress) {
       this.userID = userID;
       this.userName = userName;
       this.userEmail = userEmail;
       this.userPhone = userPhone;
       this.userAddress = userAddress;
   }




public String get_userEmail() {
   return this.userEmail;  
}


public void set_userEmail(String userEmail) {
   this.userEmail = userEmail;
}



public void set_userPhone(String userPhone) {
   this.userPhone = userPhone;
   

}



public void set_userPassword(String userPassword) {
   this.userPassword = userPassword;
}


public boolean validate(String attemptuserID, String attemptuserPassword) {
   if (attemptuserID.equals(userID) && attemptuserPassword.equals(userPassword)) {
       return true;
   } else {
       return false;
   }
}

}
