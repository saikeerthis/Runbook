package kennesaw.edu.RunbookAutomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


// Wildfly Changes
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class RunbookAutomationApplication extends SpringBootServletInitializer {
// 
//    public static void main(String[] args) {
//        SpringApplication.run(applicationClass, args);
//    }
// 
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(applicationClass);
//    }
// 
//    private static Class<RunbookAutomationApplication> applicationClass = RunbookAutomationApplication.class;
//}

@SpringBootApplication
public class RunbookAutomationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RunbookAutomationApplication.class, args);
	}
}