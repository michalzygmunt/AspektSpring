package pl.javasolutions.kurs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolutions.api.IKucharz;
import pl.javasolutions.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IKucharz kucharek = context.getBean(IKucharz.class);
        kucharek.pobierzSkladnikiZMagazynu();
        kucharek.przygotujPizze();
        kucharek.wydajPizze();
    }
}
