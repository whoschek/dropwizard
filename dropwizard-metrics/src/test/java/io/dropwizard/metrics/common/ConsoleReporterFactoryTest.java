package io.dropwizard.metrics.common;

import io.dropwizard.jackson.DiscoverableSubtypeResolver;
import io.dropwizard.metrics.core.ConsoleReporterFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConsoleReporterFactoryTest {
    @Test
    public void isDiscoverable() throws Exception {
        assertThat(new DiscoverableSubtypeResolver().getDiscoveredSubtypes())
                .contains(ConsoleReporterFactory.class);
    }
}
