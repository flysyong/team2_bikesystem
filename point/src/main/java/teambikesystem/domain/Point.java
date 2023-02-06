package teambikesystem.domain;

import teambikesystem.domain.PointUsed;
import teambikesystem.domain.PointReturned;
import teambikesystem.domain.PointIncreased;
import teambikesystem.PointApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Point_table")
@Data

public class Point  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long userId;
    
    
    
    
    
    private Integer totalPoint;
    
    
    
    
    
    private Integer reserveNo;

    @PostPersist
    public void onPostPersist(){


        PointUsed pointUsed = new PointUsed(this);
        pointUsed.publishAfterCommit();



        PointReturned pointReturned = new PointReturned(this);
        pointReturned.publishAfterCommit();



        PointIncreased pointIncreased = new PointIncreased(this);
        pointIncreased.publishAfterCommit();

    }

    public static PointRepository repository(){
        PointRepository pointRepository = PointApplication.applicationContext.getBean(PointRepository.class);
        return pointRepository;
    }




    public static void pointTransfer(PointOrdered pointOrdered){

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        */

        /** Example 2:  finding and process
        
        repository().findById(pointOrdered.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);


         });
        */

        
    }
    public static void requestReturn(Canceled canceled){

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        */

        /** Example 2:  finding and process
        
        repository().findById(canceled.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);


         });
        */

        
    }
    public static void usePoint(BikeReserved bikeReserved){

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        */

        /** Example 2:  finding and process
        
        repository().findById(bikeReserved.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);


         });
        */

        
    }


}
