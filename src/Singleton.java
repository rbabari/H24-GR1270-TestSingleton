public class Singleton {
    private int nbrExecution =0;
    // - instance
    private static Singleton instance = null;

    // - Singelton()
    private Singleton()
    {
        System.out.println("constructeur singleton");
        nbrExecution++;

    }



    // + getInstance()
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance =  new Singleton();
        }
        System.out.println("getInstance() ");
        return instance;
    }
}
