package pl.javasolutions.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Komunikacja {

    @Pointcut("args(argumentInt)")
    public void pointcutInt(int argumentInt){}

    @Pointcut("target(pl.javasolutions.api.IKucharz)")
    public void pointcutTarger(){}

    @Pointcut("@target(annotation)")
    public void pointcutTargetAnnotation(Deprecated annotation){}

    @Pointcut("within(pl.javasolutions.impl.Kucharz)")
    public void pointcutWithin(){}

    @Before("pointcutWithin() && pointcutInt(arg)")
    public void porada(int arg){
        System.out.println("PORADA " + arg);
    }

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
