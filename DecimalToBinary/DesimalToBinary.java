
import java.util.Scanner;


public class DesimalToBinary {
    
     public int BinaryToint(int n){
      int n2;
      String answer="";
         while(n!=0){
            n2 = n%2;
            answer =  Integer.toString(n2) + answer;
               
            n = n/2;
         }
        System.out.println("The anser is :" +answer);
         
     return n;
     }

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DesimalToBinary run = new DesimalToBinary(); 
        int n;
         System.out.println("Decimal to Binary Converter");
         System.out.print("Enter Decimal number to :");
         n =  input.nextInt();
         run.BinaryToint(n);
         
     
    }
    
}
