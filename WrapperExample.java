import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class WrapperExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = new Integer(5);
        int m = n;
        
        System.out.println("n " + n);
        System.out.println("m " + m);
        
        m = 6;
        System.out.println("n " + n);
        System.out.println("m " + m);
        
        n = m;
        System.out.println("n " + n);
        System.out.println("m " + m);        

        System.out.println("end of program");
    }
}
