package com.bf.core.common;

public enum EnvironmentActive {
    DEV("开发"), ONLINE("线上");
    private String name;

    EnvironmentActive(String name) {
        this.name = name;
    }
}
