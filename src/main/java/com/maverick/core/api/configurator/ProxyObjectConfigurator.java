package com.maverick.core.api.configurator;

public interface ProxyObjectConfigurator {
    <T> T wrapWithProxyIfNecessary(T object, Class<T> nativeClass);
}
