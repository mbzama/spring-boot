package zama.learning;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	private static Logger LOGGER = Logger.getLogger(Application.class);
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		LOGGER.info("Spring boot loading beans ... ");
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		
		for (String beanName : beanNames) {
			LOGGER.info(beanName);
		}
	}
}
