/*

 */
package primenumbers;

import static sun.rmi.transport.TransportConstants.Return;

/**
 *
 * @author oyugi
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int Prime=0;
       int num=0;
       String PrimeNumbers="";
       {
           for(Prime= is PrimeNumbers <=500;Prime++)
           {
               int counter =0;
               for( num = Prime; num >=1;num--)
               {
                   for (num%Prime=0)
                   {
                       counter =counter +1;
                   }
               }
              if  (counter==2)
              {
                  //Append the PrimeNumbers to the String 
                  PrimeNumbers=PrimeNumbers+Prime+"";
                           
              }
             
           }
            System.out.println("PrimeNumbers from 1 to 500 are:");
            System.out.println("PrimeNumbers");
       }
       
    }
   public boolean is PrimeNumbers(int j){
       int Prime=0;
       for(j=2;j<Prime;j++){
           if(Prime%j==0){
               return;
           }
           if (j!=Prime){
           } else {
               return;
           }
       }
       return;
   } 
}