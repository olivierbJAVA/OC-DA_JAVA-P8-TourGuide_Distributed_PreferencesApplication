package preferencesModule.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import preferencesModule.service.IPreferencesService;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

@RestController
public class PreferencesController {
    private Logger logger = LoggerFactory.getLogger(PreferencesController.class);

    private final IPreferencesService preferencesService;

    public PreferencesController(IPreferencesService preferencesService) {
        this.preferencesService = preferencesService;
    }

    @GetMapping("/getPrice")
    public List<Provider> getPrice(@RequestParam String apiKey, @RequestParam String attractionId, @RequestParam int adults, @RequestParam int children, @RequestParam int nightsStay, @RequestParam int rewardsPoints) {
        logger.debug("Request getPrice : ApiKey=" + apiKey + " - attractionId=" + attractionId + " - adults=" + adults + " - children=" + children + " - nightsStay=" + nightsStay + " - rewardsPoints=" + rewardsPoints);
        List<Provider> providers = preferencesService.getPrice(apiKey, UUID.fromString(attractionId), adults, children, nightsStay, rewardsPoints);
        logger.debug("Response Nb Providers=" + providers.size());
        return providers;
    }
}
