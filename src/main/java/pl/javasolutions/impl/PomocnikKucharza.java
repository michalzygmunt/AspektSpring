package pl.javasolutions.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.javasolutions.api.IKucharz;

public class PomocnikKucharza implements IKucharz {

    @Autowired
    @Qualifier("pomocnik_kucharza")
    private IKucharz kucharz;

    @Override
    public void pobierzSkladnikiZMagazynu() {
        System.out.println("Pomocnik pobiera skladniki z magazynku");
    }

    @Override
    public void pobierzSkladnikiZMagazynu(int liczbaSkladnikow) {
        System.out.println("pomocnik pobiera " + liczbaSkladnikow +" skladnikow z magazynu");
    }

    @Override
    public void przygotujPizze() {
        System.out.println("Pomocnik oddelegowuje przygotowanie do kucharza");
        kucharz.przygotujPizze();
    }

    @Override
    public void przygotujPizze(int idPizzy) {
        System.out.println("Pomocnik oddelegowuje przygotowanie pizzy o id " + idPizzy + " do kucharza");
        kucharz.przygotujPizze(idPizzy);
    }

    @Override
    public void wydajPizze() {
        System.out.println("Pomocnik wydaje pizzeee");
    }
}
