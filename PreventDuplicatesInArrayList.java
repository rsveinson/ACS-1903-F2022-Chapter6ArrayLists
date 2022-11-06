import java.util.Scanner;
import java.util.ArrayList;
/**
 * Prevent duplicate elements in ArrayList
 */
public class PreventDuplicatesInArrayList
{
    public static void main(String[] args){
        ArrayList<String> people=new ArrayList();
        // add some names 
        Scanner kb = new Scanner(System.in);
        System.out.println("enter names followed"
            +" by the word stop: ");
        String name = kb.next();
        while (!name.equals("stop")) {
            if (!people.contains(name))
                people.add(name);
            name = kb.next();
        }
        // display the names in people
        for (String p: people)
            System.out.print(p+"  ");
    }
}
