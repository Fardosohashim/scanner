package scanner;

import java.util.Scanner;

class scanner {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter UserName");
        String UserName=myObj.nextLine();
        System.out.println("UserName is: " + UserName);
    }
}
