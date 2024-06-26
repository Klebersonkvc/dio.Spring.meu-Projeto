
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Construtor privado para evitar instâncias
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
