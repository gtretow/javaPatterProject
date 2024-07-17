package one.digitalinnovation.gof.singleton;

/*
Singleton apressado atribui a instancia logo que ela é definida

O Singleton é um padrão de projeto criacional que permite
a você garantir que uma classe tenha apenas uma instância,
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
