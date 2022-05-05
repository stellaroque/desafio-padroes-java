package one;

import one.digitalinovation.digitalinivation.Singleton;
import one.digitalinovation.digitalinivation.SingletonLazyHolder;
import one.digitalinovation.digitalinivation.SingletonRapido;
import one.digitalinovation.facade.Facade;
import one.digitalinovation.strategy.*;

public class Test {
    public static void main(String[] args) {
        // Singleton

        Singleton lazy = Singleton.getInstancia();
        System.out.println(lazy);
        lazy = Singleton.getInstancia();
        System.out.println(lazy);

        SingletonRapido rapido = SingletonRapido.getInstancia();
        System.out.println(rapido);
        rapido = SingletonRapido.getInstancia();
        System.out.println(rapido);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Strategy

        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento normal = new ComportamentoNormal();
        IComportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Stella", "12548455");
        }

    }

