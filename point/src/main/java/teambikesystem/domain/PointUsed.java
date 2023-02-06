package teambikesystem.domain;

import teambikesystem.domain.*;
import teambikesystem.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PointUsed extends AbstractEvent {

    private Long id;

    public PointUsed(Point aggregate){
        super(aggregate);
    }
    public PointUsed(){
        super();
    }
}
