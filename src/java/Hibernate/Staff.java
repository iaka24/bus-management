
package Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
   String Sname;
   @Id
   String SId;
   String SPassword;

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getSId() {
        return SId;
    }

    public void setSId(String SId) {
        this.SId = SId;
    }

    public String getSPassword() {
        return SPassword;
    }

    public void setSPassword(String SPassword) {
        this.SPassword = SPassword;
    }
   Staff()
   {
   }
}
