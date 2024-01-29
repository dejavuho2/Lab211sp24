package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fresher extends Candidate {
    private String graduationRank,education;
    private LocalDate graduationDate;
    private static int count=1000;

    public Fresher(String fName, String lName, String address, String phone, String email, String bDate) {
        super(fName, lName, address, phone, email, bDate);
        this.setId("F"+String.valueOf(++count));
    }

    public Fresher(String graduationRank, String education, LocalDate graduationDate, String fName, String lName, String address, String phone, String email, int type, LocalDate bDate) {
        super(fName, lName, address, phone, email, type, bDate);
        this.graduationRank = graduationRank;
        this.education = education;
        this.graduationDate = graduationDate;
        this.setId("F"+String.valueOf(++count));
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduationDate() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(graduationDate);
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }
    
    @Override
    public String toString() {
        return String.format("%-5s %-5s | %-5s | %-10s | %-10s | %-10s | %-5d", this.getfName(), this.getlName(), this.getbDate(), this.getAddress(), this.getId(), this.getEmail(),this.getType());
    }
    
}
