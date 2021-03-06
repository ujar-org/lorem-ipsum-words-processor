package org.ujar.loremipsum.shared.config.errorhandling;

import java.time.Duration;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public record Backoff(
    @NotNull Duration initialInterval,
    @NotNull Duration maxInterval,
    @Positive int maxRetries,
    @Positive double multiplier) {
}
