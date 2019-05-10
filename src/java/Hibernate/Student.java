
package Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    String Name;
    @Id
    String ID;
    String Phone_Number;
    String Address;
    String Student_Route;
    String Student_Password;
    Student()
    {
    }


    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getStudent_Route() {
        return Student_Route;
    }

    public void setStudent_Route(String Route) {
        this.Student_Route = Route;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStudent_Password() {
        return Student_Password;
    }

    public void setStudent_Password(String Password) {
        this.Student_Password = Password;
    }
    
    
}
