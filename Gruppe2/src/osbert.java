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
public class osbert {
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
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
                                
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break menu3;
                    }
                }
                
            }
    }
    
}
