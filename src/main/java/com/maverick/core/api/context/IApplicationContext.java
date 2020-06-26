package com.maverick.core.api.context;

public interface IApplicationContext {
    <T> T getObject(Class<T> impl);
}
