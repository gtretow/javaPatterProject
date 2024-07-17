package one.digitalinnovation.gof.singleton;
/*
encapsula numa classe interna
é thread safe
 */

public class SingletonLazyHolder {
    private static class Holder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instancia;
    }
}
