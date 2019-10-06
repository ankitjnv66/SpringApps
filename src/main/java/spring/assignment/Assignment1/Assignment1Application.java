package spring.assignment.Assignment1;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Assignment1Application  {
	
	@Autowired
	ApplicationContext ctx;
	
	private final Logger log = LoggerFactory.getLogger(Assignment1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}

	@Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {

            String[] beans = appContext.getBeanDefinitionNames();
            Arrays.stream(beans).sorted().forEach(System.out::println);

        };
    }
	
	

	
}
