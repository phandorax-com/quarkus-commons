package com.phandorax.transaction.id.deployment;

import com.phandorax.transaction.id.runtime.FilterTransaction;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.vertx.http.deployment.NonApplicationRootPathBuildItem;
import io.quarkus.vertx.http.deployment.spi.RouteBuildItem;

class TransactionIdProcessor {

    private static final String FEATURE = "transaction-id";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem filterTransaction(){
        return new AdditionalBeanBuildItem(FilterTransaction.class);
    }
}
