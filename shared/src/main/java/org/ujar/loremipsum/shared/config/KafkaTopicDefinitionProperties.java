package org.ujar.loremipsum.shared.config;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Map;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;
import org.ujar.loremipsum.shared.config.topic.TopicDefinition;

@Value
@ConstructorBinding
@ConfigurationProperties(prefix = "loremipsum.kafka")
@Validated
@SuppressFBWarnings({"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public class KafkaTopicDefinitionProperties {

  Map<String, TopicDefinition> topics;

  public TopicDefinition get(String key) {
    return topics.get(key);
  }
}

