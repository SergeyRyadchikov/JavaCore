package Model;
/* 
@author Sergey Ryadchikov
 */

import java.util.Scanner;

public class InputClass {



    public static String userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scan.nextLine();
        scan.close();
        return name;
    }
}
