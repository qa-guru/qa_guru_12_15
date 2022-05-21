package io.qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    // зачитываем данные из командной строки
    @Key("remoteUrl")
    // обрабатывает дефолтное значение
    @DefaultValue("http://localhost:4444/wd/hub")
    // конвертируем в возращаемый тип
    URL getRemoteUrl();

}
