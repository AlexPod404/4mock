package sb1.stub.union;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "sb1.stub.clients",
    "sb1.stub.cti", 
    "sb1.stub.tasks",
    "sb1.stub.clientcard"
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}