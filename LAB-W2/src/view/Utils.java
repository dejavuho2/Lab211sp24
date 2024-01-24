
package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static String getString(String td){
        System.out.println(td+": ");
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    
    public static void print(String tt, ArrayList al){
        System.out.println(tt+"\n-------------------------------");
        for(Object o:al)    {System.out.println(o);}
        System.out.println("----------------------------------");
        System.out.println("Total "+ al.size());    
    }
}
