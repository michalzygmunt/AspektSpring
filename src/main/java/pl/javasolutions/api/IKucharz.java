package pl.javasolutions.api;

public interface IKucharz {
    void pobierzSkladnikiZMagazynu();
    void pobierzSkladnikiZMagazynu(int liczbaSkladnikow);
    void przygotujPizze();
    void przygotujPizze(int idPizzy);
    void wydajPizze();
}
