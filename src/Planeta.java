import org.hamcrest.DiagnosingMatcher;

public class Planeta {
    /**
     * @author IvanPeriche
     * @version 1.0
     */

    //Definim variables
    String nom;
    int diametre;
    int pes;
    public Object expansio;    

    //Contructor amb tots els parametres   
    /**
     * 
     * @param nom: nom del planeta
     * @param diametre: diametre del planeta
     * @param pes: pes del planeta
     */ 
    public Planeta(String nom, int diametre, int pes)
    {
        this.nom = nom;
        this.diametre = diametre;
        this.pes = pes;
    }

    //Contructor buit
    public Planeta(){}

    /**
     * 
     * @return1: si el planeta es enano
     * @return2: si el planeta no es enano
     */
    public int planetaEnano()
    {
        if(this.diametre < 1300)
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }

    /**
     * @param diametre: diametre triplicat
     */
    public void expansio()
    {        
        diametre = diametre * 3;
    }

    /**
     * 
     * @param meteorito
     */
    public void colisio(int meteorito){
        if(this.pes <= 1800){
            //return 1;
        }
       
    }

    //Getters i setters
    /**
     * 
     * @return nom
     */
    public String getNom()
    {
        return this.nom;
    }
    /**
     * 
     * @param nom
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * 
     * @return diametre
     */
    public int getDiametre()
    {
        return this.diametre;
    }

    /**
     * 
     * @param diametre
     */
    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }
    
    /**
     * 
     * @return pes
     */
    public int getPes()
    {
        return this.pes;
    }

    /**
     * 
     * @param pes
     */
    public void setPes(int pes)
    {
        this.pes = pes;
    }    
}
