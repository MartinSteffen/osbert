/*
 * Bild.java
 *
 * Created on 16. Juni 2002, 15:12
 */

/**
 *
 * @author  ben
 * @version
 */
public class Bild implements java.io.Serializable{
    String kuenstlervorname="n/a";
    String kuenstlername="n/a";
    String bildtitel="n/a";
    int enstehungsjahr=0;
    String klassifikation="n/a";
    int hoehe=0;
    int breit=0;
    String medium="n/a";
    String thema="n/a";
    String verkauefername="n/a";
    String verkauferddresse="n/a";
    float maxkaufpreis=0;
    float gewkaufpreis=0;
    java.util.Date verkaufsdatum;
    String kauefername="n/a";
    String kaueferadresse="n/a";
    float verkaufspreis=0;
    boolean verkauft=false;
    
    /** Creates new Bild */
    public Bild() {
        
    }
    public Bild (String kname){
        kuenstlername=kname;
    }
    public Bild(String kvname, String kname, String titel,int jahr,String klasse, int h, int b, String med, String thm, String verk, String verka, float maxpreis,float gpreis){
        if (kvname!=null)
            kuenstlervorname=kvname;
        if (kname!=null)
            kuenstlername=kname;
        if (titel!=null)
            bildtitel=titel;
  
            enstehungsjahr=jahr;
        if (klasse!=null)
            klassifikation=klasse;
        
            hoehe=h;
       
            breit=b;
        if (med!=null)
            medium=med;
        if (thm!=null)
            thema=thm;
        if (verk!=null)
            verkauefername=verk;
        if (verka!=null)
            verkauferddresse=verka;
       
            maxkaufpreis=maxpreis;
       
            gewkaufpreis=gpreis;
        
        
    }
    public boolean verkaufen(java.util.Date vkdatum, String kaname, String kaadresse, float vkpreis){
        if (verkauft)return false;
        else {
            if (vkdatum!=null)
                verkaufsdatum=vkdatum;
            if (kaname!=null)
                kauefername=kaname;
            if (kaadresse!=null)
                kaueferadresse=kaadresse;
            
                verkaufspreis=vkpreis;
            boolean verkauft=true;
            return true;
        }
    }
    public Bild(String Kname, String Btitel){
        kuenstlername=Kname;
        bildtitel=Btitel;
    }
    public void output(){
        System.out.println(kuenstlername+"   "+bildtitel);

    }
}
