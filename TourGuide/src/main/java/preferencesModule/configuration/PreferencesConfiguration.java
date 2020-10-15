package preferencesModule.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tripPricer.TripPricer;

/**
 * Configuration class of the Preferences service.
 */
@Configuration
public class PreferencesConfiguration {
	
	@Bean
	public TripPricer getTripPricer() {
		return new TripPricer();
	}

}
