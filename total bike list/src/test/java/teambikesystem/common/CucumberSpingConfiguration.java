package teambikesystem.common;


import teambikesystem.TotalBikeListApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TotalBikeListApplication.class })
public class CucumberSpingConfiguration {
    
}
