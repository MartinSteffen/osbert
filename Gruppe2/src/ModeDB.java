/*
 * ModeDB.java
 *
 * Created on 19. Juni 2002, 20:55
 */

/**
 *
 * @author  ben
 * @version
 */

import java.util.*;
import java.io.Serializable;
public class ModeDB implements Serializable {
    java.util.TreeSet modebank= new java.util.TreeSet(new nameComp());
    
    /** Creates new BilderDB */
    
    
    public class nameComp implements Comparator,Serializable{
        public int compare(Object o1, Object o2){
            int result =(((String)((Kuenstler)o1).kuenstlerName).toUpperCase().compareTo(((String)((Kuenstler)o2).kuenstlerName).toUpperCase()));
            
            
            return result;
        }
        public boolean equals(Object o){
            if(!(o instanceof nameComp))
                return false;
            else return true;
            
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public ModeDB() {
        
        
    }
    public void add  (Kuenstler neuerKuenstler){
        modebank.add(neuerKuenstler);
        
        
    }
    public Kuenstler addRet  (Kuenstler neuerKuenstler){
        modebank.add(neuerKuenstler);
        
        return neuerKuenstler;
    }
    public void output(){
        
        
    }
    public int size(){
        int ret= modebank.size();
        return ret;
    }
    public Iterator iterator(){
        Iterator iter=modebank.iterator();
        
        return iter;
    }
    public boolean remove(Object o1){
        boolean bool=false;
        
        bool=modebank.remove(o1);
        
        return bool;
        
    }
    public boolean contains(Object o1){
        boolean bool=false;
        bool=modebank.contains(o1);
        return bool;
        
    }
    public boolean isEmpty(){
        boolean bool=false;
        bool=modebank.isEmpty();
        return bool;
        
    }
    public Object last(){
        Object o1=modebank.last();
        return o1;
        
    }
}