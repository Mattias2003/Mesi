import java.util.Scanner;
public class File1 {

    public static void main(String[] args) {
      int scelta = 0;
      System.out.println("Inserisci il numero del mese");
      Scanner in = new Scanner(System.in);
      scelta = in.nextInt();
      
      File1 f1 = new File1();
      
      switch (scelta){
        case 1: f1.printGennaio(in); 
                break;
        case 2: f1.printGennaio(in); 
                break;
        case 3: f1.printGennaio(in); 
                break;
        case 4: f1.printGennaio(in); 
                break;
        case 5: f1.printGennaio(in); 
                break;
        case 6: f1.printGennaio(in); 
                break;
        case 7: f1.printGennaio(in); 
                break;
        case 8: f1.printGennaio(in); 
                break;
        case 9: f1.printGennaio(in); 
                break;
        case 10: f1.printGennaio(in); 
                break;
        case 11: f1.printGennaio(in); 
                break;
        case 12: f1.printGennaio(in); 
                break;
        default: f1.stampaMessaggio("Funzionalità non prevista!");
      }
    }
    
    void stampaMessaggio(String m){
      System.out.println("gennaio");
    }

    void printGennaio(Scanner in){
      System.out.println("gennaio " ) ;
    }
    
    void printFebbraio(Scanner in){
       System.out.println("febbraio " ) ;
    }
    
    void printMarzo(Scanner in){
       System.out.println("marzo" ) ;
    }
    
    void printAprile(Scanner in){
       System.out.println("aprile" ) ;
    }
    
    void printMaggio(Scanner in){
      System.out.println("maggio" ) ;
    }
    
    void printGiugno(Scanner in){
       System.out.println("giugno " ) ;
    }

    void printLuglio(Scanner in){
       System.out.println("luglio" ) ;
    }

    void printAgosto(Scanner in){
       System.out.println("agosto" ) ;
    }

    void printSettembre(Scanner in){
       System.out.println("settembre" ) ;
    }

    void printOttobre(Scanner in){
       System.out.println("ottobre " ) ;
    }

    void printNovembre(Scanner in){
       System.out.println("novembre " ) ;
    }
    
    void printDicembre(Scanner in){
     System.out.println("diciembre" ) ;
    }

}