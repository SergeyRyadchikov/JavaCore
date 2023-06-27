package Application;
/* 
@author Sergey Ryadchikov
 */

import Model.InputClass;
import Model.OutputClass;

public class Main {
    public static void main(String[] args) {
        String userEnter = InputClass.userInput();
        OutputClass.output(userEnter);
    }
}
