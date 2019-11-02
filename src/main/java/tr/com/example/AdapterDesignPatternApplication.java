package tr.com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("tr.com.example")
public class AdapterDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterDesignPatternApplication.class, args);
	}

}
