
package view;

import controller.ListCandidate;
import controller.Validation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static jdk.nashorn.internal.runtime.Debug.id;
import model.Experience;
import model.Fresher;
import model.Internship;
import test.Main;

public class Information {
    private String fName, lName, address, phone, email;
    private LocalDate bDate;
    private Validation val = new Validation();

    public Information(int type) {         
        while (true) {            
            System.out.print("First name: ");
            fName = val.getWord();
            if (fName == "") {
                Error.printErrorName();
            } else {
                break;
            }
        }
        
        while (true) {            
            System.out.print("Last name: ");
            lName = val.getWord();
            if (lName == "") {
                Error.printErrorName();
            } else {
                break;
            }
        }
        
        while (true) {            
            System.out.print("Date of birth: ");
            try{
                bDate = LocalDate.parse(val.getString(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }catch(Exception ex){
                Error.printError(ex.getMessage());
            }
            if (!val.checkBDate(bDate)) {
                Error.printErrorBDate();
            } else {
                break;
            }
        }
        
        System.out.print("Address: ");
        address = val.getString();
        
        while (true) {            
            System.out.print("Phone: ");
            phone = val.getString();
            if (!val.checkPhone(phone)) {
                Error.printErrorPhone();
            } else {
                break;
            }
        }
        
        while (true) {            
            System.out.println("Email: ");
            email = val.getString();
            if (!val.checkEmail(email)) {
                Error.printErrorEmail();
            } else {
                break;
            }
        }
        
        type--;
        
        switch (type) {
            case 0:
                ArrayList<String> proSkill = new ArrayList<>();
                int yearEx;
                while (true) {            
                    System.out.print("Year of experience: ");
                    yearEx = val.getInt();
                    if (!val.checkYearEx(yearEx)) {
                        Error.pirntErrorYearEx();
                    } else {
                         break;
                    }
                }
                do{
                    System.out.print("Professional Skill: ");
                    proSkill.add(val.getWord());
                    System.out.println("Want more to enter(Enter Y)");
                    String checked=val.getString();
                    if(!checked.equals("Y")){
                        break;
                    }
                }while(true);
                
                Main.list.addExperience(new Experience(yearEx,proSkill,fName,lName,address,phone,email,type,bDate));
                break;
            case 1:
                String graduationRank, education;
                LocalDate graduationDate;
                
                while (true) {            
                    System.out.print("Graduated time: ");
                    try{
                        graduationDate = LocalDate.parse(val.getString(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        break;
                    }catch(Exception ex){
                        Error.printError(ex.getMessage());
                    }
                }
                
                while (true) {                    
                    System.out.print("Rank of graduation: (Excellence, Good, Fair, Poor)");
                    graduationRank = val.getWord();
                    if (!val.checkRank(graduationRank)) {
                        Error.printErrorGraduationRank();
                    } else {
                        break;
                    }
                }
                
                System.out.print("University: ");
                education = val.getWord();
                
                Main.list.addFresher(new Fresher(graduationRank,education,graduationDate,fName,lName,address,phone,email,type,bDate));
                break;
                
            case 2:
                String major, semester, university;
                System.out.print("Majors: ");
                major = val.getWord();
                System.out.print("Semester: ");
                semester = val.getWord();
                System.out.print("University: ");
                university = val.getWord();
                
                Main.list.addInternship(new Internship(major,semester,university,fName,lName,address,phone,email,type,bDate));
                break;
        }
        
        System.out.println("ADD SUCCESS!!");
    }
}
