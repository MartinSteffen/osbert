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
    float kaufpreis=0;
    float anverkaufspreis=0;
    String kauefername="n/a";
    String kaueferadresse="n/a";
    float verkaufspreis=0;
    boolean verkauft=false;
    int verkaufsjahr;
    int verkaufstag;
    int verkaufsmonat;
    int einkaufsjahr;
    int einkaufstag;
    int einkaufsmonat;
    /** Creates new Bild */
    public Bild() {
        
    }
    public Bild(String kname){
        kuenstlername=kname;
    }
    public Bild(String kvname, String kname, String titel,int jahr,String klasse, int h, int b, String med, String thm, String verk, String verka, float maxpreis,float gpreis, float apreis){
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
        
        kaufpreis=gpreis;
        anverkaufspreis=apreis;
        
        
    }
    
    public Bild(String Kname, String Btitel){
        kuenstlername=Kname;
        bildtitel=Btitel;
    }
    public void editBild(String kvname, String kname, String titel,int jahr,String klasse, int h, int b, String med, String thm, String verk, String verka, float maxpreis,float gpreis, float apreis,String kauefer,String kadresse,float vkpreis,int vkjahr,int vktag,int vkmonat,int ekjahr,int ektag,int ekmonat){
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
        
        kaufpreis=gpreis;
        anverkaufspreis=apreis;
        kauefername=kauefer;
        kaueferadresse=kadresse;
        verkaufspreis=vkpreis;
        if (vkpreis!=0)verkauft=true;
        verkaufsjahr=vkjahr;
        verkaufstag=vktag;
        verkaufsmonat=vkmonat;
        einkaufsjahr=ekjahr;
        einkaufstag=ektag;
        einkaufsmonat=ekmonat;
        
    }
    
    
    public void output(){
        System.out.println(kuenstlername+"   "+bildtitel+" "+enstehungsjahr);
        
    }
    public void editString(int feld, String eintrag){
    /*
  1  String kuenstlervorname="n/a";
  2  String kuenstlername="n/a";
  3  String bildtitel="n/a";
  5  String klassifikation="n/a";
  8  String medium="n/a";
  9  String thema="n/a";
  10 String verkauefername="n/a";
  11 String verkauferddresse="n/a";
  15 String kauefername="n/a";
  16 String kaueferadresse="n/a";
     
     */
        switch (feld){
            case 1:
                kuenstlervorname=eintrag;
                break;
            case 2:
                kuenstlername=eintrag;
                break;
            case 3:
                bildtitel=eintrag;
                break;
            case 5:
                klassifikation=eintrag;
                break;
            case 8:
                medium=eintrag;
                break;
            case 9:
                thema=eintrag;
                break;
            case 10:
                verkauefername=eintrag;
                break;
            case 11:
                verkauferddresse=eintrag;
                break;
            case 15:
                kauefername=eintrag;
                break;
            case 16:
                kaueferadresse=eintrag;
                break;
                
                
                
                
        }
        
        return;
    }
    public void editInt(int feld,int eintrag){
     /*
      
  4  int enstehungsjahr=0;
  6  int hoehe=0;
  7  int breit=0;
  19 int verkaufsjahr;
  20 int verkaufstag;
  21 int verkaufsmonat;
  22 int einkaufsjahr;
  23 int einkaufstag;
  24 int einkaufsmonat;
      */
        switch (feld){
            case 4:
                enstehungsjahr=eintrag;
                break;
            case 6:
                hoehe=eintrag;
                break;
            case 7:
                breit=eintrag;
                break;
            case 19:
                verkaufsjahr=eintrag;
                break;
            case 20:
                verkaufstag=eintrag;
                break;
            case 21:
                verkaufsmonat=eintrag;
                break;
            case 22:
                einkaufsjahr=eintrag;
                break;
            case 23:
                einkaufstag=eintrag;
                break;
            case 24:
                einkaufsmonat=eintrag;
                break;
                
                
        }
        
        return;
    }
    public void editFloat(int feld,float eintrag){
    /*
     
  12 float maxkaufpreis=0;
  13 float gewkaufpreis=0;
  14 float anverkaufspreis=0;
  17 float verkaufspreis=0;
     
     */
        switch (feld){
            case 12:
                maxkaufpreis=eintrag;
                break;
            case 13:
                kaufpreis=eintrag;
                break;
            case 14:
                anverkaufspreis=eintrag;
                break;
            case 17:
                verkaufspreis=eintrag;
                break;
                
        }
        
        return;
    }
    public void editBool(int feld,boolean eintrag){
    /*
     
  18 boolean verkauft=false;
     */
        switch (feld){
            case 18:
                verkauft=eintrag;
                break;
                
        }
        
        return;
    }
    public String getString(int feld){
    /*
  1  String kuenstlervorname="n/a";
  2  String kuenstlername="n/a";
  3  String bildtitel="n/a";
  5  String klassifikation="n/a";
  8  String medium="n/a";
  9  String thema="n/a";
  10 String verkauefername="n/a";
  11 String verkauferddresse="n/a";
  15 String kauefername="n/a";
  16 String kaueferadresse="n/a";
     
     */
        switch (feld){
            case 1:
                return kuenstlervorname;
                
            case 2:
                return kuenstlername;
                
            case 3:
                return bildtitel;
                
            case 5:
                return klassifikation;
                
            case 8:
                return medium;
                
            case 9:
                return thema;
                
            case 10:
                return verkauefername;
                
            case 11:
                return verkauferddresse;
                
            case 15:
                return kauefername;
                
            case 16:
                return kaueferadresse;
                
                
                
                
                
        }
        
        return null;
    }
    public int getInt(int feld){
    /*
     
  4  int enstehungsjahr=0;
  6  int hoehe=0;
  7  int breit=0;
  19 int verkaufsjahr;
  20 int verkaufstag;
  21 int verkaufsmonat;
  22 int einkaufsjahr;
  23 int einkaufstag;
  24 int einkaufsmonat;
     */
        switch (feld){
            case 4:
                return enstehungsjahr;
                
            case 6:
                return hoehe;
                
            case 7:
                return breit;
                
            case 19:
                return verkaufsjahr;
                
            case 20:
                return verkaufstag;
                
            case 21:
                return verkaufsmonat;
            case 22:
                return einkaufsjahr;
                
            case 23:
                return einkaufstag;
                
            case 24:
                return einkaufsmonat;
                
        }
        
        return 0;
    }
    public float getFloat(int feld){
    /*
     
  12 float maxkaufpreis=0;
  13 float gewkaufpreis=0;
     
  17 float verkaufspreis=0;
     
     */
        switch (feld){
            case 12:
                return maxkaufpreis;
                
            case 13:
                return kaufpreis;
            case 14:
                return anverkaufspreis;
                
            case 17:
                return verkaufspreis;
                
                
        }
        
        return 0;
    }
    public boolean getBool(int feld){
    /*
     
  18 boolean verkauft=false;
     */
        switch (feld){
            case 18:
                return verkauft;
                
                
        }
        
        return false;
    }
    public Integer ekDatum(int feld){
    Integer retInt =new Integer(0);    
    switch (feld){
            case 1:
                return retInt=new Integer(einkaufsjahr);
            case 2:
                return retInt=new Integer(einkaufsmonat);
            case 3:
                return retInt=new Integer(einkaufstag);
                
            
        }
        
        return retInt;
    }
    public Integer vkDatum(int feld){
    Integer retInt =new Integer(0);    
    switch (feld){
            case 1:
                return retInt=new Integer(verkaufsjahr);
            case 2:
                return retInt=new Integer(verkaufsmonat);
            case 3:
                return retInt=new Integer(verkaufstag);
                
            
        }
        
        return retInt;
    }    
    
    
}
