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
    //Temp DB
    BilderDB TDB=new BilderDB();
    
    public static void main(String args[]) {
        
        
        try {
            FileInputStream istream = new FileInputStream("bdb.db");
            ObjectInputStream oin = new ObjectInputStream(istream);
            BDB=(BilderDB)oin.readObject();
            oin.close();
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
                System.out.println("(2) ModeDB neu laden");
                System.out.println("");
                System.out.println("(3) Zurück zum Hauptmenü");
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
                            
                            break;
                        case 3:
                            
                            break menu3;
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
        
        String stringToken=null;
        double inputToken=0;
        //Datenbank vornereiten
        //Iterator dbIter=BDB.Iterator();
        Iterator dbIter=BDB.iterator();
        editdb:
            while (true){
                System.out.println();
                System.out.println();
                System.out.println("Edieren der Bilderdatenbank");
                System.out.println();
                System.out.println("Geben Sie die Datensatznummer ein, die Sie bearbeiten wollen.");
                System.out.println("Geben Sie l ein um die Liste der Datensätze anzeigen zu lassen.");
                System.out.println("Geben Sie x ein um in der Menühierachie eine Stufe nach oben zu gelangen.");
                
                try{
                    checkToken=tokenReader.nextToken();
                }
                catch (java.io.IOException ioe){};
                
                if (tokenReader.TT_WORD==checkToken){
                    stringToken=tokenReader.sval;
                    if (stringToken.equals("x"))break editdb;
                    else {
                        if (stringToken.equals("l")){
                            while (dbIter.hasNext()){
                                System.out.print(i++);
                                System.out.print("   ");
                                
                                ((Bild)(dbIter.next())).output();
                            }
                            i=0;
                            dbIter=BDB.iterator();
                                
                        }
                        else {
                            break editdb;
                        }
                    }
                    
                    
                }
                if (tokenReader.TT_NUMBER==checkToken){
                    intToken=(int)tokenReader.nval;
                    
                    
                    
                    
                    
                }
            }
            
    }
}