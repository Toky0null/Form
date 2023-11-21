
package model;
import java.io.Serializable;
/**
 *
 * @author tokyo
 */

public class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Identificador de versión para la serialización
    private static int idCounter = 0;
    
//    private static int id;
    private int idCode;
    private String name;
    private String lastName;
    private String documentId;
    private String address;
    private String phoneNumber;
    private String typePhone;
    private String date;
     
    public Student(String name,String lastname,String address,String phoneNumber,String typePhone,String documentId,String date) {
        idCounter++;
        this.idCode = idCounter;
        this.name = name;
        this.lastName = lastname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.typePhone = typePhone;
        this.documentId = documentId;
        this.date= date;  
        System.out.println("studiante creado");
    } 
    
    public String toString() {
        return "ID: " + idCode +
                ", Nombre: " + name +
                ", Apellido: " + lastName +
                ", Dirección: " + address +
                ", Número de teléfono: " + phoneNumber +
                ", Tipo de teléfono: " + typePhone +
                ", Documento ID: " + documentId +
                ", Fecha de nacimiento: " + date;
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
        return address;
    }
    
    public void setAddres(String address){
        this.address = address;   
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getTypePhone(){
        return typePhone;
    }
    
    public void setTypePhone(String typePhone){
        this.typePhone = typePhone;
    }
    
    public String getDocumentId(){
        return documentId;
    }
    
    public void setDocumentId(String documentId){
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
