/*
 * osbert.java
 *
 * Created on 4. Juni 2002, 17:42
 */

/**
 *
 * @author  ben
 * @version
 */
import java.util.*;
import java.io.*;
public class osbert {
    
    /**
     * @param args the command line arguments
     */
    //Lade DB
    // Haupt DB
    static BilderDB  BDB=new BilderDB();
    static ModeDB  MDB=new ModeDB();
    //Temp DB
    
    static int globalDatensatz=0;
    
    public static void main(String args[]) {
        
        
        try {
            FileInputStream istream = new FileInputStream("bdb.db");
            ObjectInputStream oin = new ObjectInputStream(istream);
            BDB=(BilderDB)oin.readObject();
            oin.close();
            FileInputStream i2stream = new FileInputStream("mdb.db");
            ObjectInputStream o2in = new ObjectInputStream(i2stream);
            MDB=(ModeDB)o2in.readObject();
            o2in.close();
        }
        catch (ClassNotFoundException CnF){
            System.out.println("Class Not Found");
        }
        catch (FileNotFoundException FnF){
            System.out.println("File Not Found");
        }
        catch (NotSerializableException nse){
            System.out.println("Not Serializable");
        }
        catch (IOException ioe){
            System.out.println("IO Exception");
        }
        
        
        
        
        System.out.println("---------------------");
        System.out.println("|Welcome to Ozzy 0.1|");
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("");
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.StreamTokenizer tokenReader= new java.io.StreamTokenizer(isr);
        tokenReader.lowerCaseMode(true);
        int checkToken=0;
        double inputToken=0;
        
        
        
        
        
        menu:
            while ( true ) {
                System.out.println("");
                System.out.println("");
                System.out.println("     Menü");
                System.out.println("---------------------");
                System.out.println("(1) Einkauf");
                System.out.println("");
                System.out.println("(2) Verkauf");
                System.out.println("");
                System.out.println("(3) Pflege");
                System.out.println("");
                System.out.println("(4) Beenden");
                System.out.println("---------------------");
                System.out.println("Bitte wählen Sie.");
                
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                
                if (tokenReader.TT_NUMBER==checkToken){
                    inputToken=tokenReader.nval;
                    
                    switch ((int)inputToken) {
                        
                        case 1:
                            menu1();
                            break;
                        case 2:
                            menu2();
                            break;
                        case 3:
                            menu3();
                            break;
                        case 4:
                            try {
                                FileOutputStream ostream = new FileOutputStream("bdb.db");
                                ObjectOutputStream oout = new ObjectOutputStream(ostream);
                                oout.writeObject(BDB);
                                oout.flush();
                                oout.close();
                                ostream.close();
                                FileOutputStream o2stream = new FileOutputStream("mdb.db");
                                ObjectOutputStream o2out = new ObjectOutputStream(o2stream);
                                o2out.writeObject(MDB);
                                o2out.flush();
                                o2out.close();
                                o2stream.close();
                                
                                
                            }
                            catch (FileNotFoundException FnF){
                                System.out.println("File Not Found");
                            }
                            catch (NotSerializableException nse){
                                System.out.println("Not Serializable");
                            }
                            catch (IOException ioe){}
                            break menu;
                    }
                }
                
            }
            
    }
    public static void menu1(){
        
        
        
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.StreamTokenizer tokenReader= new java.io.StreamTokenizer(isr);
        tokenReader.lowerCaseMode(true);
        int checkToken=0;
        double inputToken=0;
        menu1:
            while ( true ) {
                System.out.println("");
                System.out.println("");
                System.out.println("     Menü (1) Einkauf");
                System.out.println("---------------------");
                System.out.println("(1) Einkaufsbericht");
                System.out.println("");
                System.out.println("(2) Preisberechnung");
                System.out.println("");
                System.out.println("(3) Kauf eintragen");
                System.out.println("");
                System.out.println("(4) Zurück zum Hauptmenü");
                System.out.println("---------------------");
                System.out.println("Bitte wählen Sie.");
                
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                
                if (tokenReader.TT_NUMBER==checkToken){
                    inputToken=tokenReader.nval;
                    
                    switch ((int)inputToken) {
                        
                        case 1:
                        
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break menu1;
                    }
                }
                
            }
    }
    public static void menu2(){
        
        
        
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.StreamTokenizer tokenReader= new java.io.StreamTokenizer(isr);
        tokenReader.lowerCaseMode(true);
        int checkToken=0;
        double inputToken=0;
        menu2:
            while ( true ) {
                System.out.println("");
                System.out.println("");
                System.out.println("     Menü (2) Verkauf");
                System.out.println("---------------------");
                System.out.println("(1) Einkaufspreis anzeigen");
                System.out.println("");
                System.out.println("(2) Verkaufsbericht");
                System.out.println("");
                System.out.println("(3) Verkauf eintragen");
                System.out.println("");
                System.out.println("(4) Zurück zum Hauptmenü");
                System.out.println("---------------------");
                System.out.println("Bitte wählen Sie.");
                
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                
                if (tokenReader.TT_NUMBER==checkToken){
                    inputToken=tokenReader.nval;
                    
                    switch ((int)inputToken) {
                        
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break menu2;
                    }
                }
                
            }
    }
    public static void menu3(){
        
        
        
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.StreamTokenizer tokenReader= new java.io.StreamTokenizer(isr);
        tokenReader.lowerCaseMode(true);
        int checkToken=0;
        double inputToken=0;
        menu3:
            while ( true ) {
                System.out.println("");
                System.out.println("");
                System.out.println("     Menü (3) Pflege");
                System.out.println("---------------------");
                System.out.println("(1) BildDB edieren");
                System.out.println("");
                System.out.println("(2) ModeDB edieren");
                System.out.println("");
                System.out.println("(3) AuktionsDB neu laden");
                System.out.println("");
                System.out.println("(4) Zurück ins Hauptmenü");
                System.out.println("---------------------");
                System.out.println("Bitte wählen Sie.");
                
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                
                if (tokenReader.TT_NUMBER==checkToken){
                    inputToken=tokenReader.nval;
                    
                    switch ((int)inputToken) {
                        
                        case 1:
                            editbdb();
                            
                            break;
                        case 2:
                            editmdb();
                            
                            break;
                        case 3:
                            
                            break;
                            
                        case 4:
                            
                            break menu3;
                    }
                }
                
            }
    }
    public static void editbdbdata(int datensatz){
        globalDatensatz=datensatz;
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.StreamTokenizer tokenReader= new java.io.StreamTokenizer(isr);
        tokenReader.lowerCaseMode(true);
        int checkToken=0;
        int intToken=0;
        int i=0;
        int n=0;
        
        String stringToken=null;
        double inputToken=0;
        //Datenbank vornereiten
        //Iterator dbIter=BDB.Iterator();
        Iterator dbIter=BDB.iterator();
        
        editdata:
            while (true){
                System.out.println();
                System.out.println();
                System.out.println("Edieren eines Datensatzes");
                System.out.println();
                System.out.println("Geben Sie d ein um den ausgewählten Datensatz zu löschen.");
                System.out.println("Geben Sie e ein um den ausgewählten Datensatz zu bearbeiten.");
                
                System.out.println("Geben Sie x ein um in der Menühierachie eine Stufe nach oben zu gelangen.");
                
                dbIter=BDB.iterator();
                
                
                n=0;
                while ((dbIter.hasNext())&&n<datensatz){
                    n++;
                    dbIter.next();
                }
                if (n!=datensatz){
                    System.out.println("Datensatz "+datensatz+" nicht vorhanden.");
                    
                }
                System.out.print("Ausgewählter Datensatz:   ");
                
                ((Bild)(dbIter.next())).output();
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                if (tokenReader.TT_WORD==checkToken){
                    
                    stringToken=tokenReader.sval;
                    if (stringToken.equals("x"))break editdata;
                    else {
                        if (stringToken.equals("e")){
                            System.out.println("");
                            System.out.println("");
                            
                            System.out.println("");
                            System.out.println("Bitte den Vornamen des Künstlers eingeben.");
                            editString(1);
                            System.out.println("Bitte den Nachnamen des Künstlers eingeben.");
                            editString(2);
                            System.out.println("Bitte den Titel des Bildes eingeben.");
                            editString(3);
                            System.out.println("Bitte das Entstehungsjahr des Bildes eingeben.");
                            editInt(4);
                            System.out.println("Bitte die Klassifikation eingeben.");
                            editString(5);
                            System.out.println("Bitte die Höhe des Bildes in cm eingeben.");
                            editInt(6);
                            System.out.println("Bitte Breite des Bildes in cm eingeben.");
                            editInt(7);
                            System.out.println("Bitte das Medium des Bildes eingeben.");
                            editString(8);
                            System.out.println("Bitte das Thema des Bildes eingeben.");
                            editString(9);
                            System.out.println("Bitte das Einkaufjahreingeben.");
                            editInt(22);
                            System.out.println("Bitte den Einkaufstag eingeben.");
                            editInt(23);
                            System.out.println("Bitte den Einkaufsmonat eingeben.");
                            editInt(24);
                            
                            System.out.println("Bitte den kompletten Namen des Verkäufers eingeben.");
                            editString(10);
                            System.out.println("Bitte die Adresse des Verkäufer eingeben.");
                            editString(11);
                            System.out.println("Bitte den maximalen Kaufpreis eingeben.");
                            editFloat(12);
                            System.out.println("Bitte den Kaufpreis eingeben.");
                            editFloat(13);
                            System.out.println("Bitte den angestrebten Verkaufspreis eingeben.");
                            editFloat(14);
                            System.out.println("Wurde das Bild verkauft? <ja/nein>");
                            if (editBool(18)){
                                System.out.println("Bitte das Verkaufsjahr eingeben.");
                                editInt(19);
                                System.out.println("Bitte den Verkaufstag eingeben.");
                                editInt(20);
                                System.out.println("Bitte den Verkaufsmonat eingeben.");
                                editInt(21);
                                System.out.println("Bitte den kompletten Namen des Käufers eingeben.");
                                editString(15);
                                System.out.println("Bitte die Adresse des Käufers eingeben.");
                                editString(16);
                                System.out.println("Bitte den Verkaufpreis eingeben.");
                                editFloat(17);
                            }
                            
                            
                            //18
                            
                            
                            
                            
                        }
                        if (stringToken.equals("d")){
                            dbIter=BDB.iterator();
                            n=0;
                            while ((dbIter.hasNext())&&n<datensatz){
                                n++;
                                dbIter.next();
                            }
                            
                            BDB.remove(((Bild)(dbIter.next())));
                            break editdata;
                        }
                        else {
                            break editdata;
                        }
                    }
                    
                    
                }
                
                
                
            }
            
            
    }
    public static void editbdb(){
        
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.StreamTokenizer tokenReader= new java.io.StreamTokenizer(isr);
        tokenReader.lowerCaseMode(true);
        int checkToken=0;
        int intToken=0;
        int i=0;
        int n=0;
        
        String stringToken=null;
        double inputToken=0;
        //Datenbank vornereiten
        //Iterator dbIter=BDB.Iterator();
        Iterator dbIter=BDB.iterator();
        
        editbdb:
            while (true){
               
                System.out.println();
                System.out.println();
                System.out.println("Edieren der Bilderdatenbank");
                System.out.println();
                System.out.println("Geben Sie die Datensatznummer ein, die Sie bearbeiten wollen.");
                System.out.println("Geben Sie l ein um die Liste der Datensätze anzeigen zu lassen.");
                System.out.println("Geben Sie a ein um einen neuen Datensatz einzufügen.");
                
                System.out.println("Geben Sie x ein um in der Menühierachie eine Stufe nach oben zu gelangen.");
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                if (tokenReader.TT_WORD==checkToken){
                    stringToken=tokenReader.sval;
                    
                    if (stringToken.equals("x"))break editbdb;
                    else {
                        if (stringToken.equals("l")&&!(BDB.isEmpty())){
                            dbIter=BDB.iterator();
                            while (dbIter.hasNext()){
                                System.out.print(i++);
                                System.out.print("   ");
                                
                                ((Bild)(dbIter.next())).output();
                            }
                            i=0;
                            dbIter=BDB.iterator();
                            
                        }
                        if (stringToken.equals("a"))addbData();
                    }
                }
                
                
                
                if (tokenReader.TT_NUMBER==checkToken){
                    
                    dbIter=BDB.iterator();
                    intToken=(int)tokenReader.nval;
                    n=0;
                    
                    while ((dbIter.hasNext())&&n<intToken){
                        n++;
                        if (dbIter.hasNext())
                            dbIter.next();
                        
                    }
                    if (n!=intToken||(n==1&&!(dbIter.hasNext())))
                        System.out.println("Datensatz "+intToken+" nicht vorhanden.");
                    
                    
                    else{
                        if (dbIter.hasNext())
                            editbdbdata(intToken);
                        
                    }
                    
                    
                }
            }
    }
    public static void editmdb(){
        
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.StreamTokenizer tokenReader= new java.io.StreamTokenizer(isr);
        tokenReader.lowerCaseMode(true);
        int checkToken=0;
        int intToken=0;
        int i=0;
        int n=0;
        
        String stringToken=null;
        double inputToken=0;
        //Datenbank vornereiten
        //Iterator dbIter=BDB.Iterator();
        Iterator dbIter=MDB.iterator();
        
        editmdb:
            while (true){
              
                System.out.println();
                System.out.println();
                System.out.println("Edieren der Bilderdatenbank");
                System.out.println();
                System.out.println("Geben Sie die Datensatznummer ein, die Sie bearbeiten wollen.");
                System.out.println("Geben Sie l ein um die Liste der Datensätze anzeigen zu lassen.");
                System.out.println("Geben Sie a ein um einen neuen Datensatz einzufügen.");
                
                System.out.println("Geben Sie x ein um in der Menühierachie eine Stufe nach oben zu gelangen.");
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                if (tokenReader.TT_WORD==checkToken){
                    stringToken=tokenReader.sval;
                    
                    if (stringToken.equals("x"))break editmdb;
                    else {
                        if (stringToken.equals("l")&&!(MDB.isEmpty())){
                            dbIter=MDB.iterator();
                            while (dbIter.hasNext()){
                                System.out.print(i++);
                                System.out.print("   ");
                                
                                ((Kuenstler)(dbIter.next())).output();
                            }
                            i=0;
                            dbIter=MDB.iterator();
                            
                        }
                        if (stringToken.equals("a"))addmData();
                    }
                }
                
                
                
                if (tokenReader.TT_NUMBER==checkToken){
                    
                    dbIter=MDB.iterator();
                    intToken=(int)tokenReader.nval;
                    n=0;
                    
                    while ((dbIter.hasNext())&&n<intToken){
                        n++;
                        if (dbIter.hasNext())
                            dbIter.next();
                        
                    }
                    if (n!=intToken||(n==1&&!(dbIter.hasNext())))
                        System.out.println("Datensatz "+intToken+" nicht vorhanden.");
                    
                    
                    else{
                        if (dbIter.hasNext())
                            editmdbdata(intToken);
                        
                    }
                    
                    
                }
            }
    }
    public static void editmdbdata(int datensatz){
        globalDatensatz=datensatz;
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.StreamTokenizer tokenReader= new java.io.StreamTokenizer(isr);
        tokenReader.lowerCaseMode(true);
        int checkToken=0;
        int intToken=0;
        int i=0;
        int n=0;
        
        String stringToken=null;
        double inputToken=0;
        //Datenbank vornereiten
        //Iterator dbIter=BDB.Iterator();
        Iterator dbIter=MDB.iterator();
        
        editdata:
            while (true){
                System.out.println();
                System.out.println();
                System.out.println("Edieren eines Datensatzes");
                System.out.println();
                System.out.println("Geben Sie d ein um den ausgewählten Datensatz zu löschen.");
                System.out.println("Geben Sie e ein um den ausgewählten Datensatz zu bearbeiten.");
                
                System.out.println("Geben Sie x ein um in der Menühierachie eine Stufe nach oben zu gelangen.");
                
                dbIter=MDB.iterator();
                
                
                n=0;
                while ((dbIter.hasNext())&&n<datensatz){
                    n++;
                    dbIter.next();
                }
                if (n!=datensatz){
                    System.out.println("Datensatz "+datensatz+" nicht vorhanden.");
                    
                }
                System.out.print("Ausgewählter Datensatz:   ");
                
                ((Kuenstler)(dbIter.next())).output();
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                if (tokenReader.TT_WORD==checkToken){
                    
                    stringToken=tokenReader.sval;
                    if (stringToken.equals("x"))break editdata;
                    else {
                        if (stringToken.equals("e")){
                            System.out.println("");
                            System.out.println("");
                            
                            System.out.println("");
                            
                        }
                        if (stringToken.equals("d")){
                            dbIter=MDB.iterator();
                            n=0;
                            while ((dbIter.hasNext())&&n<datensatz){
                                n++;
                                dbIter.next();
                            }
                            
                            MDB.remove(((Kuenstler)(dbIter.next())));
                            break editdata;
                        }
                        
                    }
                    
                    
                }
                
                
                
            }
            
            
    }
    
    
    public static String liesString(String defaultString){
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.BufferedReader bufReader= new java.io.BufferedReader(isr);
        String stringToken=null;
        String returnString=null;
        
        System.out.println("Enter für <"+defaultString+">");
        
        
        try{
            stringToken=bufReader.readLine();
        }
        catch (java.io.IOException ioe){};
        
        
        if ((stringToken.length())!=0)returnString=stringToken;
        else returnString=defaultString;
        
        return returnString;
    }
    public static int liesInt(int defaultInt){
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.BufferedReader bufReader= new java.io.BufferedReader(isr);
        String stringToken=null;
        
        
        
        System.out.println("Enter für <"+defaultInt+">");
        
        
        try{
            stringToken=bufReader.readLine();
        }
        catch (java.io.IOException ioe){};
        
        Integer returnInt=new Integer(0);
        if ((stringToken.length())==0)return defaultInt;
        try {
            returnInt= new Integer(stringToken);
        }
        catch (NumberFormatException nfe){
            System.out.println("Das war wohl keine Zahl!");
            
        }
        return returnInt.intValue();
    }
    public static float liesFloat(float defaultFloat){
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.BufferedReader bufReader= new java.io.BufferedReader(isr);
        String stringToken=null;
        
        
        
        System.out.println("Enter für <"+defaultFloat+">");
        
        
        try{
            stringToken=bufReader.readLine();
        }
        catch (java.io.IOException ioe){};
        
        Float returnFloat= new Float(0);
        if ((stringToken.length())==0)return defaultFloat;
        try {
            returnFloat= new Float(stringToken);
        }
        catch (NumberFormatException nfe){
            System.out.println("Das war wohl keine Zahl!");
            
        }
        return returnFloat.floatValue();
    }
    public static boolean liesBool(boolean defaultBool){
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.BufferedReader bufReader= new java.io.BufferedReader(isr);
        String stringToken=null;
        Boolean returnBool=new Boolean(false);
        if (defaultBool==true)
            System.out.println("Enter für <ja>");
        else
            System.out.println("Enter für <nein>");
        
        try{
            stringToken=bufReader.readLine();
        }
        catch (java.io.IOException ioe){};
        
        
        if ((stringToken.length())==0)return defaultBool;
        if (stringToken.equals("ja"))returnBool=new Boolean(true);
        
        
        
        
        return returnBool.booleanValue();
    }
    
    
    
    
    public static void editString(int feld){
        Iterator dbIter=BDB.iterator();
        Iterator db2Iter=BDB.iterator();
        int n=0;
        while ((dbIter.hasNext())&&n<globalDatensatz){
            n++;
            dbIter.next();
            db2Iter.next();
        }
        
        ((Bild)(dbIter.next())).editString(feld,liesString(((Bild)(db2Iter.next())).getString(feld)));
        
    }
    public static void editInt(int feld){
        Iterator dbIter=BDB.iterator();
        Iterator db2Iter=BDB.iterator();
        int n=0;
        while ((dbIter.hasNext())&&n<globalDatensatz){
            n++;
            dbIter.next();
            db2Iter.next();
        }
        
        ((Bild)(dbIter.next())).editInt(feld,liesInt(((Bild)(db2Iter.next())).getInt(feld)));
        
    }
    public static boolean editBool(int feld){
        Iterator dbIter=BDB.iterator();
        Iterator db2Iter=BDB.iterator();
        int n=0;
        while ((dbIter.hasNext())&&n<globalDatensatz){
            n++;
            dbIter.next();
            db2Iter.next();
        }
        boolean tmpbool=liesBool(((Bild)(db2Iter.next())).getBool(feld));
        ((Bild)(dbIter.next())).editBool(feld,tmpbool);
        return tmpbool;
    }
    public static void editFloat(int feld){
        Iterator dbIter=BDB.iterator();
        Iterator db2Iter=BDB.iterator();
        int n=0;
        while ((dbIter.hasNext())&&n<globalDatensatz){
            n++;
            dbIter.next();
            db2Iter.next();
        }
        
        ((Bild)(dbIter.next())).editFloat(feld,liesFloat(((Bild)(db2Iter.next())).getFloat(feld)));
        
    }
    public static void addbData(){
        System.out.println();
        ((Bild)(BDB.addRet(new Bild()))).editBild(((String)(inputWrapper(1,null))),((String)(inputWrapper(2,null))),((String)(inputWrapper(3,null))),((Integer)(inputWrapper(4,new Integer(0)))).intValue(),((String)(inputWrapper(5,null))),((Integer)(inputWrapper(6,new Integer(0)))).intValue(),((Integer)(inputWrapper(7,new Integer(0)))).intValue(),((String)(inputWrapper(8,null))),((String)(inputWrapper(9,null))),((String)(inputWrapper(10,null))),((String)(inputWrapper(11,null))),((Float)(inputWrapper(12,new Float(0)))).floatValue(),((Float)(inputWrapper(13,new Float(0)))).floatValue(),((Float)(inputWrapper(14,new Float(0)))).floatValue(),((String)(inputWrapper(15,null))),((String)(inputWrapper(16,null))),((Float)(inputWrapper(17,new Float(0)))).floatValue(),((Integer)(inputWrapper(19,new Integer(0)))).intValue(),((Integer)(inputWrapper(20,new Integer(0)))).intValue(),((Integer)(inputWrapper(21,new Integer(0)))).intValue(),((Integer)(inputWrapper(22,new Integer(0)))).intValue(),((Integer)(inputWrapper(23,new Integer(0)))).intValue(),((Integer)(inputWrapper(24,new Integer(0)))).intValue());
        
    }
    public static void addmData(){
        java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
        java.io.BufferedReader bufReader= new java.io.BufferedReader(isr);
        String stringToken=null;
        String intToken=null;
        Integer returnInt=new Integer(0);
        System.out.println("Bitte Künstlernamen eingeben.");
        try{
            stringToken=bufReader.readLine();
        }
        catch (java.io.IOException ioe){};
        System.out.println("Bitte Modefaktor eingeben.");
        try{
            intToken=bufReader.readLine();
        }
        catch (java.io.IOException ioe){};
        
        try {
            returnInt= new Integer(intToken);
        }
        catch (NumberFormatException nfe){
            System.out.println("Das war wohl keine Zahl!");
            System.out.println("Bitte nochmal probieren!");
            return;
        }
        MDB.add (new Kuenstler(stringToken,returnInt.intValue()));
    }
    public static Object inputWrapper(int feld,Object defaultValue){
        Float floatRet=new Float(0);
        java.lang.Integer intRet=new Integer(0);
        java.lang.String stringRet=new java.lang.String();
        stringRet=null;
        boolean verkauft=false;
        float ekpreis=0;
        switch (feld){
            case 1:
                System.out.println("");
                System.out.println("Bitte den Vornamen des Künstlers eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 2:
                System.out.println("");
                System.out.println("Bitte den Nachnamen des Künstlers eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 3:
                System.out.println("");
                System.out.println("Bitte den Titel des Bildes eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 4:
                System.out.println("");
                System.out.println("Bitte das Entstehungsjahr des Bildes eingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
            case 5:
                System.out.println("");
                System.out.println("Bitte die Klassifikation eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 6:
                System.out.println("");
                System.out.println("Bitte die Höhe des Bildes in cm eingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
            case 7:
                System.out.println("");
                System.out.println("Bitte Breite des Bildes in cm eingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
            case 8:
                System.out.println("");
                System.out.println("Bitte das Medium des Bildes eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 9:
                System.out.println("");
                System.out.println("Bitte das Thema des Bildes eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 10:
                System.out.println("");
                System.out.println("Bitte den kompletten Namen des Verkäufers eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 11:
                System.out.println("");
                System.out.println("Bitte die Adresse des Verkäufer eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 12:
                System.out.println("");
                System.out.println("Bitte den maximalen Kaufpreis eingeben.");
                return new Float(liesFloat(0));
            case 13:
                System.out.println("");
                System.out.println("Bitte den Kaufpreis eingeben.");
                
                
                return new Float(liesFloat(0));
            case 14:
                System.out.println("");
                System.out.println("Bitte den angestrebten Verkaufspreis eingeben.");
                return new Float(liesFloat(0));
            case 15:
                System.out.println("");
                System.out.println("Bitte den kompletten Namen des Käufers eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 16:
                System.out.println("");
                System.out.println("Bitte die Adresse des Käufers eingeben.");
                return stringRet=liesString((String)(defaultValue));
            case 17:
                System.out.println("");
                System.out.println("Bitte den Verkaufpreis eingeben.");
                return new Float(liesFloat(0));
            case 18:
                System.out.println("");
                System.out.println("Wurde das Bild verkauft? (ja/nein)");
                return new Boolean(liesBool(((Boolean)(defaultValue)).booleanValue()));
                
            case 19:
                System.out.println("");
                System.out.println("Bitte das Verkaufsjahr eingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
            case 20:
                System.out.println("");
                System.out.println("Bitte den Verkaufstag eingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
            case 21:
                System.out.println("");
                System.out.println("Bitte den Verkaufsmonat eingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
            case 22:
                System.out.println("");
                System.out.println("Bitte das Einkaufjahreingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
            case 23:
                System.out.println("");
                System.out.println("Bitte den Einkaufstag eingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
            case 24:
                System.out.println("");
                System.out.println("Bitte den Einkaufsmonat eingeben.");
                return new Integer(liesInt(((Integer)(defaultValue)).intValue()));
                
                
        }
        return stringRet;
    }
}