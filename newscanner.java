package scanner;

import java.util.Scanner;

class newscanner {
     public static void main(String[] args) {
         Scanner obj=new Scanner(System.in) ;
         System.out.println("Enter your Name,Age and salary: ");
         String Name=obj.nextLine();
         int Age=obj.nextInt();
         double Salary=obj.nextDouble();
         System.out.println("Name: " + Name);
         System.out.println("Age: " + Age);
         System.out.println("Salary: " + Salary);
     }

}
