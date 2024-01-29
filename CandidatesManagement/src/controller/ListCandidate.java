package controller;

import model.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ListCandidate {
    private ArrayList<Experience> eList;
    private ArrayList<Fresher> fList;
    private ArrayList<Internship> iList;

    public ListCandidate() {
        this.eList=new ArrayList<>();
        this.fList=new ArrayList<>();
        this.iList=new ArrayList<>();
    }

    public ListCandidate(ArrayList<Experience> eList, ArrayList<Fresher> fList, ArrayList<Internship> iList) {
        this.eList = eList;
        this.fList = fList;
        this.iList = iList;
    }

    public ArrayList<Experience> geteList() {
        return eList;
    }

    public void seteList(ArrayList<Experience> eList) {
        this.eList = eList;
    }

    public ArrayList<Fresher> getfList() {
        return fList;
    }

    public void setfList(ArrayList<Fresher> fList) {
        this.fList = fList;
    }

    public ArrayList<Internship> getiList() {
        return iList;
    }

    public void setiList(ArrayList<Internship> iList) {
        this.iList = iList;
    }
    
    public void addExperience(Experience a){
        this.eList.add(a);
    }
    
    public void addFresher(Fresher a){
        this.fList.add(a);
    }
    
    public void addInternship(Internship a){
        this.iList.add(a);
    }
    
    public ArrayList<Experience> searchExperience(Predicate<Experience> p){
        ArrayList<Experience> rs = new ArrayList<>();
        for(Experience s:this.eList){
            if(p.test(s))   rs.add(s);
        }
        return rs;
    }
    
    public ArrayList<Fresher> searchFresher(Predicate<Fresher> p){
        ArrayList<Fresher> rs = new ArrayList<>();
        for(Fresher s:this.fList){
            if(p.test(s))   rs.add(s);
        }
        return rs;
    }
    
    public ArrayList<Internship> searchInternship(Predicate<Internship> p){
        ArrayList<Internship> rs = new ArrayList<>();
        for(Internship s:this.iList){
            if(p.test(s))   rs.add(s);
        }
        return rs;
    }
}
