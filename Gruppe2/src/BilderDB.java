/*
 * BilderDB.java
 *
 * Created on 16. Juni 2002, 14:23
 */

/**
 *
 * @author  ben
 * @version
 */
import java.util.*;
import java.io.Serializable;
public class BilderDB implements Serializable {
    java.util.TreeSet bildbank= new java.util.TreeSet(new nameComp());
    /** Creates new BilderDB */
    
    
    public class nameComp implements Comparator,Serializable{
        public int compare(Object o1, Object o2){
            int result =(((String)((Bild)o1).kuenstlername).toUpperCase().compareTo(((String)((Bild)o2).kuenstlername).toUpperCase()));
            
            
            return result;
        }
        public boolean equals(Object o){
            if(!(o instanceof nameComp))
                return false;
            else return true;
            
            
        }
        
    }
    
    
    
    public class dateComp implements Comparator,Serializable{
        public int compare(Object o1, Object o2){
            int result =(((Date)((Bild)o1).verkaufsdatum).compareTo(((Date)((Bild)o2).verkaufsdatum)));
            if (result==0)result=1;
            return result;
        }
        public boolean equals(Object o){
            if(!(o instanceof dateComp))
                return false;
            else return true;
            
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public BilderDB() {
        
        
    }
    public void add  (Bild neuesBild){
        bildbank.add(neuesBild);
        
        
    }
    public void output(){
        Iterator iter=bildbank.iterator();
        while (iter.hasNext())
            ((Bild)iter.next()).output();
     
    }
    public int size(){
       int ret= bildbank.size();
        return ret;
    }
    public Iterator iterator (){
    Iterator iter=bildbank.iterator();
    
    return iter;
    }
}
