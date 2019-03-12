package pl.javasolutions.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import pl.javasolutions.api.IZapiekanka;
import pl.javasolutions.impl.Zapiekanka;

@Aspect
public class AspektZapiekanka {

    @DeclareParents(value="pl.javasolutions.api.IKucharz+" , defaultImpl = Zapiekanka.class)
    public static IZapiekanka izapiekanka;
}
