/**
 * Classe exemple singleton *********YEEEEEEEEEEEEEEEEEEEEE ...
 // * @author rb
 // *
 */
public class Singleton {
    private int nbrExecution =0;
    // - instance
    private static Singleton instance = null;

    // - Singelton()
 /**
 lasuikfh
 dfvkjbdfvv
 dfsvkjdnfv
 dfsvlkndfv
  */




    /**
     * contructeur privé du singleton ...
     */
    private Singleton()
    {
        System.out.println("constructeur singleton");
        nbrExecution++;
// mon propre commentaire ,,, non inclut dans la java doc ....
    }



    // + getInstance()

    /**
     *  methode qui retourne l'instance unique du sigleton
     * @return singleton
     */
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance =  new Singleton();
        }
        System.out.println("getInstance() ");
        return instance;
    }

    /**
     * methode qui fait qqchose
     * @param p1 est un int qui represente qqchose
     * @param nom est un string ...
     * @return retourne zero ou la sommme
     */
    public static int faireQqchose(int p1, String nom)
    {

        return 0;
    }

}
