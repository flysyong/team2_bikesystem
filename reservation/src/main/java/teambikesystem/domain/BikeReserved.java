package teambikesystem.domain;

import teambikesystem.domain.*;
import teambikesystem.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class BikeReserved extends AbstractEvent {

    private Long id;

    public BikeReserved(Reservation aggregate){
        super(aggregate);
    }
    public BikeReserved(){
        super();
    }
}
