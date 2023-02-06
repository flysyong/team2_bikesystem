package teambikesystem.infra;

import teambikesystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="reserveReports", path="reserveReports")
public interface ReserveReportRepository extends PagingAndSortingRepository<ReserveReport, Long> {

    

    
}
