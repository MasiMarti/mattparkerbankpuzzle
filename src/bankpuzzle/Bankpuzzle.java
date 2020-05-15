package bankpuzzle;

public class Bankpuzzle {

    public static void main(String[] args) {
        
        int balA;
        int fdep;
        int balB;
        int sdep;
        int balC;
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                fdep = (i+1);
                sdep = (j+1);
                balA = fdep;
                balB = sdep + fdep;
                do{ 
                    count++;
                    balC = balA+balB;   
//                    System.out.println("a: " + balA + ". b: " + balB + ". c: " +balC);     //this line is for veryfing if you put manually the values for the first and second deposit instead of searching with the for loop
                    if(balC == 1000000){
                        System.out.println("first deposit = " + fdep + ". second deposit = " + sdep + ". c = " + balC + ". amount of days: " + count);
                        break;
                    }
                        
                    balA = balB;
                    balB = balC;
                    
                }while(balC < 1000000);
                count = 0;
            }
        }
    }
}
    
