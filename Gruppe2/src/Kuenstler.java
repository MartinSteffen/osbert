/*
 * Kuenstler.java
 *
 * Created on 19. Juni 2002, 20:45
 */

/**
 *
 * @author  ben
 * @version 
 */
public class Kuenstler implements java.io.Serializable{
    String kuenstlerName=null;
    int modeFaktor=0;

    /** Creates new Kuenstler */
    public Kuenstler(String name,int mFaktor) {
     kuenstlerName=name;
     modeFaktor=mFaktor;
    }
    public void output(){
        
        System.out.println (kuenstlerName+"   "+modeFaktor);
    }

}
