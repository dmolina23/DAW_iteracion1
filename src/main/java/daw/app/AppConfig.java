package daw.app;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.event.Startup;
import jakarta.enterprise.inject.Default;
import jakarta.faces.annotation.FacesConfig;
import jakarta.inject.Named;

import java.util.logging.Logger;

import static java.util.logging.Logger.*;

@FacesConfig //enable JSF front-controller
@Named("app")
@Default
@ApplicationScoped
public class AppConfig {

    private final Logger log= getLogger(AppConfig.class.getName());

    private final String message = "Welcome DAW!";

    public AppConfig() {
        log.info(">>> Application starting...");
    }

    /** Automatically called when all dependencies are satisfied */
    public void onStartup(@Observes Startup event) {
        log.info(">>> Application ready");
    }

    public String getWelcomeMessage() {
        return message;
    }
}
