package scanner;

import java.util.Scanner;

class nextScanner {
     public static void main(String[] args) {

         //creates an object of scanner
         Scanner input=new Scanner(System.in);
         System.out.println("Enter your Name: ");

         //reads the entire word
         String value=input.next();
         System.out.println("Using next(): " + value);
         input.close();

     }
}
