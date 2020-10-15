package preferencesModule.service;

import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

/**
 * Interface to be implemented for managing the services for the Preferences service.
 */
public interface IPreferencesService {

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
    List<Provider> getPrice(String apiKey, UUID attractionId, int adults, int children, int nightsStay, int rewardsPoints);

}
