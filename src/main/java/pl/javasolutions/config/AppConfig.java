package pl.javasolutions.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.javasolutions.api.IKucharz;
import pl.javasolutions.api.IZapiekanka;
import pl.javasolutions.aspects.AspektZapiekanka;
import pl.javasolutions.aspects.Komunikacja;
import pl.javasolutions.aspects.KontrolaMagazynu;
import pl.javasolutions.impl.Kucharz;
import pl.javasolutions.impl.PomocnikKucharza;
import pl.javasolutions.impl.Zapiekanka;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public IZapiekanka iZapiekanka() {
        return new Zapiekanka();
    }

    @Bean
    public AspektZapiekanka aspektZapiekanka() {
        return new AspektZapiekanka();
    }

    @Bean
    public IKucharz kucharz() {
        return new Kucharz();
    }

    @Bean
    public Komunikacja komunikacja() {
        return new Komunikacja();
    }

    @Bean
    public KontrolaMagazynu kontrolaMagazynu() {
        return new KontrolaMagazynu();
    }

    @Bean
    @Qualifier("pomocnik_kucharza")
    public IKucharz pomocnikKucharza() {
        return new PomocnikKucharza();
    }
}
