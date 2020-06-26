package com.maverick.core.api.configurator;

import com.maverick.core.api.context.IApplicationContext;

public interface ObjectConfigurator {
    void configure(Object o, IApplicationContext context);
}
