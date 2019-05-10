
package Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {
 
 String Driver_Name;
       
 String Driver_Phone_Number;
 @Id
    
 String Driver_Id;
 String Driver_Address;
 
 Driver()
 {
 }

    public String getDriver_Name() {
        return Driver_Name;
    }

    public void setDriver_Name(String Driver_Name) {
        this.Driver_Name = Driver_Name;
    }

    public String getDriver_Phone_Number() {
        return Driver_Phone_Number;
    }

    public void setDriver_Phone_Number(String Driver_Phone_Number) {
        this.Driver_Phone_Number = Driver_Phone_Number;
    }

    public String getDriver_Id() {
        return Driver_Id;
    }

    public void setDriver_Id(String Driver_Id) {
        this.Driver_Id = Driver_Id;
    }

    public String getDriver_Address() {
        return Driver_Address;
    }

    public void setDriver_Address(String Driver_Address) {
        this.Driver_Address = Driver_Address;
    }
 
}
