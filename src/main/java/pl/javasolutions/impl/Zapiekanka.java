package pl.javasolutions.impl;

import pl.javasolutions.api.IZapiekanka;

public class Zapiekanka implements IZapiekanka {
    @Override
    public void przygotujZapiekanke() {
        System.out.println("Kucharz przygotowuje zapiekanke");
    }
}
