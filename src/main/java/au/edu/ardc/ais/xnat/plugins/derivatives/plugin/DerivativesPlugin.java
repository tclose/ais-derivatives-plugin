/*
 * xnat-ais-derivatives-plugin: au.edu.ardc.ais.xnat.plugins.derivatives.plugin.DerivativesPlugin
 * Copyright (c) 2022, Australian Research Data Commons
 */

package au.edu.ardc.ais.xnat.plugins.derivatives.plugin;

import lombok.extern.slf4j.Slf4j;
import org.nrg.config.services.ConfigService;
import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.*;
import org.nrg.xdat.security.user.XnatUserProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "DerivativesPlugin", name = "AIS Analysis Derivatives Plugin",
            entityPackages = "au.edu.ardc.ais.xnat.plugins.derivatives.entities",
            dataModels = {@XnatDataModel(value = AisDerivativesBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Analysis Derivative",
                                         plural = "Analysis Derivatives",
                                         code = "AD")})
@ComponentScan({"au.edu.ardc.ais.xnat.plugins.derivatives.preferences",
                "au.edu.ardc.ais.xnat.plugins.derivatives.repositories",
                "au.edu.ardc.ais.xnat.plugins.derivatives.rest",
                "au.edu.ardc.ais.xnat.plugins.derivatives.services.impl"})
@Slf4j
public class DerivativesPlugin {
    public DerivativesPlugin() {
        log.info("Creating the DerivativesPlugin configuration class");
    }

    @Bean
    public String derivativesPluginMessage() {
        return "This comes from deep within the derivatives plugin.";
    }
}
