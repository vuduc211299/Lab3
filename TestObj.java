/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tuan3;

/**
 *
 * @author VŨ ĐỨC
 */
public class TestObj {
    public static void main(String[] args){
    
    }
}

// Class Teacher
class Teacher{
    private String name ;
    private String address;
    private String phone;
    private String Email;
    private String subject;  
    
    // Get name of Teacher
    public String getName(){return name;}
    
    // Get address of Teacher
    public String getAddress(){return address;}
    
    // Get phone of Teacher
    public String getPhone(){return phone;}
    
    // Get Email of Teacher
    public String getEmail(){return Email;}
    
    // Get Subject of teacher
    public String getSubject(){return subject;}
    
    // Set name of Teacher 
    public void setName(String name){this.name = name;}
    
     // Set address of Teacher 
    public void setAddress(String address){this.address = address;}

     // Set phone of Teacher 
    public void setPhone(String phone){this.phone = phone;}

     // Set Email of Teacher 
    public void setEmail(String Email){this.Email = Email;}

     // Set subject of Teacher 
    public void setSubject(String subject){this.subject = subject;}
}

class Student{
    private String name;
    private String address;
    private String ID;
    private String phone;
    private String Email;
    
     // Get name of Student
    public String getName(){return name;}
    
    // Get address of Student
    public String getAddress(){return address;}
    
    // Get phone of Student
    public String getPhone(){return phone;}
    
    // Get Email of Student
    public String getEmail(){return Email;}
    
    // Get ID of Student
    public String getID(){return ID;}
    
    // Set name of Student 
    public void setName(String name){this.name = name;}
    
     // Set address of Student 
    public void setAddress(String address){this.address = address;}

     // Set phone of Student 
    public void setPhone(String phone){this.phone = phone;}

     // Set Email of Student 
    public void setEmail(String Email){this.Email = Email;}

     // Set ID of Student 
    public void setId(String ID){this.ID = ID;}
}