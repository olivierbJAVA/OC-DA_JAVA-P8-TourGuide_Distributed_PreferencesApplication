package preferencesModule.service;

import org.springframework.stereotype.Service;
import tripPricer.Provider;
import tripPricer.TripPricer;

import java.util.List;
import java.util.UUID;

/**
 * Class in charge of managing the services for the Preferences service.
 */
@Service
public class PreferencesServiceImpl implements IPreferencesService {

    private final TripPricer tripPricer;

    public PreferencesServiceImpl(TripPricer tripPricer) {
        this.tripPricer = tripPricer;
    }

    /**
     * Return a list of travels proposed by external providers to the user depending on its preferences and rewards points.
     *
     * @param apiKey The apiKey of travel network
     * @param attractionId The id
     * @param adults The number of adults
     * @param children The number of children
     * @param nightsStay The number of nights stay
     * @param rewardsPoints The number of rewards points
     * @return The list of proposed travels by external providers to the user
     */
    @Override
    public List<Provider> getPrice(String apiKey, UUID attractionId, int adults, int children, int nightsStay, int rewardsPoints) {
        return tripPricer.getPrice(apiKey, attractionId, adults, children, nightsStay, rewardsPoints);
    }

}
