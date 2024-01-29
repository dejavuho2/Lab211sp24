
package view;

import controller.Validation;
import model.Experience;
import model.Fresher;
import model.Internship;
import test.Main;

public class Search {
    private Validation val = new Validation();
    public Search() {
        String name;
        int type;
        
        System.out.println("List of candidate: ");
        System.out.println("==========EXPERIENCE CANDIDATE==========");
        for(Experience a:Main.list.geteList()){
            System.out.println(a.getfName()+" "+a.getlName());
        }
        System.out.println("==========FRESHER CANDIDATE==========");
        for(Fresher a:Main.list.getfList()){
            System.out.println(a.getfName()+" "+a.getlName());
        }
        System.out.println("==========INTERNSHIP CANDIDATE==========");
        for(Internship a:Main.list.getiList()){
            System.out.println(a.getfName()+" "+a.getlName());
        }
        System.out.print("Input Candidate name (First name or Last name):  ");
        name = val.getWord();
        System.out.println("Input type of candidate: ");
        type= val.getInt();
        
        switch(type){
            case 0: for(Experience a:Main.list.searchExperience(p->(p.getfName()+p.getlName()).contains(name))){
                        System.out.println(a);
                    }
                    break;
            case 1: for(Fresher a:Main.list.searchFresher(p->(p.getfName()+p.getlName()).contains(name))){
                        System.out.println(a);
                    }
                    break;
            case 2: for(Internship a:Main.list.searchInternship(p->(p.getfName()+p.getlName()).contains(name))){
                        System.out.println(a);
                    }
                    break;
            default: System.out.println("Wrong type!!!");break;
        }

    }
    
}
