package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        /*
        O endereço de memória deve ser o mesmo
         */


        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);
        /*
        O endereço de memória deve ser o mesmo
         */

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        /*
        O endereço de memória deve ser o mesmo
         */
        /*
        strategy
         */
        Comportamento normal = new ComportamentoNormal();
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        /*
        facade
         */

        Facade facade = new Facade();
        facade.migrarCliente("Guilherme", "042034234");


    }

}
