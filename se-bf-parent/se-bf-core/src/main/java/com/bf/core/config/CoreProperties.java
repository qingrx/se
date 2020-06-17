package com.bf.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = CoreProperties.CORE_PREFIX)
@Data
public class CoreProperties {
    static final String CORE_PREFIX = "bf.core";
    private boolean enable = false;
}