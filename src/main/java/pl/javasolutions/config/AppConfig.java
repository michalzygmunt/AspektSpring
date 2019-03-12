package pl.javasolutions.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.javasolutions.api.IKucharz;
import pl.javasolutions.aspects.Komunikacja;
import pl.javasolutions.aspects.KontrolaMagazynu;
import pl.javasolutions.impl.Kucharz;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

@Bean
    public IKucharz kucharz(){
    return new Kucharz();
}

@Bean
    public Komunikacja komunikacja(){
    return new Komunikacja();
}

@Bean
    public KontrolaMagazynu kontrolaMagazynu(){
    return new KontrolaMagazynu();
}
}
