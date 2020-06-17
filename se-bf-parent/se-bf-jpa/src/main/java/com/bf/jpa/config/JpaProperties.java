package com.bf.jpa.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = JpaProperties.CORE_PREFIX)
@Data
public class JpaProperties {
    static final String CORE_PREFIX = "bf.jpa";
    private boolean enable = false;
}