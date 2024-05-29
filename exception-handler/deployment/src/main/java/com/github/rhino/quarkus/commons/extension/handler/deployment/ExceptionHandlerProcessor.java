package com.github.rhino.quarkus.commons.extension.handler.deployment;

import com.github.rhino.quarkus.commons.extension.handler.runtime.Blink;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class ExceptionHandlerProcessor {

    private static final String FEATURE = "exception-handler";

    @BuildStep
    FeatureBuildItem featureBuildItem(){
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem createBlink(){
        return new AdditionalBeanBuildItem(Blink.class);
    }
}
