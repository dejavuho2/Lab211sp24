
package controller;

import java.time.LocalDate;
import java.util.Scanner;

public class Validation {
    private Scanner sc = new Scanner(System.in);
    
    public String getWord() {
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                return "";
            }
        }
        return s;
    }
    
    public String getString(){
        return sc.nextLine();
    }
    
    public int getInt(){
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }
    
    public boolean checkBDate(LocalDate bDate){
        if(bDate.getYear()>1900) return true;
        return false;
    }
    
    public boolean checkEmail(String email){
        return email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    
    public boolean checkPhone(String phone) {
        if(phone.length()<10)   return false;
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkYearEx(int year){
        if(year>=0 && year <=100){
            return true;
        }
        return false;
    }
    
    public boolean checkRank(String rank) {
        String[] s = {"Excellence", "Good", "Fair", "Poor"};
        
        for (String str : s) {
            if (rank.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
