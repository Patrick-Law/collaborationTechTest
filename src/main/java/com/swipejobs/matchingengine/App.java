package com.swipejobs.matchingengine;

import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.job.Job;
import com.swipejobs.matchingengine.model.worker.Worker;
import com.swipejobs.matchingengine.service.job.JobServiceImpl;
import com.swipejobs.matchingengine.service.worker.WorkerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.security.cert.Certificate;
import java.util.List;

/**
 * The matching engine application
 * 
 * @author adityachitre
 *
 */
@SpringBootApplication
public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws RestException {
		SpringApplication.run(App.class, args);
		logger.debug("Matching Engine Started");
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}
}
