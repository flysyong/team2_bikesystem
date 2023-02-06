package teambikesystem.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="ReserveReport_table")
@Data
public class ReserveReport {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long reserveNo;
        private Integer userId;
        private Integer bikeId;
        private String status;
        private String color;


}
