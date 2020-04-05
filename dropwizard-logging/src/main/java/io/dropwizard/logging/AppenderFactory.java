package io.dropwizard.logging;

import ch.qos.logback.core.spi.DeferredProcessingAware;

/**
 * {@inheritDoc}
 *
 * @deprecated Use {@link io.dropwizard.logging.common.AppenderFactory} instead.
 */
@Deprecated
public interface AppenderFactory<E extends DeferredProcessingAware> extends io.dropwizard.logging.common.AppenderFactory<E> {
}
