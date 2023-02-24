package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Help extends Print {

    public int orderNumber() {
        boolean key = true;
        while (key) {
            System.out.println("Enter the number");
            try {
                Scanner number = new Scanner(System.in);
                int oNumber=number.nextInt();
                return oNumber;
            }catch (InputMismatchException e){
                return 0;
            }
        }
        return 0;
    }

}
