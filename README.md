# API module for Maverick framework

---
## Goal
The API module allows you to create your own additional modules for Maverick without connecting the main module.

---
## Built with
* Java 14
* Maven 3.6.1

---
## Provided interfaces
* ***ObjectConfigurator interface*** - general configurator
* ***ProxyObjectConfigurator interface*** - special configurator for wrapping base objects in proxy-objects

---
## How to install
**Terminal:**
```
$ git clone https://github.com/j-04/maverick-core-api.git
$ cd maverick-core-api
$ mvn clean install
```

**Maven dependency:**
```
<dependency>
    <groupId>com.maverick.core.api</groupId>
    <artifactId>maverick-core-api</artifactId>
    <version>1.0</version>
</dependency>
```