/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tokyo
 */

public class Student {
    private static int id;
    private int idCode;
    private String name;
    private String lastName;
    private int documentId;
    private String addres;
    private int phoneNumber;
    private String typePhone;
    private String date;
     
    public Student(String name,String lastname,String addres,int phoneNumber,String typePhone,int documentId,String date) {
        id++;
        this.idCode = id;
        this.name = name;
        this.lastName = lastname;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
        this.typePhone = typePhone;
        this.documentId = documentId;
        this.date= date;  
        System.out.println("studiante creado");
    } 
    
    
    public String getName(){ 
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
      
    public String getLastName(){  
        return lastName;
    }
    
    public void setLastName(String lastname){ 
        this.lastName = lastname;
    }
     
    public String getAddres(){
        return addres;
    }
    
    public void setAddres(String addres){
        this.addres = addres;   
    }
    
    public int getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getTypePhone(){
        return typePhone;
    }
    
    public void setTypePhone(String typePhone){
        this.typePhone = typePhone;
    }
    
    public int getDocumentId(){
        return documentId;
    }
    
    public void setDocumentId(int documentId){
        this.documentId = documentId; 
    }
    
    public String getDate(){  
        return date;
    }
    
    public void setDate(String date){ 
        this.date= date;
    }

    public int getCodeId() {
        return idCode;
    }
   
}
