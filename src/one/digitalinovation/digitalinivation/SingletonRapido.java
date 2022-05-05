package one.digitalinovation.digitalinivation;

public class SingletonRapido {
    private static SingletonRapido instancia = new SingletonRapido();;

    private SingletonRapido(){
        super();
    }

    public static SingletonRapido getInstancia(){
        return instancia;
        }
    }

