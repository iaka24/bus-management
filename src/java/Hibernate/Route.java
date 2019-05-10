
package Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Route {
    @Id
   String Route_Id;
   String Stop1;
   String Stop2;
   String Pickip;
   Route()
   {
   }

    public String getRoute_Id() {
        return Route_Id;
    }

    public void setRoute_Id(String Route_Id) {
        this.Route_Id = Route_Id;
    }

    public String getStop1() {
        return Stop1;
    }

    public void setStop1(String Stop1) {
        this.Stop1 = Stop1;
    }

    public String getStop2() {
        return Stop2;
    }

    public void setStop2(String Stop2) {
        this.Stop2 = Stop2;
    }

    public String getPickip() {
        return Pickip;
    }

    public void setPickip(String Pickip) {
        this.Pickip = Pickip;
    }
   
}
