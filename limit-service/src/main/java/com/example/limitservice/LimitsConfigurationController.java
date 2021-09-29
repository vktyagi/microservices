package com.example.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@Value("${api.end.point}")
	String apiUrl ;

	@GetMapping("/limits")
	public String  retrieveLimitsFromConfigurations() {
		/*LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(),
				configuration.getMinimum());*/
		return apiUrl;
	}
	
/*	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public LimitConfiguration retrieveConfiguration() {
		throw new RuntimeException("Not available");
	}

	public LimitConfiguration fallbackRetrieveConfiguration() {
		return new LimitConfiguration(999, 9);
	}*/

}