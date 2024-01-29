
package view;

public class Error {
    public static void printErrorName(){
        System.out.println("-----------------");
        System.out.println("Name just contain letters!!");
        System.out.println("-----------------");
    }
    
    public static void printError(String ex){
        System.out.println("-----------------");
        System.out.println(ex);
        System.out.println("-----------------");
    }
    
    public static void printErrorBDate(){
        System.out.println("-----------------");
        System.out.println("Year is more than 1900!!");
        System.out.println("-----------------");
    }
    
    public static void printErrorPhone(){
        System.out.println("-----------------");
        System.out.println("Phone just contain number and has at least 10 digits!!");
        System.out.println("-----------------");
    }
    
    public static void printErrorEmail(){
        System.out.println("-----------------");
        System.out.println("It should be <account name>@<domain>!!");
        System.out.println("-----------------");
    }
    
    public static void pirntErrorYearEx(){
        System.out.println("-----------------");
        System.out.println("Year of experience must be more than 0!!");
        System.out.println("-----------------");
    }
    
    public static void printErrorGraduationRank(){
        System.out.println("-----------------");
        System.out.println("Rank is one of: Excellence, Good, Fair, Poor!!");
        System.out.println("-----------------");
    }
}
