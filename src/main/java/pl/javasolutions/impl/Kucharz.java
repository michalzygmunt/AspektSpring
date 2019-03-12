package pl.javasolutions.impl;

import pl.javasolutions.api.IKucharz;

public class Kucharz implements IKucharz {
    @Override
    public void pobierzSkladnikiZMagazynu() {
        System.out.println("Kucharz pobiera skladniki z magazynu");

    }

    @Override
    public void pobierzSkladnikiZMagazynu(int liczbaSkladnikow) {
        System.out.println("Kucharz pobiera " + liczbaSkladnikow + " skladnikow");
    }

    @Override
    public void przygotujPizze() {
        System.out.println("Kucharz przygotowuje pizze");
    }

    @Override
    public void przygotujPizze(int idPizzy) {
        System.out.println("Kucharz przygotowuje pizze o id " + idPizzy);
    }

    @Override
    public void wydajPizze() {
        System.out.println("Kucharz wydaje pizze");
    }
}
