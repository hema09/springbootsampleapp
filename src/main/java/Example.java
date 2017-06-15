import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hemabhatia on 6/15/17.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/home")
    String home() {
        return "<html><h1>Sample App Home</h1></html>";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
