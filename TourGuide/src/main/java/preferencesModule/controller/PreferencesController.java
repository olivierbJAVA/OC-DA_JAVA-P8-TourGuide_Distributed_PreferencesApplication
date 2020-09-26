package preferencesModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import preferencesModule.service.IPreferencesService;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

@RestController
public class PreferencesController {

    @Autowired
    IPreferencesService preferencesService;

    @RequestMapping("/getPrice")
    public List<Provider> getPrice(@RequestParam String apiKey, @RequestParam UUID attractionId, @RequestParam int adults, @RequestParam int children, @RequestParam int nightsStay, @RequestParam int rewardsPoints) {
        return preferencesService.getPrice(apiKey, attractionId, adults, children, nightsStay, rewardsPoints);
    }
}
