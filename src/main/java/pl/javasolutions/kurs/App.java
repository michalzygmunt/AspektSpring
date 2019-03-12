package pl.javasolutions.kurs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolutions.api.IKucharz;
import pl.javasolutions.config.AppConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IKucharz kucharek = (IKucharz) context.getBean("kucharz");
        kucharek.pobierzSkladnikiZMagazynu(5);
        kucharek.przygotujPizze(1);
        kucharek.wydajPizze();

        IKucharz pomocnik = (IKucharz) context.getBean("pomocnikKucharza");
        pomocnik.pobierzSkladnikiZMagazynu();
    }
}
