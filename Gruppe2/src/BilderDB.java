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
    java.util.TreeSet bildbank= new java.util.TreeSet(new verkaufsDatumComp());
    
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
 
    
    
     public class verkaufsDatumComp implements Comparator,Serializable{
        public int compare(Object o1, Object o2){
           //if (!((Bild)o1).getBool(18))return -1;
           //if (!((Bild)o2).getBool(18))return 1;
            int result =(((Integer)((Bild)o2).vkDatum(1)).compareTo(((Integer)((Bild)o1).vkDatum(1))));
            if (result==0)result =(((Integer)((Bild)o2).vkDatum(2)).compareTo(((Integer)((Bild)o1).vkDatum(2))));
            if (result==0)result =(((Integer)((Bild)o2).vkDatum(3)).compareTo(((Integer)((Bild)o1).vkDatum(3))));
            
            return result;
        }
        public boolean equals(Object o){
            if(!(o instanceof verkaufsDatumComp))
                return false;
            else return true;
            
            
        }
    }   
        public class verkaufsDatumnegComp implements Comparator,Serializable{
        public int compare(Object o1, Object o2){
           //if (!((Bild)o1).getBool(18))return -1;
           //if (!((Bild)o2).getBool(18))return 1;
            int result =(((Integer)((Bild)o1).vkDatum(1)).compareTo(((Integer)((Bild)o2).vkDatum(1))));
            if (result==0)result =(((Integer)((Bild)o1).vkDatum(2)).compareTo(((Integer)((Bild)o2).vkDatum(2))));
            if (result==0)result =(((Integer)((Bild)o1).vkDatum(3)).compareTo(((Integer)((Bild)o2).vkDatum(3))));
            
            return result;
        }
        public boolean equals(Object o){
            if(!(o instanceof verkaufsDatumComp))
                return false;
            else return true;
            
            
        }
    }   
    
  /*  public class dateComp implements Comparator,Serializable{
        public int compare(Object o1, Object o2){
           // int result =(((Date)((Bild)o1).verkaufsdatum).compareTo(((Date)((Bild)o2).verkaufsdatum)));
            if (result==0)result=1;
            return result;
        }
        public boolean equals(Object o){
            if(!(o instanceof dateComp))
                return false;
            else return true;
            
            
        }
    }
    */
    
    
    
    
    
    
    
    
    
    
    
    public BilderDB() {
        
        
    }
     public BilderDB(Comparator comp, Collection c) {
         java.util.TreeSet bildbank= new java.util.TreeSet(comp);
         bildbank.addAll(c);
        
    }
    public void add  (Bild neuesBild){
        bildbank.add(neuesBild);
        
        
    }
      public Bild addRet  (Bild neuesBild){
        bildbank.add(neuesBild);
        
        return neuesBild;
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
    public boolean remove (Object o1){
     boolean bool=false;
     
     bool=bildbank.remove(o1);
     
     return bool;
        
    }
    public boolean contains (Object o1){
     boolean bool=false;
     bool=bildbank.contains(o1);
     return bool;
        
    }
     public boolean isEmpty (){
     boolean bool=false;
     bool=bildbank.isEmpty();
     return bool;
        
    }
    public Object last(){
     Object o1=bildbank.last();
     return o1;
        
    }
}
