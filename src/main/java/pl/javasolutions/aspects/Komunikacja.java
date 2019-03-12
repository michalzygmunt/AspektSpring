package pl.javasolutions.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Komunikacja {

    @After("execution(* pl.javasolutions.api.IKucharz.pobierzSkladnikiZMagazynu(..))")
    public void poinformujOPobraniuSkladnikow(){
        System.out.println("pobrano skladniki z magazynu");
    }

    @Around("execution(* pl.javasolutions.api.IKucharz.wydajPizze(..))")
    public void wydaniePizzy(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("KOMUNIKUJEMY ZE PIZZA JEST GOTOWA");
            joinPoint.proceed();
            System.out.println("KOMUNIKUJEMY ZE WYDANO PIZZE");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
