package teambikesystem.domain;

import teambikesystem.domain.*;
import teambikesystem.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PointReturned extends AbstractEvent {

    private Long id;

    public PointReturned(Point aggregate){
        super(aggregate);
    }
    public PointReturned(){
        super();
    }
}
