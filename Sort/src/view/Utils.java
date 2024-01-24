
package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static int getInt(String td){
        System.out.println(td+": ");
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    
    public static void print(String tt, int[] al){
        System.out.println(tt+"\n-------------------------------");
        for(Object o:al)    {System.out.println(o);}
    }
    
}
