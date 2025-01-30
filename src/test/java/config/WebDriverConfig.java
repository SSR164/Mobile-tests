package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:remote.properties"
})
public interface WebDriverConfig extends Config{
    @Key("baseUrl")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getBaseUrl();

    @Key("user")
    String getUser();

    @Key("password")
    String getPassword();

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("osVersion")
    @DefaultValue("9.0")
    String getOsVersion();


}
