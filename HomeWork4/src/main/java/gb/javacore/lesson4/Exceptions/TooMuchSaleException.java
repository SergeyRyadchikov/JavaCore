package gb.javacore.lesson4.Exceptions;
/* 
@author Sergey Ryadchikov
 */

public class TooMuchSaleException extends RuntimeException{
    public TooMuchSaleException(String message) {
        super(message);
    }
}
