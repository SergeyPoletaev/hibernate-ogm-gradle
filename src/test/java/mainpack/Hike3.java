package mainpack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table (name = "users")
public class Hike3 {

  @Id
  private String id;

  private String description;
  private Date date;
  private BigDecimal difficulty;


  @Override
  public String toString() {
    return "hibernate.ogm.Hike3{" +
            "id='" + id + '\'' +
            ", description='" + description + '\'' +
            ", date=" + date +
            ", difficulty=" + difficulty +
            '}';
  }
}