package controller;

import java.util.Random;
import model.Numberic;
import view.Menu;
import view.Utils;

public class SortApp extends Menu{
    private static String[] mc={"Sort","Search","Exit"};
    private Numberic number;
    private int quantity;

    public SortApp() {
        super("SORT&SEARCH",mc);
        number= new Numberic();
    }    
    
    public static void main(String[] args) {
        new SortApp().run();
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: sort();break;
            case 2: search();break;
            case 3: System.exit(0);
        }
    }
    
    public void getRandomValue(){
        int[] n=new int[quantity];
        Random r= new Random();
        for(int i=0;i<quantity;i++){
            n[i]= 1+r.nextInt(100);
        }
        number.setNum(n);
        Utils.print("Value",number.getNum());
    }
    
    public void sort(){
        String[] smc={"Buddle Sort","Quick Sort"};
        Menu a= new Menu("SORT",smc) {
            @Override
            public void execute(int ch) {
                switch(ch){
                    case 1: quantity=Utils.getInt("Enter number of array");getRandomValue();number.doSelfBuddle();Utils.print("Result",number.getNum());break;
                    case 2: quantity=Utils.getInt("Enter number of array");getRandomValue();number.doSelfQuick();Utils.print("Result",number.getNum());break;
                }
            }
        };
        a.run();
    }
    
    public void search(){
        String[] smc={"Linear Search","Binary Search"}; 
        Menu a= new Menu("Search",smc) {
            @Override
            public void execute(int ch) {
                switch(ch){
                    case 1: quantity=Utils.getInt("Enter number of array");getRandomValue();
                            int a= Utils.getInt("Enter search value");
                            Utils.print("The array", number.getNum());
                            System.out.println("Found "+a+" at index: "+number.linearSearch(a));
                            break;
                    case 2: quantity=Utils.getInt("Enter number of array");getRandomValue();
                            int b= Utils.getInt("Enter search value");
                            number.doSelfBuddle();
                            Utils.print("Sorted array", number.getNum());
                            System.out.println("Found "+b+" at index: "+number.binarySearch(b));
                            break;
                }
            }
        };
        a.run();
    }
}
