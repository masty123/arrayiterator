package ku.util;
import java.util.Scanner;
/**
 * This main class is for checking wheter the ArrayIterator store it correct or not.
 * @author Theeruth Bosiruth
 * @version 1.0
 * @since Feb 4, 2017
 */
public class Main {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in String[] : ");
        int length = Integer.parseInt(input.nextLine());
        String[] array = new String[length];
        for(int i=0;i<length;i++)
        {
            System.out.printf("array[%d] : ",i+1);
            array[i] = input.nextLine();
        }
        String choice = "";
        ArrayIterator test = new ArrayIterator(array);
        while(!choice.equals("q"))
        {
            System.out.print("(s)how  (n)ext (q)uit : ");
            choice = input.nextLine();
            switch(choice)
            {
                case "s": 
                    String[] arr = (String[]) test.getArray();
                     System.out.print("{");
                    for(int i=0;i<length;i++)
                    {
                        System.out.print(arr[i]);
                        if(i!=length-1)
                        {
                            System.out.print(" , ");
                        }
                    }
                    System.out.println("}");
                   
                    break;
                case "n" :
                    System.out.println("Current : "+test.next());
                    break;
                case "q" :
                    break;
                default :
                    break;
            }
        }
    }

}